package com.kodenst.arrays.PositiveSum;

import java.util.Scanner;

public class PositiveSumApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int a = scan.nextInt();
		int arr[]=  new int[a];
		System.out.println("Enter the elements of an array : ");
		//Storing the elements in an array
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		// method invoking
		PositiveSum.positivesum(arr);
		// TODO Auto-generated method stub

	}

}
