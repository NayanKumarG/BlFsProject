package com.bridgelabz.dataStructurePrograms;
import com.bridgelabz.util.*;

//program to print calender

public class Calender {

	public static void main(String[] args) {
		System.out.println("Enter the year:");
		int y = Utility.inputInteger();
		System.out.println("Enter the month:");
		int m = Utility.inputInteger();
		String [] month = {"" , "January" , "February" , "March" , "April" , "May" ,
				"June" , "July" , "August" , "September" , "October" ,
				"November" , "December"};

		int day[] = {0 , 31 , 28 , 31 , 30 , 31 , 30 ,31 , 31 , 30 , 31 , 30 , 31};
		String week[] = {"S" , "M" , "T" , "W" , "T" , "F" ,"S"};
		if(m == 2 && isLeapYear(y))
		{
			day[2] = 29;
		}

		int res[][] = new int [6][7];
		int d = day(m , 1 , y);
		//System.out.println(d);
		int count=1;
		int count1 = day[m];
		
		System.out.println("Calender "+month[m]+" "+y);
		for(int i = 0 ; i<week.length ; i++)
		{
			System.out.print(week[i]+"  ");
		}
		System.out.println();

		
		//creating array of dates
		for(int i = 0 ; i <res.length ; i++)
		{
			for(int j = 0 ; j<res[i].length ; j++)
			{
				if(count<=count1)
				{
					if(j>=d && i==0)
					{
					res[i][j] = count++;
					}
					else if(i>0)
					res[i][j] = count++;
							
				}
			}

		}
		
		//print the calender
		for(int i = 0 ; i<res.length ; i++)
			
		{
			for (int j = 0 ; j<res[i].length ; j++)
			{
				
				if(res[i][j]!=0)
				{
					System.out.print(res[i][j]+" ");
					if(res[i][j]<10)
					System.out.print(" ");	
				}
				if(res[i][j]==0)
					System.out.print("   ");
			}
			System.out.println();
		}
	}

	//checking given year is leap year or not
	private static boolean isLeapYear(int y) {
		if(y%400==0 || y%4==0 && y%100!=0)
		{
			return true;
		}
		else
			return false;
	}

	//day of given date
	private static int day(int month, int day, int year) {
		int y = year - (14 - month) / 12;
		int x = y + y/4 - y/100 + y/400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (day + x + (31*m)/12) % 7;
		return d;
	}

}
