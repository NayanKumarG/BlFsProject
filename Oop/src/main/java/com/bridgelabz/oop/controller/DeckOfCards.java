package com.bridgelabz.oop.controller;
import com.bridgelabz.oop.service.DeckOfCardsInf;
import com.bridgelabz.oop.serviceimpl.DeckOfCardsImpl;

/*
 * program for deck of card
 */
public class DeckOfCards {

	public static void main(String[] args) {
		DeckOfCardsInf dcards = new DeckOfCardsImpl();
		String [] str = dcards.createCards();
		String [] str2 = dcards.shuffleCards(str);
		String [][] str3 = dcards.distributeCards(str2);
		dcards.displayCards(str3);
	}

}
