package com.bridgelabz.basicPrograms;
import com.bridgelabz.util.Utility;

//Program for leap year
public class LeapYear {

	public static void main(String[] args) {
		 System.out.println("Enter a year:");
	     int n = Utility.inputInteger();
	     int count=0,t=n;
	     
	     //Count the number of digit
	     while(n>0)
	     {
	    	 count++;
	    	 n=n/10;
	    	 
	     }
	     if(count==4)
	     {
	    	 boolean b = Utility.leapYear(t);
	    	 if(b)
	    	 {
	    		 System.out.println("Given year is a leap year:");
	    	 }
	    	 else
	    		 System.out.println("Given year is not a leap year:");
	     }
	     else
	    	 System.out.println("Enter a 4 digit year");
	}

}
