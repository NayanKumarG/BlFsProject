package com.bridgelabz.creational.factorypattern;

/*
 * model for computer
 */
public abstract class Computer {
	
	public abstract String getRam();
	public abstract String getHDD();
	public abstract String getCPU();
	
	/*
	 * overriding toString()
	 */
	@Override
	public String toString() {
		
		return "Ram="+this.getRam()+", Hdd="+this.getHDD()+",Cpu="+this.getCPU();
	}
	
}
