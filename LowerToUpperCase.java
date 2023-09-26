package com.learn.lowertouppercase;

public class LowerToUpperCase {
	public static void lowertoupper(char []arr,char []newarr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>=97 && arr[i]<=123)
			{
				int uni=arr[i];
				uni = uni-32;
				char ch = (char)uni;
				newarr[i]= ch;
			}
			if(arr[i]<=91 && arr[i]>=65)
			{
				newarr[i]=arr[i];
			}
		}
		String newstr =new String(newarr);
		System.out.println(newstr);
	}

}
