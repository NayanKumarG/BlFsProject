package com.bridgelabz.creational.prototypepattern;

import java.util.List;

public class PrototypeTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.loadData();
Employee empNew = null;
try {
	empNew = emp.clone();
} catch (CloneNotSupportedException e) {
	e.printStackTrace();
}
emp.getEmpList().add("Akshay");

List<String> list = empNew.getEmpList();
list.remove("Nayan");

System.out.println("Employee List:"+emp.getEmpList());
System.out.println("Employee new list:"+list);


	}

}
