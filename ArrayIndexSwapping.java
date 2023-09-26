package com.kodnest.arrays;

import java.util.Scanner;

public class ArrayIndexSwapping {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scan.nextInt();
		int []arr=new int[size];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the element "+(i+1)+" in an array : ");
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the 2 index values in the range 0 to "+(arr.length-1)+"to be swapped");
		int a= scan.nextInt();
		int b= scan.nextInt();
		System.out.print("The Elements before swapping: ");
		for(int x:arr)
		{
		System.out.print(x+" ");
		}
		System.out.println();
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		System.out.print("The Elements before swapping: ");
		for(int x:arr)
		{
		System.out.print(x+" ");
		}
		

	}

}
