package com.bridgelabz.oop.serviceimpl;
import java.util.Random;
import com.bridgelabz.oop.service.DeckOfCardsInf;


/*
 * implementation for deck of card
 */
public class DeckOfCardsImpl implements DeckOfCardsInf
{

	String [] suits = {"Clubs" , "Diamonds" , "Hearts" , "Spades"};
	String [] ranks = {"2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , 
			            "10" , "Jack" , "Queen" , "King" , "Ace"};
	/*
	 * override method to create cards
	 */
	@Override
	public String [] createCards() {
		
		String [] cards = new String[52];
		int k = 0;
		for(String i : suits)
		{
			String str = null;
			for(String j : ranks)
			{
				str = j+i;
				cards[k++] = str ;
			}
		}
		
		return cards;
		
	}

	/*
	 * override method to shuffle the card
	 */
	@Override
	public String [] shuffleCards(String [] strArray) {
		Random rand = new Random();
		int random;
		for( int i = 0 ; i<strArray.length ; i++)
		{
			random = rand.nextInt(52);
			String temp = strArray[i] ;
			strArray[i] = strArray[random];
			strArray[random] = temp;
		}
		return strArray;
		
	}

	/*
	 * override method to distribute the cards
	 */
	@Override
	public String[][] distributeCards(String [] strArray) {
		String [][] array = new String[4][9];
		int k=0;
		for(int i = 0 ; i < 4 ; i++)
		{
			for(int j = 0 ; j<9 ; j++)
			{
				array[i][j] = strArray[k++];
			}
		}
		return array;
		
	}

	/*
	 * display the players card using 2D array
	 */
	@Override
	public void displayCards(String [][] array) {
		
		for(int i = 0 ; i< array.length ; i++)
		{
			System.out.print("Player 1 cards:");
			for(int j = 0 ; j<array[i].length ; j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	
}
