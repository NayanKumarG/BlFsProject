package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.util.Utility;

public class MergeSort {

	public static void main(String[] args) {

		System.out.println("Insertion sort of Strings:");
		System.out.println("Enter the size of an array:");
		int n = Utility.inputInteger();
		String str[] = new String[n];
		System.out.println("Enter the elements for array");
		for(int i = 0 ;i<str.length ; i++)
		{
			str[i] = Utility.inputWord();
		}
		System.out.println("Before mergesort");
		for(int i=0 ; i<str.length ;i++)
		{
			System.out.print(str[i]+" ");
		}
		System.out.println();
		
		int l=0 , h = str.length-1;
		divideArray(str,l,h);
		
		System.out.println("After merge sort:");
		for(int x=0 ; x<str.length ; x++)
		{
			System.out.println(str[x]+" ");
		}	
	}

	
	private static void divideArray( String [] str , int l, int h) {
		if(l<h)
		{
			int middle = (l+h)/2;
			divideArray(str , l , middle);
			divideArray(str, middle+1 , h);
			mergeArray(str , l , middle , h);
		}

	}

	private static void mergeArray(String str[] , int l, int middle, int h) {
		int i = l;
		int j = middle+1;     
		int k = l;
		
		String res[] =new String[str.length];
		/*for(int  q = l ; q<middle ; q++)
		{
			res[q] = str[l+q];
		}
		for(int  r = j ; r<h ; r++)
		{
			res[r] = str[middle+1+r];
		}*/

		while(i<= middle && j<=h)
		{
			if(str[i].compareToIgnoreCase(str[j]) < 0)
			{
				res[k++] = str[i++];

			}
			else
			{
				res[k++] = str[j++];
			}

		}
		if(i>middle)
		{
			while(j<=h)
			{
				res[k++] = str[j++];
			}
		}
		else
		{
			while(i<=middle)
			{
				res[k++] = str[i++];
			}
		}
		for(int x=0 ;x<=k ; x++)
		{
			str[x] = res[x];
		}
	}
	}


