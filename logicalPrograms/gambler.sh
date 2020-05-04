#! /bin/bash

#Gambler problem

read -p "Enter the stake:" stake
read -p "Enter the goal:" goal
read -p "Enter the number of times to play:" n

winCount=0 
lossCount=0
betCount=0
t=$stake
		for((i=0;i<$n;i++))
    do
			while [ "$stake" -ne 0 ] && [ "$stake" -ne "$goal" ]
            do
				betCount=$((++betCount))
				if [ $(( $RANDOM % 10 )) -gt 5 ]
			then
					stake=$((++stake))
				
				else
				
					stake=$((--stake))
				fi

done
			if [ "$stake" -eq "$goal" ]
			then
				winCount=$((++winCount))
				stake=$t
			else
				lossCount=$((++lossCount))
				stake=$t
                fi
    done

    	echo "Number of wins ="$winCount
		echo "Number of loss ="$lossCount
		echo "Number of wins ="$betCount
		winPerc=$((winCount*100/n))
		echo "Percentage of wins ="$winPerc
		echo "Percentage of loss="$((100-winPerc))