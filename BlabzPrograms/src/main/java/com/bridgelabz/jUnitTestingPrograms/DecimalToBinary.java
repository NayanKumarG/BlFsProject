package com.bridgelabz.jUnitTestingPrograms;
import com.bridgelabz.util.Utility;

//progrm to convert decimal to binary
public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println("Enter a decimal value:");
		int n = Utility.inputInteger();
		String s = Utility.decToBin(n);
		System.out.println("The binary of "+n+" is:"+s);
	}

}


