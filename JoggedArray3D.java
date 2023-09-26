package JoggedArray3D;

import java.util.Scanner;

public class JoggedArray3D {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no.of Schools");
		int a = scan.nextInt();
		
		int [][][]arr = new int[a][][];
		//creating rows in 3D jogged array
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the no.of classes in School"+(i+1));
			int b=scan.nextInt();
			arr[i]=new int[b][];
		}
		//creating coloumns in 3D jogged array
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr[i].length-1;j++)
			{
				System.out.println("Enter the no.of Students in Class"+(j+1)+"School"+(i+1));
				int c= scan.nextInt();
				arr[i][j]=new int[c];
			}
		}
		//storing elements in array
		
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
		// Displaying elements in 3d array
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
