package com.bridgelabz.structural.adapterpattern;

/*
 * implements adapter using object adapter
 */
public class SocketObjectAdapterImpl implements SocketAdapter{

	private Socket socket = new Socket();
	
	@Override
	public Volt get120Volt() {
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = socket.getVolt();
		return convertVolt(v,10);
	}

	
	@Override
	public Volt get3Volt() {
		Volt v = socket.getVolt();
		return convertVolt(v,40);
	}
	
	/*
	 * method to convert voltage
	 */
	private Volt convertVolt(Volt v, int i) {
		return new Volt (v.getVolts()/i);
	}


}
