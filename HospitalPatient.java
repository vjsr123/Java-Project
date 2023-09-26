package JaggedArray;

import java.util.Scanner;

public class HospitalPatient {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int [][]arr = new int[3][];
		arr[0]= new int[2];
		arr[1]= new int[4];
		arr[2]= new int[3];
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the age of Hospital"+(i+1)+"Patient"+(j+1));
				arr[i][j]= scan.nextInt();
			}
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println(" The age of Hospital"+(i+1)+"Patient"+(j+1)+" : "+arr[i][j]);
				
			}
		}
		// TODO Auto-generated method stub

	}

}
