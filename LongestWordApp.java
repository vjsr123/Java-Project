package com.learn.Strings.longestword;

import java.util.Scanner;

public class LongestWordApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scan.nextLine();
		String []arr= str.split(" ");
		LongestWord.longest(arr);
	}
}
