package com.bridgelabz.behavioral.mediatordesignpattern;
/*
 * interface acts as mediator
 */
public interface ChatMediator {

	public void sendMessage(String msg , User user);
	void addUser(User user);
}
