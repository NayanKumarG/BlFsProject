package com.bridgelabz.behavioral.observerpattern;

public interface Subject {

	/*
	 * register and unregister observer
	 */
	public void regeister(Observer obj);
	public void unregister(Observer obj);
	 
	/*
	 * get notify to the observer
	 */
	public void notifyObserver();
	
	/*
	 * getting update from the subject
	 */
	public Object getupdate(Observer obj);
	
	
	
}
