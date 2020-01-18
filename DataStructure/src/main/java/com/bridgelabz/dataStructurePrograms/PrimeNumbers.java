package com.bridgelabz.dataStructurePrograms;
import com.bridgelabz.util.*;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int r = 10 ; 
		int c = 100 ;
		int [][] a = new int[r][c];
		int[][] res = Utility.insert2DArray(a);
		
		int k=0;
		for(int i = 0 ; i<res.length ;i++)
		{
		System.out.println("Prime numbers between "+k+"-"+(k+100));
		k=k+100;
		for(int j=0 ; j<a[i].length ; j++)
		{
			if(a[i][j]==0)
			{
				break;
			}
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
		}
		
		
	}


}            
