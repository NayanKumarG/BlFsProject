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
	




}
