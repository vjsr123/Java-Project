package com.kodnest.arrays.ElementsSum;

public class ElementsSum {
	public static void elementssum(int []arr1,int []arr2,int []arr3)
	{
		//Summing up of the corresponding elements 
		for(int i=0;i<=arr3.length-1;i++)
		{
			arr3[i]=arr1[i]+arr2[i];
		}
		//Displaying the Elements in array3
		System.out.println("The Final Array : ");
		for (int x:arr3)
		{
			System.out.print(x+" ");
		}
	}
	

}
