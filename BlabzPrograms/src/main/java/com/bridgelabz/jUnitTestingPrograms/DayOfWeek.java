package com.bridgelabz.jUnitTestingPrograms;
import com.bridgelabz.util.Utility;

//program to find day of week
public class DayOfWeek {

	public static void main(String[] args) 
	{
		System.out.println("Enter the day month and year(in number):");
		int d = Utility.inputInteger();
		int m = Utility.inputInteger();
		int y = Utility.inputInteger();
		String s = dayOfWeek(d,m,y);
		System.out.println("Day of week is:"+s);
	}

	//method to find day of week
	public static String dayOfWeek(int d, int m, int y) {
		int y1,m1,d1,x;
		y1 = y-(14-m)/12;
		x = y1+y1/4-y1/100+y1/400;
		m1 = m+12*((14-m)/12)-2;
		d1 = (d+x+31*m1/12)%7;
		String day[] = {"Sunday" , "Monday" , "Tuesday" , "Wednsday" , "Thursday" , "Friday" , "Saturday"};
		return day[d1];	
	}
}


