package com.study.BinarySelection;

public class BinarySelection {
	public static void sortedcheck(int []arr,int key,int []newarr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i+1]>arr[i])
			{
			}
		}
		binarysearch(arr,key);
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i+1] < arr[i])
			{
				int min=arr[i];
				int pos=i;
				for(int j=i+1;j<=arr.length-2;j++)
				{
					if(arr[j]>min)
					{
						min =arr[j];
						pos=j;
					}
				}
				int temp =arr[pos];
				arr[pos]=arr[i];
				arr[i]=temp;
			}
			newarr[i]=arr[i];
		}
		binarysearch1(newarr,key);
	}

	public static void binarysearch(int []arr,int key)
	{
		int high = arr.length-1;
		int low=0;
		while(high>=low)
		{
			int mid = (low+high)/2;
			if(key==arr[mid])
			{
				System.out.println("The key element is found at index: "+mid);
			}
			else if(key>arr[mid])
			{
				low= mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		System.out.println("The key is not present in the array");
	}
	public static void binarysearch1(int []newarr,int key)
	{
		int high = newarr.length-1;
		int low=0;
		while(high>=low)
		{
			int mid = (low+high)/2;
			if(key==newarr[mid])
			{
				System.out.println("The key element is found at index: "+mid);
			}
			else if(key>newarr[mid])
			{
				low= mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		System.out.println("The key is not present in the array");
	}

}
