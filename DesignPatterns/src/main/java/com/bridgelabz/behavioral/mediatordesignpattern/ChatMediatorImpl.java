package com.bridgelabz.behavioral.mediatordesignpattern;

import java.util.ArrayList;
import java.util.List;

/*
 * implementation of ChatMediator interface
 */
public class ChatMediatorImpl implements ChatMediator {

	
	private List<User> user;
	public ChatMediatorImpl() {
		this.user = new ArrayList<>();
	}

	/*
	 * overriding the method
	 */
	@Override
	public void sendMessage(String msg, User user) {
		
		for(User users:this.user)
		{
			if(users!=user)
				users.recieve(msg);
		}
	}

	/*
	 * overriding the method
	 */
	@Override
	public void addUser(User user) {
		this.user.add(user);

	}
	

}
