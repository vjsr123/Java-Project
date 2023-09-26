package com.kodnest.arrays.FindPrime;

public class FindPrime {
	public static void findprime(int []arr)
	{
		int count =0;
		System.out.println("The prime numbers in an array: ");
		for(int i=1;i<=arr.length-1;i++)
		{
			for(int j=2;j<=arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					count++;
				}
			}

		}

	}

}
