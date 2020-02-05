package com.bridgelabz.structural.adapterpattern;

/*
 * implementing adapter using class adapter
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter{

	@Override
	public Volt get120Volt() {
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = getVolt();
		
		return convertVolt(v,10);
	}

	@Override
	public Volt get3Volt() {
		
		Volt v = getVolt();
		return convertVolt(v,40);
	}
	
	/*
	 * method to convert volt
	 */
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
}
