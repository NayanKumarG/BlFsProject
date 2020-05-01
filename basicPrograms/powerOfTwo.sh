#! /bin/bash

#Shell script to print power 2
echo "Power of two"
read -p "Enter a range:" range
function powerOfTwo()
{
for((i=0; i<=range ; i++))
do 
result=$((2**$i))
echo "2^$i:$result" 
done
}
powerOfTwo