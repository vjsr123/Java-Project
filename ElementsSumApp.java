package com.kodnest.arrays.ElementsSum;

import java.util.Scanner;

public class ElementsSumApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scan.nextInt();
		int []arr1= new int[size];
		System.out.println("Enter the elements in an array 1");
		//Storing the elements in an array1
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]= scan.nextInt();
		}
		int []arr2= new int[size];
		System.out.println("Enter the elements in an array 2");
		//Storing the elements in array2
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]= scan.nextInt();
		}
		// creating new array of name array3
		int []arr3=new int[size];
		//Method invoking
		ElementsSum.elementssum(arr1, arr2,arr3);
		// TODO Auto-generated method stub

	}

}
