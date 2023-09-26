package com.learn.Strings.ReverseWords;

public class ReverseWords {
	public static void reversewords(String str,String []arr,String newstr)
	{
		//Traverse through each word in an array
		for(int i=0;i<=arr.length-1;i++)
		{
			String revstr="";
			//traverse through each letter in an index
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				//adding the characters to revstr 
				revstr=revstr+(arr[i].charAt(j)+"");
			}
			//Adding the revered words in newstr
			newstr=newstr+revstr+" ";
		}
		//Displaying the newstr
		System.out.println(newstr);
	}

}
