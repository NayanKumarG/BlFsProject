package com.bridgelabz.algorithmPrograms;

import java.util.ArrayList;

import com.bridgelabz.util.Utility;

public class GenericsBubbleSort {

	public static void main(String[] args) {
		ArrayList <Integer> al =new ArrayList<Integer>();
		System.out.println("Enter the size of an array:");
		int n = Utility.inputInteger();
		int a[] = new int[n];
		System.out.println("Enter array elements");
		Utility.createArray(a);
		System.out.println("After bubble sort");

		al= Utility.genericBubbleSort(a);
		System.out.println(al);

	}

}
