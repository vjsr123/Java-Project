package com.kodnest.arrays;

import java.util.Scanner;

public class LinearSearchApp {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a = scan.nextInt();
		int arr[]=  new int[a];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the element"+(i+1)+" of an array : ");
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the key to be searched ");
		int key = scan.nextInt();
		
		System.out.println(Search.linearsearch(arr,key));
		// TODO Auto-generated method stub

	}

}
