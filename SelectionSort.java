package com.kodnest.arrays.SelectionSort;

public class SelectionSort {
	public static int[] selectionsort(int []arr)
	{
		//No.of Positions
		for(int i=0;i<=arr.length-2;i++)
		{
			int min=arr[i];
			int pos=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				//checking the elements with condition
				if(arr[j]<min)
				{
					min= arr[j];
					pos=j;
				}
			}
			//Swapping the elements
			int temp= arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
		}
		// returning  sorted array
		return arr;
	}

}
