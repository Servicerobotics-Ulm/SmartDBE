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
# This script collects the generated ini-file parts and combines them into single ini-files (one for each component artefact)
#

if [ -d src-gen/combined-ini-files ]; then
	# clean-up old combined-ini-files before they are generated again
	echo "clean-up src-gen/combined-ini-files subfolder"
	rm src-gen/combined-ini-files/*.ini
fi

# create subfolder combined-ini-files (if not yet created)
echo "create subfolder src-gen/combined-ini-files"
mkdir -p src-gen/combined-ini-files


# create ini-file RobotOperator.ini
echo "create ini-file RobotOperator.ini"
cp src-gen/system/RobotOperator.ini src-gen/combined-ini-files/
if [ -f src-gen/params/RobotOperator.ini ]; then
  cat src-gen/params/RobotOperator.ini >> src-gen/combined-ini-files/RobotOperator.ini
fi

# create ini-file Robotino.ini
echo "create ini-file Robotino.ini"
cp src-gen/system/Robotino.ini src-gen/combined-ini-files/
if [ -f src-gen/params/Robotino.ini ]; then
  cat src-gen/params/Robotino.ini >> src-gen/combined-ini-files/Robotino.ini
fi

# create ini-file SJMan.ini
echo "create ini-file SJMan.ini"
cp src-gen/system/SJMan.ini src-gen/combined-ini-files/
if [ -f src-gen/params/SJMan.ini ]; then
  cat src-gen/params/SJMan.ini >> src-gen/combined-ini-files/SJMan.ini
fi

# create ini-file SJNav.ini
echo "create ini-file SJNav.ini"
cp src-gen/system/SJNav.ini src-gen/combined-ini-files/
if [ -f src-gen/params/SJNav.ini ]; then
  cat src-gen/params/SJNav.ini >> src-gen/combined-ini-files/SJNav.ini
fi

# create ini-file SafetyOfficer.ini
echo "create ini-file SafetyOfficer.ini"
cp src-gen/system/SafetyOfficer.ini src-gen/combined-ini-files/
if [ -f src-gen/params/SafetyOfficer.ini ]; then
  cat src-gen/params/SafetyOfficer.ini >> src-gen/combined-ini-files/SafetyOfficer.ini
fi

# create ini-file WebotsLink.ini
echo "create ini-file WebotsLink.ini"
cp src-gen/system/WebotsLink.ini src-gen/combined-ini-files/
if [ -f src-gen/params/WebotsLink.ini ]; then
  cat src-gen/params/WebotsLink.ini >> src-gen/combined-ini-files/WebotsLink.ini
fi

