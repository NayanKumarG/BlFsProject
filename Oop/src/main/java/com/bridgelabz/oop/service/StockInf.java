package com.bridgelabz.oop.service;

import com.bridgelabz.oop.model.StockModel;

/*
 * interface for stock management
 */
public interface StockInf {

	
	void readData();
	void writeData(StockModel smodel);
	
}
