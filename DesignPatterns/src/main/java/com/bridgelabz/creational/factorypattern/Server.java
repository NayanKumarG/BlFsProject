package com.bridgelabz.creational.factorypattern;

/*
 * server class which extends the computer
 */
public class Server extends Computer {

	private String ram;
	private String hdd;
	private String cpu;
	
	/*
	 * constructor to initialize instance variable
	 */
	public Server(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	@Override
	public String getRam() {
		return this.ram;
	}
	@Override
	public String getHDD() {
		return this.hdd;
	}
	@Override
	public String getCPU() {
		return this.cpu;
	}
	
	
}
