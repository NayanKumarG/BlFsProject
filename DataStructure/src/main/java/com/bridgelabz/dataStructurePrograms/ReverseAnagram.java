package com.bridgelabz.dataStructurePrograms;
import com.bridgelabz.util.*;
public class ReverseAnagram {
	static StackLinkedList<Integer> sll = new StackLinkedList<>();

	public static void main(String[] args) {
		int a[] = new int [168];
		int j = 0;
		for (int i = 0 ; i<=1000 ; i++ )
		{
			if(Utility.isPrime(i))
			{
				a[j++] = i;
			}
		}

		for(int i=0 ; i<a.length-1 ; i++)
		{
			for(int k = 0 ; k<a.length ; k++)
			{


				if(Utility.isAnagram(a[i], a[k]) && a[i]!=a[k])
				{
				
						sll.push(a[i]);
						break;
					
				

				}

			}
		}
		System.out.println("Before reversing:");
		System.out.println(sll);
		System.out.println("After reversing:");
		sll.reverse();
		System.out.println(sll);
	}

}
