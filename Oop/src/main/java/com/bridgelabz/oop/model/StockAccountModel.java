package com.bridgelabz.oop.model;

/*
 * program for stock account model
 */
public class StockAccountModel {
	private String symbol;
	private String name;
	private int noOfShares;
	private long amount;

	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfShares() {
		return noOfShares;
	}
	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long l) {
		this.amount = l;
	}
	

}
