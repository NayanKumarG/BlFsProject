package com.bridgelabz.jUnitTestingPrograms;
import com.bridgelabz.util.Utility;

//Program for vending machine to find minimum changes of notes
public class VendingMachine {

	public static void main(String[] args) 
	{
		System.out.println("Enter the amount for change:");
		long n = Utility.inputLong();
		vendingMachine(n);

	}

	private static void vendingMachine(long n) {
		VendingMachine vm = new VendingMachine();
		long sum = 0 , t= n;
		int a[] = {1,2,5,10,50,100,500,1000};
		int count[] = new int [8];

		System.out.println("Changes in Machine:");
		Utility.printArray(a);
		while(sum!=t)
		{
			int l = vm.checkLarge(a,n);
			for(int i=0 ; i<count.length ; i++)
			{
				if(l==a[i])
				{
					count[i]++;
				}
			}
			sum = sum+l;
			n=n-l;
		}
		System.out.println();
		System.out.println("Your amount="+sum);
		System.out.println("Changes:");
		for(int i= 0 ; i <count.length ; i++)
		{
			if(count[i]>0)
			{
				System.out.println(a[i]+"Rs-->"+count[i]);
			}
		}

	}

	
	//checking largest not from array
	public int checkLarge(int[] a, long n) {
		int big=0;
		for(int i=0 ; i<a.length;i++)
		{
			if(a[i]<=n)
			{
				if(a[i]==n)
				{
					return a[i];

				}

				else if(big<a[i])
				{
					big=a[i];
				}

			}
		}

		return big;
	}
}


