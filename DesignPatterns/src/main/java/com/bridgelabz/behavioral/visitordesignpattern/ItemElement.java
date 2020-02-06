package com.bridgelabz.behavioral.visitordesignpattern;

/*
 * interface contains single method which accept the visitors
 */
public interface ItemElement {

public int accept(ShoppingCartVisitor visitor);	
	
}
