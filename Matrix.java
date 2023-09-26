package Matrix;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no.of rows");
		int rows = scan.nextInt();
		System.out.println("Enter the no.of coloumns");
		int col = scan.nextInt();
		int [][]arr= new int[rows][col];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the values of rows "+(i+1)+" coloumns "+(j+1));
				arr[i][j]= scan.nextInt();
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
		

	}

}
