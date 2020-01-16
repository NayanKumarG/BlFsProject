package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.util.Utility;

//program for bubble sort
public class BubbleSort {

	public static void main(String[] args) {

		System.out.println("Bubble sort of integer:");
		System.out.println("Enter the size of an array:");
		int n = Utility.inputInteger();
		int a[ ] = new int [n];
		System.out.println("Enter the array elements:");
		Utility.createArray(a);
		Utility.bubbleSort(a);
		System.out.println("After bubble sorting:");
		Utility.printArray(a);

	}

}


