package com.bridgelabz.creationaldesignpattern.singleton;

public class EagerInitializedSingletonRunner {

	/*
	 * program to check Eager Initialized Singleton
	 */
	public static void main(String[] args) 
	{
		 EagerInitializedSingleton obj1 =  EagerInitializedSingleton.getInstance();
		 EagerInitializedSingleton obj2 =  EagerInitializedSingleton.getInstance();
		 obj1.display();
		 System.out.println(obj1.hashCode());
		 System.out.println(obj2.hashCode());
	}

}
