package com.bridgelabz.structural.adapterpattern;

/*
 * Socket class produces constant volt
 */
public class Socket {

	public Volt getVolt()
	{
		return new Volt(120);
	}
}
