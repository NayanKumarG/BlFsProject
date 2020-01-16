package com.bridgelabz.basicPrograms;
import com.bridgelabz.util.Utility;

//Program for Harmonic number
public class HarmonicNumbers {

	public static void main(String[] args) {
		System.out.println("Harmonic Number:");
		System.out.println("Enter the value n,,for nth harmonic number");
		int n = Utility.inputInteger();
		double rs = Utility.harmonicNumber(n);
		System.out.println(rs);
	}
	
	
}
