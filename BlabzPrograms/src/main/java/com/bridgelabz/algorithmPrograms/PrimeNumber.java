package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.util.Utility;

//program to print prime numbers between given range
public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the range:");
		int n = Utility.inputInteger();
		boolean b;
		for(int  i = 0 ; i<=n ; i++)
		{
		b=Utility.isPrime(i);
		if(b)
		{
		System.out.print(i+" ");
		}
		}
			}

	}
	


