package com.bridgelabz.util;

//Putting commonly used functions in a single file

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {

	static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	static Scanner sc = new Scanner(System.in);

	//used to input a String
	public static String inputWords(){ 
		String str=sc.nextLine();
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

	//method to check leap year
	public static boolean leapYear(int t){
		if(t%400==0 || t%4==0 && t%100!=0)
		{
			return true;
		}
		else
			return false;
	}

	// Method to find count of coin and coin percentage
	public static void coinPercentage(int n) {
		int cnt1=0,cnt2=0;
		double avgt,rand;
		for(int i=0;i<n;i++)
		{
			rand =Math.random();
			System.out.println(rand);
			if(rand<0.5)
			{
				cnt1++;
				System.out.println("Tail");
			}
			else
			{
				cnt2++;
				System.out.println("Head");
			}
		}
		System.out.println("Number of Heads:"+cnt2);
		System.out.println("Number of Tails:"+cnt1); 
		avgt = cnt1*100/n;
		System.out.println("Percentage of Head="+(100-avgt));
		System.out.println("Percentage of Tail="+avgt);
	}

	//Method to find harmonic number
	public static double harmonicNumber(int n) {
		double h=0;
		if(n!=0)
		{
			for(double i=1;i<=n;i++)
			{
				h=h+1/i;	
			}
		}
		return h;
	}


	//method to find prime factors of a number
	public static void primeFactors(int n) 
	{
		while(n%2==0)
		{
			System.out.print(2+ " ");
			n = n/2;

		}
		for(int i=3 ; i<=Math.sqrt(n);i=i+2)
		{
			while(n%i ==0)
			{
				System.out.print(i+ " ");
				n = n/i;
			}
		}
		if(n>2)
		{
			System.out.print(n);
		}
	}

	//Method to find power
	public static int pow(int i, int i2) {
		int pw = 1;
		while(i2>0)
		{
			pw = pw*i;
			i2--;
		}
		return pw;
	}

	//method to find euclidean distance
	public static void euclidean(int x, int y) {
		double dist = 0 , sum = 0;
		sum =Math.pow(x, 2)+Math.pow(y, 2);
		dist = Utility.sqrt(sum);
		System.out.println("Euclidean distance="+dist);
	}

	//method which print 2D array
	public static void printTwoDArray(Object[][] a) {
		for(int i=0 ; i<a.length;i++)
		{
			for(int j=0 ; j<a[0].length ; j++)
			{
				System.out.print(a[i][j]+" ");	
			}
			System.out.println();
		}
	}


	//method to find quadratic solution
	public static void quadraticSolution(double a, double b, double c) {
		double delta,root1,root2;
		delta = (b*b)-(4*a*c);
		if(delta>0)
		{
			double sq = Utility.sqrt(delta);
			root1 = (-b+sq)/(2*a);
			root2 = (-b-sq)/(2*a);
			System.out.println("Root 1 of x="+root1);
			System.out.println("Root 2 of x="+root2);
		}
		else if(delta==0)
		{
			System.out.println("Root="+(-b/(2*a)));
		}
		else {
			System.out.println("Delta="+delta);
			System.out.println("Not possible:");
		}
	}


	//method to find triplets which equals zero
	public static void triplet(int[] a) {
		int count=0;
		System.out.println("Triplets are:");
		for(int i=0 ; i<a.length-2 ; i++)
		{
			for(int j=i+1 ; j<a.length-1 ; j++)
			{
				for(int k=j+1 ; k<a.length ; k++)
				{
					if(a[i]+a[k]+a[j]==0)
					{
						count++;

						System.out.println(a[i]+ "+" +a[j]+ "+" +a[k]+ "=0");
					}
				}
			}

		}
		System.out.println("Number of triplets="+count);
	}

	//metod to find windchill
	public static void windChill(double t, double s) {
		double w=0.0;
		if(t<50 && s<120 && s>3)
		{
			w = 35.74 + 0.6215*t + (0.4275*t-35.75)*Math.pow(s, 0.16);
			System.out.println("The effective temperature is:"+w);

		}
		else
			System.out.println("The given values are not valid:");
	}

	//method to find distinct coupan numbers
	public static void distinctCoupan(int[] a) {
		Random rd = new Random();
		int n = a.length;
		int count=0,rand;	
		while(n!=0)
		{
			rand = rd.nextInt(5)+1;
			System.out.print(rand+" ");
			count++;
			for(int i = 0 ; i<n ; i++)
			{
				if(a[i]==rand)
				{	

					a[i]=a[n-1];
					n--;

					break;

				}
			}
		}
		System.out.println();
		System.out.println("Number of random numbers generated to make given distinct coupans:"+count);

	}

	//method to find elapsed time
	public static void stopWatch(long startTime) {
		long elapsedTime = 0;
		System.out.println("Press s to stop");
		String ch = Utility.inputWord();
		if(ch.equals("s"))
		{
			long endTime = System.currentTimeMillis();
			elapsedTime = (endTime-startTime)/1000;
			System.out.println("Elapsed Time:"+elapsedTime+" sec");
		}
	}


	//method to simulate gambler problem
	public static void gambler(int stake, int goal, int n) {
		int winCount=0 , lossCount=0 , betCount=0 , t =stake ;
		for(int i = 0 ; i<n ; i++)
		{
			while(stake!=0 && stake!=goal)
			{
				betCount++;
				if(Math.random()>0.5)
				{
					stake++;
				}
				else
				{
					stake--;
				}

			}
			if(stake==goal)
			{
				winCount++;
				stake=t;

			}
			else
			{
				lossCount++;
				stake=t;
			}
		}
		System.out.println("Number of wins ="+winCount);
		System.out.println("Number of loss ="+lossCount);
		System.out.println("Number of wins ="+betCount);
		int winPerc = winCount*100/n;
		System.out.println("Percentage of wins ="+winPerc);
		System.out.println("Percentage of loss="+(100-winPerc));
	}

	//method to play tictactoegame
	public static void playTicTacToe() {
		Object a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		Utility.printTwoDArray(a);
		Random rand = new Random();
		int rd,n;
		boolean b,bool;
		for(int i=0 ; i<5;i++)
		{
			System.out.println("It is computer term:");
			do {
				rd = rand.nextInt(9)+1;
				b = checkArray(a,rd);
			}while(b!=true);
			modifyArray(a,rd);
			boolean b1 = checkWin(a,'O');
			if(b1)
			{
				System.out.println("Computer won:");
				break;

			}

			if(i<4)
			{
				do {

					System.out.println("It is your term:Enter the value");
					n = Utility.inputInteger();
					bool = checkArray(a,n);
				}while(bool!=true);
				modifyArray1(a,n);
				boolean b2 = checkWin(a,'X');
				if(b2)
				{
					System.out.println("You won:");
					break;

				}

			}
			if(i==4)
			{
				System.out.println("Match draw");
			}

		}

	}

	//to check the winners
	private static boolean checkWin(Object[][] a, Object c) {
		int count2=0 , count4=0;

		//loop to check horizontal and diagonal
		for(int i = 0 ; i<a.length ; i++)
		{
			int count1=0 , count3=0 ;

			for(int j=0 ; j<a.length ;j++)
			{

				if(a[i][j] ==c)
				{
					count1++;
					if(count1==3)
					{
						return true;
					}
				}

				if(i==j && a[i][j]==c)
				{

					count2++;
					if(count2==3)
					{
						return true;
					}
				}

				if(a[j][i] == c)
				{
					count3++;
					if(count3==3)
						return true;
				}

				if(i+j+1 == a.length && a[i][j]==c)
				{
					count4++;
					if(count4==3)
						return true;
				}
			}
		}  

		return false;
	}

	//to check entered value present in array
	private static boolean checkArray(Object[][] a, Object rd) {
		for(int i=0 ; i<a.length;i++)
		{
			for(int j=0 ; j<a.length ; j++)
			{
				if(a[i][j]==rd) 
				{
					return true;

				}

			}

		}
		return false;
	}

	//to modify array value with 'X' which equals the given value
	private static void modifyArray1(Object[][] a, Object n) {
		for(int i=0 ; i<a.length;i++)
		{
			for(int j=0 ; j<a.length ; j++)
			{
				if(a[i][j]==n)
				{
					a[i][j]='X';
					break;
				}
			}
		}
		Utility.printTwoDArray(a);
	}
	//to modify array value with 'O' which equals the given value
	private static void modifyArray(Object[][] a, Object rd) {
		for(int i=0 ; i<a.length;i++)
		{
			for(int j=0 ; j<a.length ; j++)
			{
				if(a[i][j]==rd)
				{
					a[i][j]='O';
					break;
				}
			}
		}
		Utility.printTwoDArray(a);
	}




	//Create 2D array
	public static Object[][] create2DArray(Object[][] a)
	{
		for(int i=0 ; i<a.length;i++)
		{
			for(int j=0 ; j<a[0].length ; j++)
			{
				a[i][j] = sc.nextInt();	
			}
		}
		return a;
	}

	//method to create 1D integer array
	public static int[] createArray(int a[])
	{
		for(int i = 0 ; i<a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		return a;
	}

	//method to create 1D string array
	public static String[] createStringArray(String a[])
	{
		for(int i = 0 ; i<a.length ; i++)
		{
			a[i] = sc.next();
		}
		return a;
	}

	//print 1D string array
	public static void printStringArray(String a[])
	{
		for(int i = 0 ; i<a.length ; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	//print integer single array
	public static void printArray(int a[])
	{
		for(int i = 0 ; i<a.length ; i++)
		{
			System.out.print(a[i]+" ");
		}
	}


	//method which returns square root of a number
	public static double sqrt(double sum) 
	{
		double t , s;
		s = sum/2;
		do
		{
			t=s;
			s = (t+(sum/t))/2;
		}while(t-s!= 0 );
		return s;
	}

	//method to convert fahrenheit to celcius
	public static double farToCel(double f1) {
		double c = (f1-32)*5/9;
		return c;

	}

	//method to convert celcius to fahrenheit
	public static double celToFar(double c)
	{
		double f = (c*9/5)+32;
		return f;
	}

	//method to find square root of a number using newton method
	public static int sqrtNewton(int c) {
		int t=c;
		while(Math.abs(t-c/t)>(1e-15)*t)
		{
			t=((c/t)+t)/2;
		}
		return t;
	}

	//method to convert decimal to binary
	public static String decToBin(int n) {
		String binary ="";
		int r;
		while(n>0) {
			r = n%2;
			n = n/2;
			binary = r+binary;

		}
		return binary;
	}

	//method to convert binary to decimal
	public static int binToDec(int n1) {
		int c = 0,dec = 0; 
		while(n1>0)
		{
			int r=n1%10; 
			dec=dec+r*pow(2,c); 
			c++; 
			n1=n1/10; 
		}

		return dec; 
	}

	//Getting string from a file
	public static String getFromFile(String path) {
		BufferedReader br = null;
		String str = "";
		try {
			br = new BufferedReader(new FileReader(path));
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
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
		FileWriter writer = new FileWriter(file); 
       writer.write(data); 
       writer.flush();
       writer.close();
	}
	//Binary search method for strings
	public static boolean stringBinarySearch(String[] a, String s) {
		int l = 0 , h = a.length-1 , mid=0;
		while(l<=h)
		{
			mid = (l+h)/2; //finding mid value

			if(s.compareTo(a[mid])==0)
				return true;	

			else if(s.compareTo(a[mid])>1)
				l=mid+1;

			else
				h=mid-1;

		}
		return false;

	}

	//method for insertion sort
	public static String[] insertionSort(String[] str) {
		for(int i =1 ;i<str.length ; i++)
		{
			int j =i ;
			String temp = str[i];
			while(j>0 && str[j-1].compareToIgnoreCase(temp)>0)
			{
				str[j] = str[j-1];
				j--;

			}
			str[j] = temp;
		}
		return str;
	}

	//insertion sort using generic
	public static ArrayList<String> genericInsertionSort(String str[])
	{
		ArrayList<String> al = new ArrayList<String>();
		for(int i =1 ;i<str.length ; i++)
		{
			int j =i ;
			String temp = str[i];
			while(j>0 && str[j-1].compareToIgnoreCase(temp)>0)
			{
				str[j] = str[j-1];
				j--;

			}
			str[j] = temp;
		}
		for(int i=0 ; i<str.length ;i++)
		{
			al.add(str[i]);
		}
		return al;

	}

	//method for bubble sort
	public static int [] bubbleSort(int[] a) {
		int temp;
		for(int i = 0 ; i<a.length-1 ; i++)
		{
			int flag = 0;
			for(int j = 0 ; j<a.length-1-i ; j++ )
			{
				if(a[j] > a[j+1])
				{
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					flag = 1;
				}

			}
			if(flag==0)
				break;
		}
		return a;
	}

	//bubble sort using generic
	public static ArrayList<Integer> genericBubbleSort(int a[])
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		int temp;
		for(int i = 0 ; i<a.length-1 ; i++)
		{
			int flag = 0;
			for(int j = 0 ; j<a.length-1-i ; j++ )
			{
				if(a[j] > a[j+1])
				{
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					flag = 1;
				}

			}
			if(flag==0)
				break;
		}
		for(int i=0 ; i<a.length ;i++)
		{
			al.add(a[i]);
		}
		return al;
	}

	//method to check anagram of strings
	public static boolean checkAnagram(String str1, String str2) {
		if(str1.length() != str2.length())
			return false;

		int count1[] = new int[26];
		int count2[] = new int[26];

		for(int i=0 ; i<str1.length() ; i++)
		{
			char ch = str1.charAt(i);
			if(ch>=65 && ch<=90)
				count1[ch-65]++;
			else if(ch>=97 && ch<=122)
				count1[ch-97]++;		
		}

		for(int i=0 ; i<str2.length() ; i++)
		{
			char ch = str2.charAt(i);
			if(ch>=65 && ch<=90)
				count2[ch-65]++;
			else if(ch>=97 && ch<=122)
				count2[ch-97]++;
		}

		for(int i=0 ; i<26 ; i++)
		{

			if(count1[i]!=count2[i])

				return false;


		}

		return true;
	}

	//to check prime number
	public static boolean isPrime(int n) {


		int count = 0 ,k=1 ;
		while(k<=n/2)
		{
			if(n%k==0)
				count++;
			k++;
		}
		if(count==1)
			return true;
		else
			return false;

	}

	//to check anagram of numbers 
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
		if(a1.length>a2.length)
			return false;
		for(int i=0 ; i<10 ;i++)
		{
			if(a1[i]!=a2[i])
			{
				return false;
			}

		}
		return true;
	}

	//method to check palindrome of number
	public static boolean isPali(int i) {
		int rev = 0 ,t=i ;
		while(i>0)
		{
			rev = rev*10+i%10;
			i=i/10;
		}
		return rev==t ;
	}

	//replacing regex with input
	public static String replaceRegex(String [] str , String []s,String msg)
	{
		for(int i= 0 ;i<str.length ;i++)
		{
			Pattern p = Pattern.compile(s[i]);
			Matcher m = p.matcher(msg);
			if(m.find())
			{
				msg = msg.replaceAll(s[i],str[i]);
			}
		}
		return msg;
	}

}
