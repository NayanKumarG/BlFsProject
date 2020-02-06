package com.bridgelabz.behavioral.visitordesignpattern;

/*
 * implementation class of ItemElement
 */
public class Fruit implements ItemElement{

	private String name;
	private int price;
	private int weight;
	/*
	 * initialize using constructor
	 */
	public Fruit(String name , int price , int weight)
	{
		this.name = name;
		this.price = price ;
		this.weight = weight;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	/*
	 * overriding the method
	 */
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
