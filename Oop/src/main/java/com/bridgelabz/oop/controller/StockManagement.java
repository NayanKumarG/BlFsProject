package com.bridgelabz.oop.controller;
import org.json.simple.JSONObject;

import com.bridgelabz.oop.model.StockModel;
import com.bridgelabz.oop.service.StockInf;
import com.bridgelabz.oop.serviceimpl.StockManagementImpl;
import com.bridgelabz.util.Utility;
public class StockManagement {

	private static StockModel smodel;
	private static StockInf si;
private long totalStockValue;
	//method to find each stock values
	public long stockValue(JSONObject jobj) {
		StockModel sm = new StockModel();
		long price = (long) jobj.get("SharePrice");
		sm.setPrice(price);
		long numOfShares = (long) jobj.get("Numberofshares");
		sm.setNumOfShare(numOfShares);
		long stockValue = sm.getPrice()*sm.getNumOfShare();
		sm.setStockValue(stockValue);
		
		totalStockValue = totalStockValue+sm.getStockValue();
		return sm.getStockValue();
		
	}
	public long getTotal()
	{
		return totalStockValue;
	}
	
	public static void main(String[] args) {
		smodel = new StockModel();
		si = new StockManagementImpl();
		System.out.println("Enter the number of stocks:");
		int n = Utility.inputInteger();
		for(int i = 0 ; i<n ; i++ )
		{
			System.out.println("Enter the share name:");
			smodel.setName(Utility.inputWord());
			System.out.println("enter the number of shares in "+smodel.getName());
			smodel.setNumOfShare(Utility.inputInteger());
			System.out.println("Enter the number of share price:");
			smodel.setPrice(Utility.inputInteger());
		    si.writeData(smodel);
		}
		si.readData();
		
	}

}
