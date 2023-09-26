package com.kodenst.arrays.PositiveSum;

public class PositiveSum {
	public static void positivesum(int []arr)
	{
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			//Checking the values are positive or not
			if(arr[i]>0)
			{
				sum+=arr[i];
			}
		}
		//Displaying the sum
		System.out.println("The sum of Positive numbers in an array: "+sum);
	}

}
