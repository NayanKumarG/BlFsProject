#! /bin/bash

read -p "Enter the number of coupans:" n
echo "Enter $n coupan numbers between 10 "
while read line
do
    array=("${array[@]}" $line)
    if [ ${#array[@]} -eq $n ]
    then 
    break
    fi
done
echo ${array[@]}

count=0
while [ $n -ne 0 ]
do
random=$(( $RANDOM % 10 ));
echo "Random number generating:$random"
count=$((++count))

for ((i=0;i<$n;i++))
do

if [ ${array[$i]} -eq $random ]
then
array[$i]=${array[$n-1]}
unset array[$n-1]
n=$((--n))
break
fi
done

done

echo "Number of random numbers generated to make given distinct coupans:$count "
