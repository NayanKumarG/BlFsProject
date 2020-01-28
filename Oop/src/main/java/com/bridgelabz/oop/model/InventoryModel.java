package com.bridgelabz.oop.model;


/*
*program to set and get the data
*/
public class InventoryModel {

	private String name;
	private double price;
	private double weight;
	private double total;
	private String itemName;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	public double getweight()
	{
		return this.weight;
	}

	public void setTotal(double total)
	  {
		this.total=total;
	  }
	public double getTotal() {
		
		return this.total;
	}

	public String getItemName() {
		// TODO Auto-generated method stub
		return this.itemName;
	}
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}
	
}
