package com.learn.Strings.ReverseorderofWords;

import java.util.Scanner;

public class ReverseOrderOfWordsApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str =scan.nextLine();
		//Creating  String array
		String []arr=str.split(" ");
		//Create new empty String 
		String newstr="";
		ReverseOrderOfWords.reverse(arr,newstr);
		// TODO Auto-generated method stub

	}

}
