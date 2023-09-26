import java.util.Scanner;

public class FactorialApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number");
		int a = scan.nextInt();
		Factorial f = new Factorial();
		f.factorialn(a);
		// TODO Auto-generated method stub

	}

}
