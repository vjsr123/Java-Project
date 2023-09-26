package com.learn.uppertolowercase;

import java.util.Scanner;

public class UpperToLowerCaseApp {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the String");
		String str =scan.next();
		char []arr=str.toCharArray();
        int len = str.length();
		char []newarr= new char [len];
		UpperToLowerCase.uppertolower(arr,newarr);
		// TODO Auto-generated method stub

	}

}
