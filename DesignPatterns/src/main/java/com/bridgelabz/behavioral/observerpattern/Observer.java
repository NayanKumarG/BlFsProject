package com.bridgelabz.behavioral.observerpattern;

public interface Observer {

	/*
	 * method to update observer
	 */
	public void update();
	
	/*
	 * attach with subject to observer
	 */
	public void setSubject(Subject sub);
	
}
