package com.bridgelabz.algorithmPrograms;
import java.util.Arrays;

import com.bridgelabz.util.Utility;

//program for binary search from word list
public class BinarySearch {

	public static void main(String[] args) {
		System.out.println("Enter the file path");
		String path=Utility.inputWords();
		String str=Utility.getFromFile(path);
		String a[] = null;

		a = str.split(",");

		Arrays.sort(a);
		System.out.println("List of words:");
		for(int i= 0 ;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Enter a string:");
		String s = Utility.inputWord();
		boolean b = Utility.stringBinarySearch(a , s);
		if(b)
			System.out.println("Given string is found");
		else
			System.out.println("Given string is not found");


	}
}




