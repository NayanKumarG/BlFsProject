package com.bridgelabz.creational.prototypepattern;

import java.util.List;
import java.util.ArrayList;

/*
 * Employee class which implements the Cloneable interface
 */
public class Employee implements Cloneable {

	private List<String> empList;
	
	public Employee()
	{
		empList =  new ArrayList<String>();
	}
	
	public Employee(List<String> list)
	{
		this.empList = list;
	}
	
	/*
	 * loading the data into list
	 */
	public void loadData()
	{
	empList.add("Nayan");
	empList.add("Kumar");
	empList.add("Srijan");
	empList.add("Salian");
	}
	
	/*
	 * to get the employee list
	 */
	public List<String> getEmpList()
	{
		
		return empList;
	}

	/*
	 * overriding the clone method
	 */
	@Override
	protected Employee clone() throws CloneNotSupportedException {
	
		List<String> temp = new ArrayList<>();
		for(String s : this.getEmpList()){
			temp.add(s);
		}
		return new Employee(temp);
	}
}
