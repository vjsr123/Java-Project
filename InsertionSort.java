package com.kodnest.arrays.InsertionSort;

public class InsertionSort {
	public static int[] insertionsort(int []arr)
	{
		for(int i=1;i<arr.length-1;i++)
		{
			int j=i-1;
			int ele=arr[i];
			while(j>=0&&arr[j]>ele)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=ele;
		}
		return arr;
	}

}
