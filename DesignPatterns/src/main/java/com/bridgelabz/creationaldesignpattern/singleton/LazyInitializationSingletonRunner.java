package com.bridgelabz.creationaldesignpattern.singleton;

/*
 * to check lazy initialized singleton
 */
public class LazyInitializationSingletonRunner {

	public static void main(String[] args) {

		LazyInitializationSingleton obj1 = LazyInitializationSingleton.getInstance();
		LazyInitializationSingleton obj2 = LazyInitializationSingleton.getInstance();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		
		
	}

}
