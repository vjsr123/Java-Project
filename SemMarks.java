import java.util.Scanner;

public class SemMarks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the the no.of semesters");
		int size = scan.nextInt();
		int []arr = new int[size];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the marks in semester "+(i+1)+":");
			arr[i] = scan.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("The percentage in semester "+(i+1)+" is "+arr[i]+" ");
		}

	}

}
