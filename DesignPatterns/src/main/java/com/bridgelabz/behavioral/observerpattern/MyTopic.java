package com.bridgelabz.behavioral.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject{

	private List<Observer> observers;

	private String message;
	private boolean changed;
	private final Object MUTEX = new Object();

	public MyTopic()
	{
		this.observers = new ArrayList<>();
	}
	@Override
	public void regeister(Observer obj) {
		if(obj==null) 
			throw new NullPointerException("Null observer");
		synchronized(MUTEX)
		{
			if(!observers.contains(obj))
				observers.add(obj);
		}

	}

	@Override
	public void unregister(Observer obj) {
		synchronized(MUTEX)
		{
			observers.remove(obj);
		}
	}

	@Override
	public void notifyObserver() {
		List<Observer> observersLocal = null;
		synchronized (MUTEX) {
			if (!changed)
				return;
			observersLocal = new ArrayList<>(this.observers);
			this.changed=false;
		}
		for (Observer obj : observersLocal) {
			obj.update();
		}

		
		
	}

	@Override
	public Object getupdate(Observer obj) {
		return this.message;
	}
	
	public void postMessage(String msg)
	{
		System.out.println("Message posted");
		this.message=msg;
		this.changed=true;
		notifyObserver();
		
	}

}
