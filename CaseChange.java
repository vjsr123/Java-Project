package com.learn.Casechange;

public class CaseChange {
	public static void lowertoupper(char[]arr,char []newarr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>=97 && arr[i]<=123)
			{
				int uni = arr[i];
				uni = uni-32;
				char ch = (char)uni;
				newarr[i]=ch;
			}	
			if(arr[i]>=65 && arr[i]<=91)
			{
				int uni1=arr[i];
				uni1=uni1+32;
				char ch1 = (char)uni1;
				newarr[i]=ch1;
			}
		}
		String newstr = new String(newarr);
		System.out.println(newstr);
	}
}

