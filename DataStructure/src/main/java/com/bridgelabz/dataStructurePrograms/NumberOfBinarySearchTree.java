package com.bridgelabz.dataStructurePrograms;
import com.bridgelabz.util.*;
public class NumberOfBinarySearchTree {



	public static void main(String[] args) {

		System.out.println("Number of possible binary tree:");
		System.out.println("Enter the number of nodes:");
		int n = Utility.inputInteger();
		int t[ ] = new int [n+1];
		int res = countNumber(t,n);
		System.out.println("Possible numbers are:"+res);
	}

	private static int countNumber(int[] t , int n) {
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
		{
			t[0] = 1 ;
			t[1] = 1 ; 

			for(int i= 2 ; i<=n ; i++)
			{
				for(int j = 0 ; j<i ; j++)
				{
					t[i]+= t[j]*t[i-j-1]; //catalan number
				}

			}
		}
		return t[n];
	}

}
