package com.bridgelabz.behavioral.mediatordesignpattern;

public class UserImpl extends User{

	public UserImpl(ChatMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String msg) {
		System.out.println(this.name+" sending message "+msg);
		mediator.sendMessage(msg, this);
	}

	@Override
	public void recieve(String msg) {
		System.out.println(this.name+" Recieved message :"+msg);
	}

}
