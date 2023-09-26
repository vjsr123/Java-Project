package com.kodnest.arrays.ReplaceNegatives;

import java.util.Scanner;

public class ReplaceNegatives {

		public static int[] negativereplace(int []arr)
		{
			// for the elements 1 to array length
			for(int i=0;i<=arr.length-1;i++)
			{
				// Cheking the elements with the condition
				if(arr[i]<0)
				{
					arr[i]= 0;
				}
			}
			return arr;
				
		}
	}



