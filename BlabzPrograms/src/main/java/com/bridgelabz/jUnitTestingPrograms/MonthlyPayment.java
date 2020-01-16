package com.bridgelabz.jUnitTestingPrograms;
import com.bridgelabz.util.Utility;

//program to find monthly payment
public class MonthlyPayment {

	public static void main(String[] args)
	{
		System.out.println("Enter the principal loan amount:");
		double p = Utility.inputDouble();
		System.out.println("Enter the rate of interest:");
		double r = Utility.inputDouble();
		System.out.println("Enter the number of years:");
		double y = Utility.inputDouble();
		double pay = carLoan(p,r,y);
		System.out.println("Your monthly payment:"+pay);
			}

			public static double carLoan(double p, double r, double y) {
				
				double R,pay,n=12;
				R = r/(12*100);
				pay = (p*R)/(1-(Math.pow((1+R), (-n))));
				return pay;
	}

}
