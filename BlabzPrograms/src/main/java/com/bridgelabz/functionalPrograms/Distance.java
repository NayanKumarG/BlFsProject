package com.bridgelabz.functionalPrograms;
import com.bridgelabz.util.Utility;

//Program to find euclidean distance
public class Distance {

	public static void main(String[] args) {
		System.out.println("Euclidean distance:");
		System.out.println("Enter the x value:");
		int x = Utility.inputInteger();
		System.out.println("Enter the y value:");
		int y = Utility.inputInteger();
		Utility.euclidean(x,y);
	}
	}


