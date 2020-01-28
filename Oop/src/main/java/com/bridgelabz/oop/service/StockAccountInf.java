package com.bridgelabz.oop.service;

import com.bridgelabz.oop.model.StockAccountModel;

/*
 * interface for StockAccount
 */
public interface StockAccountInf {
	
	void checkShare();

	void createAccount(StockAccountModel saModel);

	boolean checkUser(String inputWord);

	void buyShare(String name, String symbol);


	void sellShare(String name1, String symbol);

	void checkReport(String name2);
}
