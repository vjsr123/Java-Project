import java.util.Scanner;

public class charcaseapp {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a character");
		char ch  = scan.next().charAt(0);
		charcase c = new charcase();
		c.method(ch);
		// TODO Auto-generated method stub

	}

}
