package StudentClass;

import java.util.Scanner;

public class Studentclass {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the no.of companies");
		int a = scan.nextInt();
		System.out.println("Enter the no.of employees");
		int b = scan.nextInt();
		String [][]arr=new String[a][b];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the name of company "+(i+1)+" employee "+(j+1));
				arr[i][j]=scan.next();
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("the name of company "+(i+1)+" employee "+(j+1)+" : "+arr[i][j]);
			}
		}
	}

}
