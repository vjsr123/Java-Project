package com.kodnest.arrays.SelectionSort;

import java.util.Scanner;

public class SelectionSortApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scan.nextInt();
		//Creating an array 
		int []arr = new int[size];
		System.out.println("Enter the elements in an array: ");
		//Storing the elements in the array
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Before sorting the elements are: ");
		//Displaying the elements in the array before sorting
		for(int x:arr)
		{
			System.out.println(x+" ");
		}
		//creating array of same size
		int []sortedArray=SelectionSort.selectionsort(arr);
		System.out.println("After sorting the elements are: ");
		//Displaying the elements in the array after sorting
		for(int x:sortedArray)
		{
			System.out.println(x+" ");
		}
		
		SelectionSort.selectionsort(arr);
		
	}

}
