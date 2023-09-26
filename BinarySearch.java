package com.kodnest.arrays;

public class BinarySearch {
	public static String binarysearch(int []arr,int key,int a)
	{
		int low=0;
		int high = a-1;
		while(high>=low)
		{
			int mid= (low+high)/2;
			 if(key==arr[mid])
			 {
				 return ("Element Found");
			 }
			 else if(key>arr[mid])
			 {
				 low = mid+1;
				 high = high;
			 }
			 else
			 {
				 low =low;
				 high = high-1;
			 }
		}
		return ("Element not found");
	}

}
