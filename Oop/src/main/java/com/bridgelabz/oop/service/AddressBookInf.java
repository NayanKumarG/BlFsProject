package com.bridgelabz.oop.service;

import com.bridgelabz.oop.model.BookModel;

/*
 * interface for address book management system
 */
public interface AddressBookInf {

	void addProfile(BookModel bmodel);

	void dispalyProfile(String user);

	boolean checkUser(BookModel bmodel);

	void removeProfile(String userId1);

	void editProfile(String userId2);

	

}
