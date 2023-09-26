package StudentintStringintarray;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no.of Students");
		int studentno=scan.nextInt();
		Student []arr=new Student[studentno];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the rollno of  student"+(i+1));
			int rollno=scan.nextInt();
			System.out.println("Enter the name of student "+(i+1));
			String name=scan.next();
			System.out.println("Enter the marks student "+(i+1));
			int marks=scan.nextInt();
			arr[i]=new Student(rollno,name,marks);
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i].rollno+" "+arr[i].name+" "+arr[i].marks);
		}
	
		
		// TODO Auto-generated method stub

	}

}
