package com.bridgelabz.creationaldesignpattern.singleton;

public class BillPughHelperRunner {

	public static void main(String[] args) {

		BillPughSingleton obj1 = BillPughSingleton.getInstance();
		BillPughSingleton obj2 = BillPughSingleton.getInstance();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
	}

}
