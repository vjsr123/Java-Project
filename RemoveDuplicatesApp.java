package com.learn.removeduplicates;

import java.util.Scanner;

public class RemoveDuplicatesApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str =scan.next();
		String newstr="";
		removeduplicates(str,newstr);
		// TODO Auto-generated method stub

	}
	public static void removeduplicates(String str,String newstr)
	{
		for(int i=0;i<=str.length()-1;i++)
		{
			if(!newstr.contains(str.charAt(i)+""))
			{
				newstr = newstr+str.charAt(i);
			}
		}
		System.out.println(newstr);

	}
}
