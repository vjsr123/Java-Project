package com.kodnest.arrays.TempeartureRecords;

public class TemperatureRecords {
	public static void temperaturerecords(int []arr,int size)
	{
		float sum=0;
		//Summing up of all the temperatures
		for(int i=0;i<=arr.length-1;i++)
		{
			sum+=arr[i];
		}
		//Calculating average of tempetatures
		sum = sum/size;
		//Displaying the Average of Temperatues
		System.out.println("The Average of Tempetatures is : "+sum);
	}

}
