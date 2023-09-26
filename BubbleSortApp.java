package com.kodnest.arrays.BubbleSort;

import java.util.Scanner;

public class BubbleSortApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scan.nextInt();
		int []arr= new int[size];
		//storing the elements in the array
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the element "+(i+1)+" in an array");
			arr[i]=scan.nextInt();
		}
		//Displaying the elements before sorting
		System.out.print("The elements in an array before sorting: ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		int []sortedarray= BubbleSort.bubblesort(arr);
		//Displaying the elements after sorting
		System.out.println();
		System.out.print("The elements in an array after sorting: ");
		for(int x:sortedarray)
		{
			System.out.print(x+" ");
		}
		//invoking method
		BubbleSort.bubblesort(arr);
	}

}
