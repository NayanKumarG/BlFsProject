package com.bridgelabz.oop.model;

public class StockModel {

	private String name;
	private long numOfShare;
	private long sharePrice;
	private long stockValue;

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	public void setNumOfShare(long num)
	{
		this.numOfShare = num;
	}

	public long getNumOfShare()
	{
		return this.numOfShare;
	}
	
	public void setPrice(long price)
	{
		this.sharePrice = price;
	}
	
	public long getPrice()
	{
		return this.sharePrice;
	}

	
	public long getStockValue()
	{
		return this.stockValue;
	}

	public void setStockValue(long stockValue2) {
		
		this.stockValue = stockValue2;
	}
}
