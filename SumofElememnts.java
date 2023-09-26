package ElementsSum2DArray;

import java.util.Scanner;

public class SumofElememnts {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no.of rows");
		int rows = scan.nextInt();
		System.out.println("Enter the no.of coloumns");
		int col = scan.nextInt();
		int [][]arr= new int[rows][col];
		int sum = 0;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the values of rows "+(i+1)+" coloumns "+(j+1));
				arr[i][j]= scan.nextInt();
				sum = sum+arr[i][j];
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Sum of elements  of matrix"+sum);
		
		// TODO Auto-generated method stub

	}

}
