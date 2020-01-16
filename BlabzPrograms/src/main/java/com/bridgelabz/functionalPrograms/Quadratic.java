package com.bridgelabz.functionalPrograms;
import com.bridgelabz.util.Utility;

//program for qudratic equation
public class Quadratic {

	public static void main(String[] args) {
		System.out.println("Enter the a,b,c values for the quadratic equation ax^2+bx+c");
		double a = Utility.inputDouble();
		double b = Utility.inputDouble();
		double c = Utility.inputDouble();
		Utility.quadraticSolution(a,b,c);

	}

}

