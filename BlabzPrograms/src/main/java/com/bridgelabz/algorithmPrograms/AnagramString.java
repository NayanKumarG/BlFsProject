package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.util.Utility;

//Program to find given strings are anagram or not
public class AnagramString {

	public static void main(String[] args) {
		System.out.println("Enter the two strings to check anagram:");
		String str1 = Utility.inputWord();
		String str2 = Utility.inputWord();
		boolean b = Utility.checkAnagram(str1 , str2);
		if(b)
			System.out.println("Given two strings are Anagram");
		else
			System.out.println("Given two strings are not Anagram");
	}


	}


