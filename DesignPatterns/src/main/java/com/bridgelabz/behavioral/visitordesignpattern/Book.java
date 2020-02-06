package com.bridgelabz.behavioral.visitordesignpattern;

/*
 * implementation class of items 
 */
public class Book implements ItemElement {

	
	private int price;
	private int isbnNumber;
	public Book(int price, int isbnNumber) {
		this.price = price;
		this.isbnNumber = isbnNumber;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public int getisbnNumber()
	{
		return isbnNumber;
	}
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
	
	

}
