package com.bridgelabz.behavioral.visitordesignpattern;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor{

	@Override
	public int visit(Book book) {
		int cost = 0 ;
		
		if(book.getPrice()>50)
			cost = book.getPrice()-5;
		else
			cost = book.getPrice();
		System.out.println("Book isbn = "+book.getisbnNumber()+" cost:"+cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPrice()*fruit.getWeight();
		System.out.println(fruit.getName()+" cost is "+cost);
		return cost;
	}

}
