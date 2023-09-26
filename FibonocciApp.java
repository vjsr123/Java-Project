import java.util.Scanner;

public class FibonocciApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number");
		int a = scan.nextInt();
		Fibonocci fb =new Fibonocci();
		fb.fibonoccin(a);
		
		
		// TODO Auto-generated method stub

	}

}
