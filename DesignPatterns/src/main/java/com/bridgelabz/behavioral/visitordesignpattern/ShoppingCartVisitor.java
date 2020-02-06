package com.bridgelabz.behavioral.visitordesignpattern;

/*
 * interface acts as mediator
 */
public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}
