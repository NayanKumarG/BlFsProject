package com.bridgelabz.dataStructurePrograms;
import com.bridgelabz.util.*;
public class AnagramQueue {
static MyQueue<Integer> mq = new MyQueue<Integer>();
	public static void main(String[] args) {
		int a[] = new int [168];
		int j = 0;
		for (int i = 0 ; i<=1000 ; i++ )
		{
			if(Utility.isPrime(i))
			{
				a[j++] = i;
			}
		}

		for(int i=0 ; i<a.length ; i++)
		{
			for(int k = 0 ; k<a.length ; k++)
			{

			if(Utility.isAnagram(a[i], a[k]) && a[i]!=a[k])
			{
				mq.enqueue(a[i]);
				break;
			}
			}
		}
		System.out.println("Anagram numbers that are primes between 1-1000:");
		System.out.println(mq);
	
	}	
	}
	


