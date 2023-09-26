package com.kodnest.arrays.SmallestNumber;

import java.util.Scanner;

public class SmallestNumberApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size in the array");
		int size = scan.nextInt();
		//Creating an array of size
		int []arr= new int[size];
		System.out.println("Enter the elements in the array ");
		//Storing the elements in an array
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]= scan.nextInt();
		}
		SmallestNumber.smallestnumber(arr);
		// TODO Auto-generated method stub

	}

}
