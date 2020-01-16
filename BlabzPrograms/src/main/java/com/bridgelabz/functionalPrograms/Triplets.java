package com.bridgelabz.functionalPrograms;
import com.bridgelabz.util.Utility;

//Program to find triplets which adds to zero
public class Triplets {

	public static void main(String[] args) {
		System.out.println("Enter the size of an array:");
		int n = Utility.inputInteger();
		int a[] = new int[n];
		System.out.println("Enter the Array elements:");
	    Utility.createArray(a);
	    Utility.triplet(a);
	}
}
