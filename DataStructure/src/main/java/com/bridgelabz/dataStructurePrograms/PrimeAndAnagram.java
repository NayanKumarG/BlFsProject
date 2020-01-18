package com.bridgelabz.dataStructurePrograms;
import com.bridgelabz.util.*;

//numbers that are both prime and anagram
public class PrimeAndAnagram{
	static OrderedLinkedList<Integer> oll1 = new OrderedLinkedList<Integer>();
	static OrderedLinkedList<Integer> oll2 = new OrderedLinkedList<Integer>();
	public static void main(String[] args) {
		int a[] = new int[168];
		int res[][] = new int[2][168];
		int j = 0;
		
		//prime numbers between 1-1000:adding to an array
		System.out.println("Prime numbers between 1-1000");
		for(int i=0 ; i<=1000 ; i++)
		{
			if(Utility.isPrime(i))
			{
				a[j++] = i;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println();
		
		//adding anagram and not anagram numbers to linked list
		for(int i=0 ; i<a.length ; i++)
		{
			for(int k = 0 ; k<a.length ; k++)
			{

				if(Utility.isAnagram(a[i], a[k]) && a[i]!=a[k])
				{
					oll1.add(a[i]);
					break;
				}
				if(k==a.length-1)
				{
					oll2.add(a[i]);
				}

			}
		}


		//adding list values into 2D array
		int n1=0,n2=0;
		for(int i= 0 ; i<res.length ; i++)
		{
			for(int k = 0 ; k<res[i].length ; k++)
			{
				if(i==0 && n1<oll1.size())
				{
					res[i][k] = oll1.get(n1++);
				}
				else if(i==1 && n2<oll2.size())
					res[i][k] = oll2.get(n2++);
			}
		}

		//displaying the result
		for(int i= 0 ; i<res.length ; i++)
		{
			if(i==0)
				System.out.println("Prime numbers that are anagram between 1-1000");
			if(i==1)
				System.out.println("Prime numbers that are not anagram between 1-1000");

			for(int k = 0 ; k<res[i].length ; k++)
			{
				if(res[i][k]==0)
					break;
				System.out.print(res[i][k]+" ");
			}
			System.out.println();
			System.out.println();
		}
	}
}