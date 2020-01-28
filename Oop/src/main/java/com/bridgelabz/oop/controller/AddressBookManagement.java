package com.bridgelabz.oop.controller;

import com.bridgelabz.oop.serviceimpl.AddressBookImpl;
import com.bridgelabz.oop.model.BookModel;
import com.bridgelabz.oop.service.AddressBookInf;
import com.bridgelabz.util.Utility;

public class AddressBookManagement {
	private static BookModel bmodel;
	public static void main(String[] args) 
	{
		AddressBookInf book = new AddressBookImpl();
		bmodel = new BookModel();
		System.out.println("AddressBook management System");
		char c;
		int choice;
		boolean flag;
		do
		{

			System.out.println("Enter your choice:");
			System.out.println("1.Add a Profile \n"+"2.Display Profile\n"+
					"3.Remove person \n"+"4.Edit Profile \n"+"5.Exit");

			choice = Utility.inputInteger();
			switch (choice) 
			{
			case 1:
				String user;
				do
				{
					System.out.println("UserId:");
					user = Utility.inputWord();

					bmodel.setUserId(user);
					if(book.checkUser(bmodel))
					{
						flag=false;
						System.out.println("UserId already exist try another");
					}
					else
						flag=true;

				}while(flag == false);
				personProfile(user);
				book.addProfile(bmodel);
				break;
			case 2:
				System.out.println("Enter your userId:");
				String userId = Utility.inputWord();
				book.dispalyProfile(userId);
				break;
			case 3:
				System.out.println("Enter your userId:");
				String userId1 = Utility.inputWord();
				book.removeProfile(userId1);
				break;
			case 4:
				System.out.println("Enter your userId:");
				String userId2 = Utility.inputWord();
				book.editProfile(userId2);
				break;
			case 5:
				System.exit(0);
			default :
				System.out.println("Enter correct choice");

			}

			System.out.println("Go to service Y/y or N/n");
			c= Utility.inputWord().charAt(0);
		}while(c =='Y' || c == 'y');
	}

	private static void personProfile(String user) {
		bmodel = new BookModel();
		System.out.println("Enter your Detail:");
		bmodel.setUserId(user);
		System.out.print("FirstName:");
		bmodel.setFirstName(Utility.inputWord());
		System.out.print("LastName:");
		bmodel.setLastName(Utility.inputWord());
		System.out.print("Address:");
		bmodel.setAddress(Utility.inputWord());
		System.out.print("City:");
		bmodel.setCity(Utility.inputWord());
		System.out.print("State:");
		bmodel.setState(Utility.inputWord());
		System.out.print("ZipCode:");
		bmodel.setZip(Utility.inputWord());
		System.out.print("Phone no:");
		bmodel.setPhoneNo(Utility.inputWord());
	}

}
