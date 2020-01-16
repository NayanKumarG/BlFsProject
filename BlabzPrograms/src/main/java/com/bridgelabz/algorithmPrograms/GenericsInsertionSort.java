package com.bridgelabz.algorithmPrograms;
import java.util.ArrayList;

import com.bridgelabz.util.*;

//program for insertion sort using generics
public class GenericsInsertionSort {

	public static void main(String[] args) 
	{
	 ArrayList<String> al = new ArrayList<String>();
     System.out.println("Enter the size of an array:");
     int n = Utility.inputInteger();
     String str[] = new String[n];
     System.out.println("Enter the element for array");
     Utility.createStringArray(str);
     al = Utility.genericInsertionSort(str);
     System.out.println("After insertion sort:");
     System.out.println(al);
     
	}

}
