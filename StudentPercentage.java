package StudentPercentage;

import java.util.Scanner;

public class StudentPercentage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no.of classes");
		int a = scan.nextInt();
		float [][]arr = new float[a][];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the no.of students in class "+(i+1));
			int c = scan.nextInt();
			arr[i]= new float[c];
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<arr[i].length-1;j++)
			{
				System.out.println("Enter the percentage of class "+(i+1)+"student"+(j+1));
				arr[i][j]= scan.nextFloat();			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<arr[i].length-1;j++)
			{
				System.out.println(" The percentage of class "+(i+1)+"student"+(j+1)+" : "+arr[i][j]);			}
		}
		// TODO Auto-generated method stub

	}

}
