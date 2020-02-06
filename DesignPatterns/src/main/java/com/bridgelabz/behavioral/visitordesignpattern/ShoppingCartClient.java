package com.bridgelabz.behavioral.visitordesignpattern;

/*
 * visitor pattern at client side
 */
public class ShoppingCartClient {

	public static void main(String[] args) {

		ItemElement items [] = new ItemElement[] {new Book(20 ,1234) , new Book(60 , 2345) , new Fruit("Mango" , 30 , 4) , new Fruit("Banana" , 20 , 2)};
		int total = getTotal(items);
		System.out.println("Total amount="+total);
	}

	private static int getTotal(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for(ItemElement item: items)
		{
			sum = sum+item.accept(visitor);
		}
		return sum;
	}

}
