import java.util.Scanner;

public class DigitsumApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number");
		int a = scan.nextInt();
		digitsum ds = new digitsum();
		ds.digit(a);// TODO Auto-generated method stub

	}

}
