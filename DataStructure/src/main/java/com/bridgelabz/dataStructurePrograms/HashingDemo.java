package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.util.Utility;

public class HashingDemo {

	public static void main(String[] args) {
		HashTable ht = new HashTable(10);
		
String str=Utility.getFromFile("/home/user/hashfile.txt");
		
		String []a = str.split(" ");
		for(int i = 0 ;i<a.length ; i++)
		{
			ht.add(Integer.parseInt(a[i]));
		}
		ht.display();
		System.out.println("Enter a number to search:");
		int s = Utility.inputInteger();
		if(ht.search(s))
		{
			System.out.println("The given item is found and removed from the list:");
			ht.remove(s);
		
		}
		else
		{
			System.out.println("Given item "+s+" is not found and added to list");
			ht.add(s);
		}
		
		ht.display();
		for(int i=0 ; i<a.length ; i++)
		{
		String st = ht.getData(i);
		//System.out.println(st);
		
	
		
	try {
			Utility.appendToFile(st , "/home/user/hashwrite.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		
	}
		System.out.println("List data added to a file");
	}
}
