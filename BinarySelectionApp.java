package com.study.BinarySelection;

import java.util.Scanner;

public class BinarySelectionApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scan.nextInt();
		int []arr= new int[size];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the key to be searched ");
		int key = scan.nextInt();
		System.out.println("Before sorting the elements are:");
		for(int x:arr)
		{
			System.out.println(x+" ");
		}
		int []newarr = new int[size];
		BinarySelection.sortedcheck(arr,key,newarr);
				
	}
}
