package com.bridgelabz.dataStructurePrograms;
import com.bridgelabz.util.*;

import java.util.HashMap;
import java.util.Map;

public class BankingQueueDemo {

	static MyQueue<String> withdrawqueue = new MyQueue<String>();
	static MyQueue<String> depositqueue = new MyQueue<String>();
	static Map<String , Long>  mp = new HashMap<String , Long>();

	public static void main(String[] args) {
		System.out.println("Enter the number of users");
		int n = Utility.inputInteger();
		System.out.println("Enter the user name and account balance");
		for(int i = 0 ; i<n ; i++)
		{
            System.out.print("User"+(i+1)+" Name:");
			String un = Utility.inputWord();
			
			System.out.print("Balance:");
			long balance = Utility.inputLong();
			mp.put(un , balance);
		}
		System.out.println();
		service(n);
	}

	private static void service(int n) {
		System.out.println("-------Banking service---------");
		for(int i = 0 ;i < n ;i++)
		{
			System.out.println("enter the user name");
			String user = Utility.inputWord();
			userChoice(user);
		}
	}
		private static void userChoice(String user)
		{
			System.out.println(user+" Enter the choice:");
			System.out.println("1.Deposit"+ "\n"+"2.Withdraw"+"\n"+"3.Exit");
			int choice = Utility.inputInteger();
			switch(choice)
			{
			
			case 1 :checkBalance(user);
					System.out.println("Enter the amount to deposit");
					long amt = Utility.inputLong();
					deposit(user,amt);
					System.out.println(user+" you wants to continue  Y/N");
					String s = Utility.inputWord();
					if(s.equalsIgnoreCase("Y"))
						userChoice(user);
					else
					
						depositqueue.dequeue();
					
					break;
			case 2 :checkBalance(user);
			long wd=0;
			do {
			        System.out.println("enter the amount to withdraw");
			    	 wd = Utility.inputLong();
			        
			}while(!(wd<=mp.get(user)));
			withdraw(user,wd);
			System.out.println(user+" you wants to continue  Y/N");
			String s1 = Utility.inputWord();
			if(s1.equalsIgnoreCase("Y"))
				userChoice(user);
			else
			
				depositqueue.dequeue();
			break;
			
			case 3 :break;
			default:System.out.println("Enter the correct choice:");
			}
	
		}
	
		
		//method to deposit money
		private static void deposit(String user , long amt)
		{
			depositqueue.enqueue(user);
			long newamount = mp.get(user)+amt;
			mp.put(user , newamount);
			System.out.println("Now your account balance is:"+mp.get(user));
		}
		
		//method to withdrw money
		private static void withdraw(String user , long money)
		{
			withdrawqueue.enqueue(user);
			long newamount = mp.get(user)-money;
			mp.put(user ,  newamount);
			System.out.println("Your balance is:"+mp.get(user));
		}
		
		//method to check user balance
		private static void checkBalance(String user)
		{
			if(mp.containsKey(user))
			{
System.out.println(user+" your balance is "+mp.get(user));
			}
		}
}
