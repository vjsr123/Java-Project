package com.kodnest.arrays;

public class Search {

	public static String linearsearch(int []arr,int key)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]== key)
			{
				return ("key "+key+" is present at index "+i);
			}
			

		}
		return ("key "+key+" is not Present");
		// TODO Auto-generated method stub
		

	}

}
