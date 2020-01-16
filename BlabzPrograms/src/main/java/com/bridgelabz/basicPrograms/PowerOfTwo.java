package com.bridgelabz.basicPrograms;
import com.bridgelabz.util.Utility;

//Program to find power of 2
public class PowerOfTwo {

	public static void main(String[] args) {
	     System.out.println("Power of Two");
	     System.out.println("Enter the n value");
	     int n = Utility.inputInteger() ;
	     if(n>=0 && n<=31)
	     {
	     for(int i = 0 ;i<=n ; i++)
	     {
	     	System.out.println("2^"+i+"="+Utility.pow(2,i));
	     }
	     }
	     else
	      System.out.println("Enter the integer between 0 to 31");

	     }
	}


