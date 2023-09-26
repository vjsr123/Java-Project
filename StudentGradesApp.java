package com.kodnest.arrays.StudentGrades;

import java.util.Scanner;

public class StudentGradesApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scan.nextInt();
		int []arr= new int[size];
		System.out.println("Enter the elements in an array ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]= scan.nextInt();
		}
		StudentGrades.studentgrades(arr);
		// TODO Auto-generated method stub

	}

}
