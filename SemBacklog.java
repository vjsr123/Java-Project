package Backlogs;

import java.util.Scanner;

public class SemBacklog {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the no.of semesters");
		int size = scan.nextInt();
		String  []arr=new String[size];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Do you have any backlogs in semester "+(i+1));
			boolean res = scan.nextBoolean();
			if(res == true)
			{
				arr[i]="yes";
			}
			else
			{
				arr[i]="no";
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			
			System.out.println("Backlogs in semester "+(i+1)+": "+arr[i]);
		}
		
		// TODO Auto-generated method stub

	}

}
