package com.bridgelabz.creationaldesignpattern.singleton;

/*
 * thread safe singleton program
 */
public class ThreadSafeSingleton {
	
private static ThreadSafeSingleton object;

	private ThreadSafeSingleton()
	{
	
	}
	
	/*
	 * method which is thread safe
	 */
	public static synchronized ThreadSafeSingleton getInstance()
	{
		if(object==null)
		{
			object = new ThreadSafeSingleton();
		}
		return object;
	}
	
}
