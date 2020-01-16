package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.util.Utility;

//
public class StringPermutation {

	public static void main(String[] args) {
		System.out.println("Enter a string:");
        String str  = Utility.inputWord();
        System.out.println("Permutation of "+str+" using recursive method:");
        String res = "";
        recursiveString(str , res);
        
	}
    
	//recursive method to find string permutations
	private static void recursiveString(String str , String res) {
		
		if(str.length()==0)
		{
			System.out.print(res+" ");
			return;
		}
		for(int i = 0 ; i<str.length( ) ; i++)
		{
			char ch= str.charAt(i);
			String rest = str.substring(0, i) + str.substring(i+1);
			recursiveString(rest , res+ch);
			
		}
	}

}
