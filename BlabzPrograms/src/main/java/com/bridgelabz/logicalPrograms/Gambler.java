package com.bridgelabz.logicalPrograms;
import com.bridgelabz.util.Utility;

//program to simulate gambler
public class Gambler {

	public static void main(String[] args)
	{
	    System.out.println("Enter the stake:");
	    int stake = Utility.inputInteger();
	    System.out.println("Enter the goal:");
	    int goal = Utility.inputInteger();
	    System.out.println("Enter the number of times to play:");
	    int n =Utility.inputInteger();
	    Utility.gambler(stake,goal,n);
		}

		}


