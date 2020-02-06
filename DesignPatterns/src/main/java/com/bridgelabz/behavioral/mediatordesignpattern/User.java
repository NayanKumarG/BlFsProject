package com.bridgelabz.behavioral.mediatordesignpattern;

/*
 * abstaract class of user
 */
public abstract class User {

	protected ChatMediator mediator;
	protected String name;
	
	public User(ChatMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}
	
	public abstract void send(String msg);
	public abstract void recieve(String msg);
}
