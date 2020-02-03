package com.bridgelabz.creationaldesignpattern.singleton;

public enum EnumSingleton {
/*
 * INSTANCE which has default private constructor
 */
	INSTANCE;
	
	int i;
	public void show()
	{
		System.out.println(i);
	}
	
}
