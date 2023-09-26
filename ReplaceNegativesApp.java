package com.kodnest.arrays.ReplaceNegatives;

import java.util.Scanner;

public class ReplaceNegativesApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scan.nextInt();
		// crating an array of size 
		int []arr= new int[size];
		System.out.println("Enter the elements in an array");
		//Storing the elements in an array
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]= scan.nextInt();
		}
		//creating new array to store the new values 
		int []posArray= ReplaceNegatives.negativereplace(arr);
		//Displaying the elements in an array
		for(int x:posArray)
		{
			System.out.print(x+" ");
		}
		// Method Invoking
		ReplaceNegatives.negativereplace(arr);
		// TODO Auto-generated method stub

	}

}
