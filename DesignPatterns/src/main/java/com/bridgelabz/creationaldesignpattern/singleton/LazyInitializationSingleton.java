package com.bridgelabz.creationaldesignpattern.singleton;

/*
 * lazy initialized singleton program
 */
public class LazyInitializationSingleton {
	
	private static LazyInitializationSingleton object;
	private LazyInitializationSingleton()
	{
		
	}
	
	/*
	 * initializing after checking object is null or not and returning object
	 */
	public static LazyInitializationSingleton getInstance()
	{
	if(object==null)
	{
		object = new LazyInitializationSingleton();
	}
	return object;
	}
	
	
	
	
}
