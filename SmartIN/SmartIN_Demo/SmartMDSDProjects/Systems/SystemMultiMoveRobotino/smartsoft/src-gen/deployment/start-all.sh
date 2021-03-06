#!/bin/bash
#--------------------------------------------------------------------------
# Code generated by the SmartSoft MDSD Toolchain
# The SmartSoft Toolchain has been developed by:
#  
# Service Robotics Research Center
# University of Applied Sciences Ulm
# Prittwitzstr. 10
# 89075 Ulm (Germany)
#
# Information about the SmartSoft MDSD Toolchain is available at:
# www.servicerobotik-ulm.de
#
# Please do not modify this file. It will be re-generated
# running the code generator.
#--------------------------------------------------------------------------
#
# Script to start all components on all devices
#

PID_FILE="/var/tmp/start-all.pid"
SCRIPT_DIR=`pwd`
SCRIPT_NAME=start-all.sh



case "$1" in

start)
	true > $PID_FILE
	
	echo "Starting all devices ..."
	
	echo "Starting 127.0.0.1"
	xterm -fg red -title "127.0.0.1" -e 'echo;echo "Starting local session ..."; echo;echo;cd /tmp/SystemMultiMoveRobotino.deployment; pwd; bash --login -i -e start-LocalhostTarget.sh start' &
	echo $! >> $PID_FILE
	
;;

stop)
	echo "Stopping all devices"
	
	echo "Stopping 127.0.0.1"
	xterm -title "stopping 127.0.0.1" -e 'echo;echo "Starting local session ..."; echo;echo;cd /tmp/SystemMultiMoveRobotino.deployment; pwd; bash --login -i -e start-LocalhostTarget.sh stop'
	echo $! >> $PID_FILE
	
	
## just to make sure:
sleep 2
cut -d '"' -f2 $PID_FILE |
while read number
do
	echo $number
	kill -9 $number
done < $PID_FILE
rm $PID_FILE
;;

menu-start)
	bash $SCRIPT_NAME start
	cd $SCRIPT_DIR
	bash $SCRIPT_NAME menu
;;


menu-stop)
	bash $SCRIPT_NAME stop
	cd $SCRIPT_DIR
	bash $SCRIPT_NAME menu
;;


menu-tile)
	bash tiler.sh
	cd $SCRIPT_DIR
	bash $SCRIPT_NAME menu
;;


menu)
	ACTION=$(whiptail --title "Scenario Control" --menu "Choose an option" 12 40 4 "menu-start" "Start Scenario" "menu-stop" "Stop Scenario" "menu-tile" "Arrange terminals" "quit" "Quit to console" 3>&1 1>&2 2>&3)

	cd $SCRIPT_DIR
	bash $SCRIPT_NAME $ACTION
;;

quit)
	bash $SCRIPT_NAME stop
;;

*)
	echo "No such parameter: $1"
	echo "Usage: $SCRIPT_NAME {start|stop|menu-start|menu-stop|menu}"
;;

esac

