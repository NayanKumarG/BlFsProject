#! /bin/bash

read -p "Enter a number to find prime factors:" n

while [ $((n%2)) -eq 0 ]
do
echo "2"
n=$((n/2))
done

a=$(awk -v x=$n 'BEGIN{print sqrt(x)}')
for ((i=3;i<=$a;i=i+2)) 
do
while [ $((n%i)) -eq 0 ]
do
echo "$i"
n=$((n/i))
done
done

if [ $n -gt 2 ]
then
echo "$n"
fi


