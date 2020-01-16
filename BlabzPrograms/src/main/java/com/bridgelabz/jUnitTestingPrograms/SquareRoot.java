package com.bridgelabz.jUnitTestingPrograms;
import com.bridgelabz.util.Utility;

//program to find square root of a number
public class SquareRoot {

	public static void main(String[] args) {

		System.out.println("Enter a non negative number:");
		int c = Utility.inputInteger();
		int rs = Utility.sqrtNewton(c);
		System.out.println("Square root of"+" "+c+" = "+rs);

	}
	}


