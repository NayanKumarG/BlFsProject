package com.bridgelabz.structural.adapterpattern;

/*
 * testing the adapter pattern design
 */
public class AdapterPatternTest {

	
	public static void main(String[] args) {

		testClassAdapter();
		testObjectAdapter();

	}


	/*
	 * method to test adapter pattern using adapter class
	 */
	private static void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();
		Volt volt120 = getVolt(sockAdapter , 120);
		Volt volt12 = getVolt(sockAdapter , 12);
		Volt volt3 = getVolt(sockAdapter , 3);

		System.out.println("120 volt using class adapter:"+volt120.getVolts());
		System.out.println("12 volt using class adapter:"+volt12.getVolts());
		System.out.println("3 volt using class adapter:"+volt3.getVolts());
	}

	/*
	 * method to test adapter pattern using object adapter
	 */
	private static void testObjectAdapter() {
		SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
		Volt volt120 = getVolt(sockAdapter , 120);
		Volt volt12 = getVolt(sockAdapter , 12);
		Volt volt3 = getVolt(sockAdapter , 3);

		System.out.println("120 volt using object adapter:"+volt120.getVolts());
		System.out.println("12 volt using object adapter:"+volt12.getVolts());
		System.out.println("3 volt using object adapter:"+volt3.getVolts());

	}



	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch(i)
		{
		case 120 :
			return sockAdapter.get120Volt();
		case 12 :
			return sockAdapter.get12Volt();
		case 3 : 
			return sockAdapter.get3Volt();
		default :
			return sockAdapter.get120Volt();
		}
	}

}
