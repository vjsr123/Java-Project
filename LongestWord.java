package com.learn.Strings.longestword;

public class LongestWord {
	public static void longest(String []arr)
	{	String max="";
		for(int  i=0;i<=arr.length-1;i++)
		{
			int count =0;
			for(int j=0;j<=arr[i].length()-1;j++)
			{
				count++;
			}
			if(max.length()<count)
			{
				max=arr[i];
			}
			
		}
		System.out.println("LONGEST WORD IN THE STRING IS : "+max);
	}

}
