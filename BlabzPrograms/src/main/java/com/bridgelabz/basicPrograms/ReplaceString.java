package com.bridgelabz.basicPrograms;
import com.bridgelabz.util.Utility;

//Program for replace a string

public class ReplaceString {

	public static void main(String[] args) {

		System.out.println("Enter a String:");
		String str = Utility.inputWords();
		System.out.println("Enter the replacing string:");
		String str1 = Utility.inputWord();
		System.out.println("Enter the name:");
		String str2 = Utility.inputWord();
		String res = str.replace(str1, str2);
		System.out.println(res);

	}
}


