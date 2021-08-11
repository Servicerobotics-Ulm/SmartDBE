JarFile=$1
JarFileCommand="java -jar ${JarFile}"
pkill -f "$JarFileCommand"
sleep 2s
for LaunchNumber in 1 2 3 4 5 6 7 8 9 10
do
	java -jar "$JarFile" &
	echo "${JarFile} || Magic Launch #$LaunchNumber"
	sleep 2s
	Candidates=$(ps aux | grep "$JarFile")
	if [[ $Candidates == *"$JarFileCommand"* ]]; then
	  echo "${JarFile} || Magic Launch OK!"
	  break
	fi
done
