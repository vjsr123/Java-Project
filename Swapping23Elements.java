package com.kodnest.arrays;

import java.util.Scanner;

public class Swapping23Elements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int a = scan.nextInt();
		int []arr=new int[a];
		//reading the elements of array
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the element "+(i+1)+" in an array");
			arr[i]=scan.nextInt();
		
		}
		
			//Displaying the elements of array
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i+1]=arr[i+2];
			arr[i+2]=arr[i+1];
			System.out.print(arr[i]+" ");
		}
	}

}
