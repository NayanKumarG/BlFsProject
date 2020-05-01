#! /bin/bash

read -p "Enter number of flips:" n
count1=0
count2=0

for(( i=0;i<n;i++))
do
random=$(( $RANDOM % 10 ));
if [ $random -lt 5 ]
then
count1=$((++count1))
echo "head"
else
count2=$((++count2))
echo "tail"
fi
done

echo "head count:$count1"
echo "tail count:$count2"
avg=$(( count1*100/n ))
echo "percentage of head:$avg"
echo "percentage of tail:$((100-avg))"