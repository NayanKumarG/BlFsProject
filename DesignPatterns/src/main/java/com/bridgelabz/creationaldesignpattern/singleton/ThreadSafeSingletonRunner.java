package com.bridgelabz.creationaldesignpattern.singleton;

public class ThreadSafeSingletonRunner {

	public static void main(String[] args) {
		
		ThreadSafeSingleton obj1 = ThreadSafeSingleton.getInstance();	
		ThreadSafeSingleton obj2 = ThreadSafeSingleton.getInstance();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
