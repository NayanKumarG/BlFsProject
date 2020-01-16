package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.util.Utility;

//program to check palindrome and anagram numbers
public class PaliAndAnagram {

	public static void main(String[] args) {
		System.out.println("Enter a range:");
		int n = Utility.inputInteger();
		int j=n;

		int a[] = new int[j];

		boolean rs;
		int k=0,count=0;;
		for(int i=1 ; i<=n ; i++)
		{
			rs =Utility.isPrime(i);
			if(rs)
			{
				a[k++]=i;
				count++;
			}
		}
		int b[] = new int[count];
		for(int i=0 ; i<a.length ;i++)
		{
			if(a[i]>0)
			{
				b[i] = a[i];
			}

		}
		paliAnagram(b);


	}

	//method to check numbers are pali and anagram
	private static void paliAnagram(int[] a) {
		for(int i = 0 ; i<a.length-1 ; i++)
		{
			for(int j = i ; j<a.length ; j++)
			{

				if(Utility.isPali(a[i])==true && Utility.isAnagram(a[j],a[i])==true)
				{
					System.out.println(a[i]+" and "+a[j]+ " are palindrome and anagram");
				}
			}
		}
	}


}


