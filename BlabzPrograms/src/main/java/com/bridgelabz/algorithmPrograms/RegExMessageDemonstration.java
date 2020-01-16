package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.util.*;

//program for message demonstration using regex
public class RegExMessageDemonstration {
	public static void main(String[] args) 
	{
		String msg = Utility.getFromFile("C:/Users/USER/Desktop/regexFile.txt");
		System.out.println(msg);
		String str[] = new String[3];
		String s[] = {"<<name>>","<<full name>>","xxxxxxxxxx"};
		System.out.println("Enter yor name , full name and mobile number");
		for(int i = 0 ;i <str.length ; i++)
		{
			str[i] = Utility.inputWords();
		}
		String message = Utility.replaceRegex(str , s , msg);
		System.out.println(message);
	}
}
