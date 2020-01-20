package com.bridgelabz.util;

//Putting commonly used functions in a single file

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utility {

	static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	static Scanner sc = new Scanner(System.in);

	//used to input a String
	public static String inputWords(){ 
		String str =null;
		try {
		 str=sc.nextLine();
		}catch(InputMismatchException e)
		{
			System.out.println("Enter a string");
		}
		return str;
	}

	public static String inputWord(){ 
		String str=sc.next();
		return str;
	}

	// used to input an integer values
	public static int inputInteger(){

		int n = sc.nextInt();
		return n;


	}
	// used to input a float value
	public static float inputFloat() {
		float n = sc.nextFloat();
		return n;
	}

	// used input an double value
	public static double inputDouble(){
		double n = sc.nextDouble();
		return n;
	}

	// used to input an long values
	public static long inputLong(){
		long n = sc.nextLong();
		return n;

	}

	//Getting string from a file
	public static String getFromFile(String path) {
		BufferedReader br = null;
		String str = "";
		try {
			br = new BufferedReader(new FileReader(path));
			str = br.readLine();
		} catch (IOException e) {
	System.out.println("File not found");
		}
		finally
		{
			if(br!=null)
			{
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return str;

	}

	//append data to a file
	public static void appendToFile(String data,String fileName)throws Exception{
		File file = new File(fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter writer = new FileWriter(file,true); 
       writer.write(data); 
       writer.flush();
       writer.close();
	}
	
	//to check prime or not
	public static boolean isPrime(int i) {
		int count = 0 ,k=1 ;
		while(k<=i/2)
		{
			if(i%k==0)
				count++;
			k++;
		}
		if(count==1)
			return true;
		else
		return false;
	}

	//to check anagram of 2 numbers
	public static boolean isAnagram(int a , int b) {

		int a1[] = new int[10];
		int a2[] = new int[10];
		while(a>0)
		{
			int r=a%10;
			a=a/10;
			a1[r]++;
		}
		while(b>0)
		{
			int r=b%10;
			b=b/10;
			a2[r]++;
		}

		for(int i=0 ; i<10 ;i++)
		{
			if(a1[i]!=a2[i])
			{
				return false;
			}

		}
		return true;
	}
	
	
	//inserting values to the 2D array
		public static int[][] insert2DArray(int[][] a)
		{
			int num =0; 
			for(int i=0 ; i<a.length;i++)
			{    
				int n=100;
				
				for(int j = 0 ; j<=n ; j++)
				{
					if(isPrime(num))
					{
					
						a[i][j] = num;
						
						num++;
				}
					else {
					    j--;
					    n--;
						num++;
					}
					
			}
		}
			return a;
	}



}
