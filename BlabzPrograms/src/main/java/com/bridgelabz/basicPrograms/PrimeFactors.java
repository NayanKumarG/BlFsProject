package com.bridgelabz.basicPrograms;
import com.bridgelabz.util.Utility;

//program for prime factors
public class PrimeFactors {

	public static void main(String[] args) {

		System.out.println("Enetr a number:");
		int n = Utility.inputInteger();
		Utility.primeFactors(n);
		
	}

}
