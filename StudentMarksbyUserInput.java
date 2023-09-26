package Array3D;

import java.util.Scanner;

public class StudentMarksbyUserInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no.of Schools");
		int a = scan.nextInt();
		System.out.println("Enter the no.of classes of School");
		int b = scan.nextInt();
		System.out.println("Enter the no.of Students in class");
		int c= scan.nextInt();
		int [][][]arr = new int[a][b][c];
		
		for(int i=0;i<=arr.length-1;i++)
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

	}

}
