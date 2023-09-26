package com.learn.Strings.ReverseorderofWords;

public class ReverseOrderOfWords {
	public static void reverse(String []arr,String newstr)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			newstr= newstr+arr[i]+" ";
		}
		System.out.print(newstr);
	}

}
