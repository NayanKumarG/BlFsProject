#! /bin/bash

#stop watch

now=$(date +"%s")

echo "$now"

		echo "Press s to stop"
        read str
		
		if [ "$str"=="s" ]
		then
		endTime=$(date +"%s")
		elapsedTime=$((endTime-now))
        echo "Elapsed Time:"$elapsedTime" sec"
		fi