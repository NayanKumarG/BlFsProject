package com.bridgelabz.oop.controller;
import org.json.simple.JSONObject;
import com.bridgelabz.oop.model.InventoryModel;
import com.bridgelabz.oop.service.InventoryInf;
import com.bridgelabz.oop.serviceimpl.*;
import com.bridgelabz.util.Utility;
/*
 * program to manage the inventory
 */
public class InventoryManagement {
	static InventoryModel imodel = new InventoryModel();

	static String [] items = {"Rice" , "Wheats" , "Pulses"};
	public double getTotal(JSONObject obj)
	{
		double weight = (double) obj.get("Weight");

		imodel.setWeight(weight);
		double price = (double) obj.get("Price");
		imodel.setPrice(price);
		double total = imodel.getPrice()*imodel.getweight();
		imodel.setTotal(total);
		return imodel.getTotal();

	}
	public static void main(String[] args) {
		InventoryInf im = new  InventoryManagementImpl();

		System.out.println("Inventory management system:");

		int choice;
		char c;
		do {

			System.out.println("Enter a choice");
			System.out.println("1.Rice "+"\n"+"2.Wheats"+"\n"+"3.pulses"+"\n");
			choice = Utility.inputInteger();
			switch(choice)
			{
			case 1 :
				System.out.println("Enter the number of"+" "+items[choice-1]+" "+"items");
				int n = Utility.inputInteger();
				imodel.setItemName(items[choice-1]);
				for(int i=0 ; i<n ;i++)
				{
					itemDetails(choice,i);
					im.writeJSON(imodel);
				}
				break;

			case 2 :
				System.out.println("Enter the number of "+items[choice-1]+" items");
				int n1 = Utility.inputInteger();
				imodel.setItemName(items[choice-1]);
				for(int i=0 ; i<n1 ;i++)
				{
					itemDetails(choice,i);
					im.writeJSON(imodel);
				}
				break;
			case 3 :
				System.out.println("Enter the number of "+items[choice-1]+" items");
				int n2 = Utility.inputInteger();
				imodel.setItemName(items[choice-1]);
				for(int i=0 ; i<n2 ;i++)
				{
					itemDetails(choice,i);
					im.writeJSON(imodel);
				}
				break;
			default : System.out.println("Enter a correct input:");
			break;

			}

			System.out.println("Do you want to continue Y/y or N/n");
			c= Utility.inputWord().charAt(0);
		}while(c =='Y' || c == 'y');

		im.readJSON();

	}
	
	/*
	 * method to enter itemdetails
	 */
	private static void itemDetails(int ch,int i) {
		System.out.print("Enter the "+items[ch-1]+""+(i+1)+" name :");
		imodel.setName(Utility.inputWord());
		System.out.print("Enter the price:");
		imodel.setPrice(Utility.inputDouble());
		System.out.print("Enter the weight:");
		imodel.setWeight(Utility.inputDouble());

	}
}

