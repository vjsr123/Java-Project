package LinearSearch;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a= scan.nextInt();
		int []arr = new int[a];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();	
		}
		System.out.println("Ente the element to be searched ");
		int ele = scan.nextInt();
		int res = method(arr,ele);
		if(res!=-1)
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not  found");
		}
		LinearSearch.method(arr,ele);
		
		// TODO Auto-generated method stub
   }
	public static int method(int []arr,int ele)
	{
	
		for(int i=0;i<=arr.length-1;i++)
		{
		if(arr[i]==ele)
		{
			return i;
		}
		
		}return -1;
		
		
	}

}
