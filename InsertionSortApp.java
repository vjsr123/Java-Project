package com.kodnest.arrays.InsertionSort;

import java.util.Scanner;

import com.kodnest.arrays.SelectionSort.SelectionSort;

public class InsertionSortApp {

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
			System.out.print(x+" ");
		}
		//creating array of same size
		int []sortedArray=InsertionSort.insertionsort(arr);
		System.out.print("After sorting the elements are: ");
		//Displaying the elements in the array after sorting
		for(int x:sortedArray)
		{
			System.out.println(x+" ");
		}
		
		InsertionSort.insertionsort(arr);
		

	}

}
