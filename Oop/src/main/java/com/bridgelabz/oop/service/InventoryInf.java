package com.bridgelabz.oop.service;

import com.bridgelabz.oop.model.InventoryModel;

/*
 * interface for inventory management system
 */
public interface InventoryInf {
	
	void readJSON();
	void writeJSON(InventoryModel imodel);

}
