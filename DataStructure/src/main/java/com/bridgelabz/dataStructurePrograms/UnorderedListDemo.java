package com.bridgelabz.dataStructurePrograms;
import com.bridgelabz.util.*;
//Demo for unordered list
public class UnorderedListDemo {
static  UnorderedLinkedList<String> ull = new UnorderedLinkedList<String>();
	public static void main(String[] args) {
		
		//System.out.println("Enter the path of a file: ");
		//String path = Utility.inputWord();
		//String a[] = {"Nayan" ,"Kumar","Akshay"};
		
		String str=Utility.getFromFile("/home/user/ul.txt");
		
		String []a = str.split(",");
		for(int i = 0 ;i<a.length ; i++)
		{
			ull.add(a[i]);
		}
		System.out.println(ull);
		System.out.println("Enter a word to search:");
		String s = Utility.inputWord();
		if(ull.search(s))
		{
			System.out.println("The given item is found and removed from the list:");
			ull.remove(s);
		
		}
		else
		{
			System.out.println("Given item "+s+" is not found and added to list");
			ull.add(s);
		}
		
		System.out.println(ull);
		String st = ull.getData();
		//System.out.println(st);
		
	
		
	try {
			Utility.appendToFile(st , "/home/user/b.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("List data added to a file");
	

	}

	}


