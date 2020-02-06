package com.bridgelabz.behavioral.mediatordesignpattern;

public class ChatClient {

	public static void main(String[] args) {

		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator , "Nayan");
		User user2 = new UserImpl(mediator , "Kumar");
		User user3 = new UserImpl(mediator , "Akshay");
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		
		user1.send("Hi All");
	}

}
