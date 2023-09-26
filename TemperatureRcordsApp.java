package com.kodnest.arrays.TempeartureRecords;

import java.util.Scanner;

public class TemperatureRcordsApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no.of Tempetatures");
		int size = scan.nextInt();
		//Creating an array of size
		int []arr= new int[size];
		System.out.println("Enter the Tempetatures in an array ");
		//Storing the elements in an array
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]= scan.nextInt();
		}
		//Method invoking
		TemperatureRecords.temperaturerecords(arr,size);
		// TODO Auto-generated method stub

	}

}
