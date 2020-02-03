package com.bridgelabz.creationaldesignpattern.singleton;

import java.io.Serializable;

/*
 * serialization in singleton
 */
public class SerializedSingleton implements Serializable {

	private static final long serialVersionUID = -9876543L;
	
	private SerializedSingleton()
	{
		
	}
	private static class SerializedSingletonHelper
	{
		private static final SerializedSingleton object = new SerializedSingleton();
	}
	
	public static SerializedSingleton getInstance()
	{
		return SerializedSingletonHelper.object;
	}	
	
	protected Object readResolve() {
	    return getInstance();
	}
}
