import java.util.Scanner;

public class Sum {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a = scan.nextInt();
		int []arr = new int[a];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		Sum.core(arr);
	}
		private static void core(int []arr)
		{
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum+=arr[i];// TODO Auto-generated method stub
		}
		
		System.out.println("The sum "+sum);
		}

	}

