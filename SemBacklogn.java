package Backlogs;

import java.util.Scanner;

public class SemBacklogn {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the no.of semesters");
		int sem =scan.nextInt();
		int []arr=new int[sem];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Do you have any backlogs in semester"+(i+1));
			boolean res = scan.nextBoolean();
			if(res=true)
			{
				System.out.println("No.of Backlogs in sem "+(i+1));
				arr[i]=scan.nextInt();
				
			}
			if(res=false)
			{
				arr[i]= 0;
			}
			
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("the backlogs in sem "+(i+1)+": "+arr[i]);
		}
		
		
		

	}

}
