package com.bridgelabz.creationaldesignpattern.singleton;

/*
 * static block initialized singleton
 */
public class StaticBlockInitializedSingleton {

	private static StaticBlockInitializedSingleton object;
	
	private StaticBlockInitializedSingleton()
	{
		
	}
	
	
	/*
	 * static block to initialize instance
	 */
	static
	{
		try
		{
			object = new StaticBlockInitializedSingleton();
		}catch(Exception e)
		{
			throw new RuntimeException("Exception occured while craeting instance"); 
		}
	}
	
	/*
	 * returns instance
	 */
	public static StaticBlockInitializedSingleton getInstance()
	{
		return object;
	}
}
