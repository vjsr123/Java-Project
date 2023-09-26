package com.kodnest.arrays.sorted;

public class SortedCheck {
	public static String sortedcheck(int []arr)
	{
		for(int i=0;i<=arr.length-2;i++)
		{
			if(arr[i]<arr[i+1])
			{
			}
			else if(arr[i]>arr[i+1])
			{
				
			}
			else
			{
				return "The given array is not sorted ";
			}
		}
		return"The given array is sorted array";
		
	}

}
