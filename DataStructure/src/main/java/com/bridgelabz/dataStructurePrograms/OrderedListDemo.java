package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.util.Utility;

public class OrderedListDemo {
	static  OrderedLinkedList<Integer> oll = new OrderedLinkedList<Integer>();
	public static void main(String[] args) {

		//System.out.println("Enter the path of a file: ");
		//String path = Utility.inputWord();
		//String str=Utility.getFromFile("user/eclipse-workspace/BlabzPrograms/ol.txt");
		String str="10,7,8,23,43";
		String a[] = null;
		a = str.split(",");
		for(int i = 0 ;i<a.length ; i++)
		{
			oll.add(Integer.parseInt(a[i]));
		}
		System.out.println(oll);
		System.out.println("Enter a number to search:");
		int s = Utility.inputInteger();
		if(oll.search(s))
		{
			System.out.println("The given item is found and removed from the list:");
			oll.remove(s);
		
		}
		else
		{
			System.out.println("Given item "+s+" is not found and added to list");
			oll.add(s);
		}
		
		System.out.println(oll);
		String st = oll.getData();
		
		try {
			Utility.appendToFile("home\\user\\eclipse-workspace\\BlabzPrograms\\c.txt", st);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("List data added to a file");
	

	}
	}


