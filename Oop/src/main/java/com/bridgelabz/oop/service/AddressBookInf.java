package com.bridgelabz.oop.service;

import com.bridgelabz.oop.model.BookModel;

public interface AddressBookInf {

	void addProfile(BookModel bmodel);

	void dispalyProfile(String user);

	boolean checkUser(BookModel bmodel);

	void removeProfile(String userId1);

	void editProfile(String userId2);

	

}
