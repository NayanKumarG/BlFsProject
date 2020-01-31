package com.bridgelabz.creationaldesignpattern.singleton;
/*
 * Eager initialization singleton class
 */
public class EagerInitializedSingleton {
	private static final EagerInitializedSingleton object = new EagerInitializedSingleton(); 

	/*
	 * private contstructor to avoid usage of constructor by client
	 */
	private EagerInitializedSingleton()
	{
	}

	/*
	 * returns instance of EagerInitializedSingleton class
	 */
	public static EagerInitializedSingleton getInstance()
	{
		return object;
	}
	
	

}
