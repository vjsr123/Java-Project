package com.learn.uppertolowercase;

public class UpperToLowerCase {
	public static void uppertolower(char []arr,char []newarr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<='Z' && arr[i]>='A')
			{
				int uni=arr[i];
				uni = uni+32;
				char ch = (char)uni;
				newarr[i]= ch;
			}	
			if(arr[i]>='a')
			{
				newarr[i]=arr[i];
			}
		}
		String newstr1 =new String(newarr);
		System.out.println(newstr1);
	}


}
