package MergingArrays;

import java.util.Scanner;

public class ArrayMerge {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of array1");
	int a = scan.nextInt();
	System.out.println("Enter the Elements in array 1");
	int []arr1= new int[a];
	
	// storing the elements in array1
	for(int i=0;i<=arr1.length-1;i++)
	{
		arr1[i]=scan.nextInt();
	}
	
	System.out.println("Enter the size of array 2");
	int b =  scan.nextInt();
	System.out.println("Enter the elements in array 2");
	int []arr2= new int [b];
	for(int i=0;i<=arr2.length-1;i++)
	{
		arr2[i]=scan.nextInt();
	}
	ArrayMerge.method(a,b,arr1,arr2);
	}
	public static void method(int a,int b,int []arr1,int []arr2)
	{
	int c = a+b;
	int []arr3=new int [c];
	for(int i=0;i<=arr1.length-1;i++)
	{
		arr3[i] = arr1[i];
	}
	for(int i=a;i<=arr3.length-1;i++)
	{
		arr3[i] = arr2[i-a];
	}
	System.out.print("The Elements in merged array : ");
    
	for(int i=0;i<=arr3.length-1;i++)
	{
		System.out.print(arr3[i]+" ");
	}
	}
	
	
	
}
