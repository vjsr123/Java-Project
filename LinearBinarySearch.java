package com.kodnest.arrays.LinearBinarySearch;

public class LinearBinarySearch {
	public static String linearsearch(int []arr,int key)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==key)
			{
				return("Key "+key+" is present at index "+i);
			}

		}
		return "Key is not present";
	}
	public static String binarysearch(int []arr,int key)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				int low=0;
				int high = arr.length-1;
				while(high >= low)
				{
					int mid =(low+high)/2; 
					if (key==arr[mid])
					{
						return("Key"+key+" is present at index "+mid);
					}
					else if(key>arr[mid])
					{
						low=mid+1;
					}
					else
					{
						high=mid-1;
					}
				}
				
			}
			return "Enter the sorted array";
		}
			
	return "Key is not Present in the array";

}

}
