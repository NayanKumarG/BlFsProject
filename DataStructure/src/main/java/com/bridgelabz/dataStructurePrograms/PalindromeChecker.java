package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.util.Utility;

public class PalindromeChecker {
	 static DeQueue<Character> dq = new DeQueue<>();
	 
	public static void main(String[] args) {
		
       
        System.out.println("Enter a string");
        String str = Utility.inputWord();
       boolean b = palindromeChecker(str);
       if(b)
    	   System.out.println("Given string is Palindrome"); 
       else
    	   System.out.println("Not a palindrome:");
       
	}

	//palindrome checking by removing item from both side
	private static boolean palindromeChecker(String str) {
		 for(int i = 0 ;i<str.length() ; i++)
	        {
	        	char ch = str.toLowerCase().charAt(i);
	        	dq.addFront(ch);
	        }
	        System.out.println(dq);

	        while(!dq.isEmpty())
	        {
	        	if(dq.front !=dq.rear)
	        	{
	        	if(!(dq.removeFront()==dq.removeRear()))
	        	{
	        		return false;
	        	}
	        	}
	        	else
	        		dq.removeFront();
	        	
	        }
	        return true;
	        
	        //palindrome checking by removing from rear
	      /* for(int i = str.length()-1 ; i>=0; i--)
	        {
	        	if(str.charAt(i)==dq.removeRear())
	        	{
	          if(dq.isEmpty()) {
	        	 return true;
	        
	        }
	        	}
	        	else
	        	{
	        		
	        		return false;
	        	}
	        }
	        
	        //palindrome checking removing values from front
	       /* for(int i = 0 ; i<str.length() ; i++)
	       {
	       	//System.out.println(dq.removeFront());
	       	//System.out.println(dq);
	       	if(str.charAt(i)==dq.removeFront())
	       	{
	         if(dq.isEmpty()) {
	       return true;
	       }
	       	}
	       	else
	       	{
	       		return false;
	       	}
	       
	       
	       
	       } */
		
	

}
}
