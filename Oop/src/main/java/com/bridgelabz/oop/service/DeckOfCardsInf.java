package com.bridgelabz.oop.service;

/*
 * interface for deck of cards
 */
public interface DeckOfCardsInf {

	String[] createCards();
	
	String[] shuffleCards(String[] str);
	
	String[][] distributeCards(String[] str2);

	void displayCards(String[][] str3);

	

	

	
}
