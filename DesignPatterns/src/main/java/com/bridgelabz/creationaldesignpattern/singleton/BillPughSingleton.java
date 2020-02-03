package com.bridgelabz.creationaldesignpattern.singleton;

/*
 * singleton using bill pugh method
 */
public class BillPughSingleton {
	
	private BillPughSingleton()
	{
		
	}
	
	/*
	 * inner class to initialise instance
	 */
	private static class BillPughHelper
	{
		private static BillPughSingleton object = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance()
	{
		return BillPughHelper.object;
	}
}
