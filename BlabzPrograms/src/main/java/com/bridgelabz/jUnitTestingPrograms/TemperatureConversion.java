package com.bridgelabz.jUnitTestingPrograms;
import com.bridgelabz.util.Utility;

//program for temperature conversion
public class TemperatureConversion {

	public static void main(String[] args) {


		fun();
	}
	static void fun()
	{

		System.out.println("Enter 1 for conversion from celsius to fahrenheit:");

		System.out.println("Enter 2 for conversion from fahrenheit to celsius");
		int n = Utility.inputInteger();
		switch(n)
		{
		case 1 :
			System.out.println("Enter the temperature in celsius:");
			double c = Utility.inputDouble();
			double res1 = Utility.celToFar( c);
			System.out.println("The temperature in Fahrenheit:"+res1);


			break;
		case 2 :
			System.out.println("Enter the temperature in Fahrenheit:");
			double f1 = Utility.inputDouble();
			double res2 = Utility.farToCel(f1);
			System.out.println("The temperature in celsius:"+res2);
			break;
		default:System.out.println("Enter valid input:");
		fun();


		}

	}
}


