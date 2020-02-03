package com.bridgelabz.creationaldesignpattern.singleton;

public class EnumSingletonRunner {

	public static void main(String[] args) {
		EnumSingleton obj1 = EnumSingleton.INSTANCE;
		EnumSingleton obj2 = EnumSingleton.INSTANCE;
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		obj1.i=5;
		obj1.show();
		obj2.i=6;
		obj1.show();
	}
}
