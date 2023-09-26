package Array3D;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][][]arr = new int[2][3][5];
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for (int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("Enter the marks of School "+ (i+1)+ " Class "+(j+1)+" Student "+(k+1));
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for (int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("The marks of School "+(i+1)+ " Class "+(j+1)+" Student "+"  : "+arr[i][j][k]);
				}
			}
		}
		
		// TODO Auto-generated method stub

	}

}
