package com.kodnest.arrays.StudentGrades;

public class StudentGrades {
	public static void studentgrades(int []arr)
	{
		int count =0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>75)
			{
				count++;
			}
		}
		System.out.println("The No.of Students Scored marks above 75 : "+count);
	}

}
