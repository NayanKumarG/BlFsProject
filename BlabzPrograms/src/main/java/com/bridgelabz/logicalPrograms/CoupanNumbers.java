package com.bridgelabz.logicalPrograms;
import com.bridgelabz.util.Utility;

//program for coupan numbers
public class CoupanNumbers {

	public static void main(String[] args) {
	    System.out.println("Enter the size of an array");
	    int n = Utility.inputInteger();
	    int a[] = new int[n];
	    System.out.println("Enter the disticnct coupan values between 10");
	    Utility.createArray(a);
	    Utility.distinctCoupan(a);
	    
		}
	
      	}


