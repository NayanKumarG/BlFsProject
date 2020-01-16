package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.util.Utility;

//program for insertion sort
public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("Insertion sort of Strings:");
		System.out.println("Enter the size of an array:");
		int n = Utility.inputInteger();
		String str[] = new String[n];
		System.out.println("Enter the elements for array");
		Utility.createStringArray(str);
		Utility.insertionSort(str);
		System.out.println("After insertion sort:");
	    Utility.printStringArray(str);
	    
			}


	}


