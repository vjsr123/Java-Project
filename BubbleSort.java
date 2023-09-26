package com.kodnest.arrays.BubbleSort;

public class BubbleSort {
		public static int[] bubblesort(int []arr)
		{
		{
			int temp;
			for(int i=0;i<=arr.length-2;i++)
			{
				for(int j=0;j<=arr.length-i-2;j++)
				{
					if(arr[j]>arr[j+1])
					{
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
		
			return arr;
		}
		
		// TODO Auto-generated method stub

	}

}
