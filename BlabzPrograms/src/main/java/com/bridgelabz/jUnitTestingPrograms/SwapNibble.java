package com.bridgelabz.jUnitTestingPrograms;
import com.bridgelabz.util.Utility;

//program to swap nibble
public class SwapNibble {

	public static void main(String[] args)
	{

		System.out.println("Enter a decimal value:");
		int n = Utility.inputInteger();
		String s = Utility.decToBin(n);
		System.out.println("The binary of "+n+" is:"+s);
		String str =swapNibble(s);
		System.out.println("After nibble swap:"+str);
		int n1 = Integer.parseInt(str);
		int dec = Utility.binToDec(n1);
		System.out.println("Decimal of "+str+" ="+dec);
		boolean b = checkPowerOfTwo(dec);
		if(b)
			System.out.println("The number "+dec+" is a power of 2");
		else
			System.out.println("The number "+dec+" is not a power of 2");
		

			}

			public static boolean checkPowerOfTwo(int dec) {
				if(dec==0)
				{
					return false;
				}
				while(dec!=1)
				{
					if(dec%2!=0)
						return false;
					dec=dec/2;
				}
				return true;
		
	}
			public static String swapNibble(String s) {
		      while(s.length()<8)
		      {
		    	  s="0"+s;
		      }
		     String str1 ="";
		     String str2 ="";
		     String str3 ="";
		      for(int i=0 ; i<s.length();i++)
		      {
		    	 if(i<4)
		    		 str1 = str1+s.charAt(i);
		    	 else
		    		 str2 = str2+s.charAt(i);
		    		 
		    	  }
		      str3 =(str2+str1);
		      return str3;
		      
		      
		      
			}
	}


