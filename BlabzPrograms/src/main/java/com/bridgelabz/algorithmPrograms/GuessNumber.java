package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.util.*;

//program to find guessed number
public class GuessNumber {

	public static void main(String[] args) {
		System.out.println("Enter the range:");
		int n = Utility.inputInteger();
		System.out.println("Guess a number between 0 and "+(n-1));
		guessNumber(0 , n-1);
	}

	//to check guess number
	public static void guessNumber(int low , int high) 
	{
		
	if(low==high)
	{
		System.out.println("Guessed number is:"+low);
		System.out.println("Intermediary nubers are "+(low-1)+" and "+(low+1));
		return;
	}
	
	//finding middle value of given range
	int mid = (low+high)/2;
	System.out.println("Enter true if guessed number between "+low+" and "+mid);
	System.out.println("Enter false if guessed number between "+(mid+1)+" and "+high);
	String t = Utility.inputWord();
	
	//if true find the number between first 0 to middle
	if(t.equalsIgnoreCase("true"))
	{
		guessNumber(low,mid);
	}
	
	//if false find the number between mid+1 to high
	else if(t.equalsIgnoreCase("false"))
	{
		guessNumber(mid+1 , high);
	}
	}

}
