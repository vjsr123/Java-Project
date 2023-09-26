package com.kodnest.arrays.LinearBinarySearch;

import java.util.Scanner;

public class LinearBinarySearchApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scan.nextInt();
		int []arr = new int[size];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the key to be searched ");
		int key = scan.nextInt();
		System.out.println("Press 1 for Linear Search");
		System.out.println("Press 2 for Binary Search");
		int a = scan.nextInt();
		if(a==1)
		{
		System.out.println(LinearBinarySearch.linearsearch(arr, key));
		}
		if(a==2)
		{
		System.out.println(LinearBinarySearch.binarysearch(arr, key));
		}

	}

}
