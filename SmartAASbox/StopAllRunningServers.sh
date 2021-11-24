echo "--------------------Before"
ps aux | grep "java -jar ${SMART_ROOT_ACE}/SmartAASbox/smartmdsd2aas.jar"
pkill -f "java -jar ${SMART_ROOT_ACE}/SmartAASbox/smartmdsd2aas.jar"
sleep 3
echo "--------------------After"
ps aux | grep "java -jar ${SMART_ROOT_ACE}/SmartAASbox/smartmdsd2aas.jar"
