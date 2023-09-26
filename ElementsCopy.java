import java.util.Scanner;

public class ElementsCopy {

	public static void main(String[] args) {
		Scanner Scan= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a = Scan.nextInt();
		int arr[]=new int[a];
		int brr[]= new int[a];
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.println("Enter the element");
			arr[i]= Scan.nextInt();
		}
		ElementsCopy.method(arr,brr);
	}
	public static void method(int []arr,int []brr)
	{

		for(int i=0;i<=arr.length-1;i++)
		{
			brr[i]=arr[i];
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(brr[i]);
		}

	}



}
