package com.bridgelabz.functionalPrograms;
import com.bridgelabz.util.Utility;

//program to display 2D array
public class TwoDArray {

	public static void main(String[] args) {
		System.out.println("2DArray");
		System.out.println("Enter the number of rows:");
		int r = Utility.inputInteger();
		System.out.println("Enter the number of columns:");
		int c = Utility.inputInteger();
		Object a[][] =  new Object [r][c];
		System.out.println("Enter the values for "+r+"*"+c+" Array");
		Utility.create2DArray(a);
		Utility.printTwoDArray(a);
	
	}

}
