package MatrixDiagonalSum;

import java.util.Scanner;

public class DiagonalSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no.of rows");
		int rows = scan.nextInt();
		System.out.println("Enter the no.of coloumns");
		int col = scan.nextInt();
		int [][]arr= new int[rows][col];
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the values of rows "+(i+1)+" coloumns "+(j+1));
				arr[i][j]= scan.nextInt();
				if(i==j)
				{
				sum = sum+ arr[i][j];
				}
			}
		}
		int res=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				if(i+j==rows-1 || i+j==col-1)
				{
				res = res+ arr[i][j];
				}
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
		System.out.println("Diagonal 1 Sum:"+sum);
		System.out.println("Diagonal 2 Sum:"+res);
		

	}

}
