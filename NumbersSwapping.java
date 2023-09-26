package com.kodnest.arrays;

import java.util.Scanner;

public class NumbersSwapping {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a= scan.nextInt();
		System.out.println("Enter the second number");
		int b= scan.nextInt();
		System.out.print("The Elements before swapping: "+ a+" " + b );
		System.out.println();
		int temp=a;
		a=b;
		b=temp;
		System.out.print("The Elements before swapping: "+ a +" "+ b);
	
	}

}
