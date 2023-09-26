import java.util.Scanner;

public class EvenApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the n value");
		int n = scan.nextInt();
		Even e = new Even();
		e.neven(n);
		// TODO Auto-generated method stub

	}

}
