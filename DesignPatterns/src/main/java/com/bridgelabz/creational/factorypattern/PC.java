package com.bridgelabz.creational.factorypattern;

/*
 * class PC extends the computer
 */
public class PC extends Computer{

	private String ram;
	private String hdd;
	private String cpu;

	/*
	 * initializing using constructor
	 */
	public PC(String ram, String hdd, String cpu) {
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
