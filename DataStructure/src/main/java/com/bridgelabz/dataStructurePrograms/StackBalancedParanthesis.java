package com.bridgelabz.dataStructurePrograms;
import com.bridgelabz.util.*;

//program to check balanced paranthesis
public class StackBalancedParanthesis {

	public static void main(String[] args) {
		System.out.println("Enter the Arithmetic expression:");
		String str = Utility.inputWord();
		boolean rs = isBalanced(str);
		if(rs)
			System.out.println("arithmetic expression is balanced:");
		else
			System.out.println("Arithmetic expression is not balanced:");
	}

	//to check paranthesis balanced or not
	private static boolean isBalanced(String str) {
		StackLinkedList<Character> sll = new StackLinkedList<>();
		for(int i = 0 ; i<str.length() ; i++)
		{
			char ch = str.charAt(i);
			if(ch=='{' || ch=='[' || ch=='(' )
			{
				sll.push(ch);
			}
			if(ch=='}' || ch==']' || ch==')' )
			{
				sll.pop();
			}
		}
		return sll.size()==0;	
	}

}
