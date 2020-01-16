package com.bridgelabz.functionalPrograms;
import com.bridgelabz.util.Utility;

//Program to find wind chill
public class WindChill {

	public static void main(String[] args) {
		System.out.println("Enter the temperature in fahrenheit:");
		double t=Utility.inputDouble();
		System.out.println("Enter the wind speed in miles per hour:");
		double s = Utility.inputDouble();
		Utility.windChill(t,s);

	}
}
