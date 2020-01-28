package com.bridgelabz.oop.controller;
import com.bridgelabz.oop.model.StockAccountModel;
import com.bridgelabz.oop.service.StockAccountInf;
import com.bridgelabz.oop.serviceimpl.StockAccountImpl;
import com.bridgelabz.util.*;

/*
 * program to manage stock account
 */
public class StockAccount {
	private static StockAccountModel saModel;
	
	public static void main(String[] args) {
		StockAccountInf saccount = new StockAccountImpl();
		saModel = new StockAccountModel();
		System.out.println("Stock Account Management:");
		int choice;
		char c;
		boolean flag;
		do
		{
		System.out.println("Enter a choice:");
		System.out.println("1.Check company stocks \n"+"2.Create Account\n"+"3.Buy share \n"+"4.sell\n"+"5.Check report\n"+"6.Exit");
		choice = Utility.inputInteger();
		switch (choice) 
		{
		case 1:saccount.checkShare();
			break;
		case 2:
			do
			{
			System.out.println("Enter user name:");
			String user = Utility.inputWord();
			if(saccount.checkUser(user))
			{
				System.out.println("Username already exist!! try another");
		
				flag = false;
			}
			else
			{
				saModel.setName(user);
				System.out.println("Enter amount:");
				saModel.setAmount(Utility.inputLong());
				saccount.createAccount(saModel);
				System.out.println("Account created successfully:");
				flag = true;
			}
			}while(flag==false);
			
			break;
		case 3:
		System.out.println("Enter user name:");
		String name = Utility.inputWord();
		if(saccount.checkUser(name))
		{
			System.out.println("Enter the symbol you want to buy");
			String symbol = Utility.inputWord();
			saModel.setSymbol(symbol);
			saccount.buyShare(name , symbol);
		}
		else
		{
		System.out.println("User name not found!!create acoount");
		}
		break;
		case 4:
			System.out.println("Enter user name:");
			String name1 = Utility.inputWord();
			if(saccount.checkUser(name1))
			{
			System.out.println("enter the symbol to sell");
			String symbol = Utility.inputWord();
			saccount.sellShare(name1,symbol);
			System.out.println("Success");
			}
			else
			{
				System.out.println("user not found");
			}
		break;
		case 5:
			System.out.println("Enter user name:");
			String name2 = Utility.inputWord();
			saccount.checkReport(name2);
		break;
		case 6:System.exit(0);
			break;
		default:System.out.println("Enter a correct choice:");
			break;
		}
		System.out.println("Go to service Y/y or N/n");
		c= Utility.inputWord().charAt(0);
	}while(c =='Y' || c == 'y');
	}




}
