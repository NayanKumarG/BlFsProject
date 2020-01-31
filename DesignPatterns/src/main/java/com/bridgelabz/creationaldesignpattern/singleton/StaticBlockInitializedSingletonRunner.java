package com.bridgelabz.creationaldesignpattern.singleton;

public class StaticBlockInitializedSingletonRunner {

	public static void main(String[] args) {
		
		StaticBlockInitializedSingleton obj1 = StaticBlockInitializedSingleton.getInstance();
		StaticBlockInitializedSingleton obj2 = StaticBlockInitializedSingleton.getInstance();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
