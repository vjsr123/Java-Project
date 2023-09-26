package com.kodnest.arrays.SmallestNumber;

public class SmallestNumber {
	public static void smallestnumber(int []arr)
	{
		int small = arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<small)
			{
				small=arr[i];
				
			}
		}
		System.out.println("The Smallest number in the array is : "+ small);
	}

}
