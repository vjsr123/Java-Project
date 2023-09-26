package com.kodnest.arrays.EvenNumbers;

public class EvenNumbers {
	public static void evennumbers(int []arr)
	{
		int sum=0;
		// counting the no of even numbers in an array
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				sum++;
			}
		}
		//Displaying the count
		System.out.println("No.of even numbers in an array: "+sum);
	}

}
