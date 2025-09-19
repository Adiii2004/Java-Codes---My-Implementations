
import java.util.*;

class Scanner1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Name:- ");

		String name = sc.next();

		System.out.println("Enter Your COmpany Name:- ");

		String cname = sc.next();

		System.out.println("Wing No:-  ");

		char wing = sc.next().charAt(0);

		System.out.println("Enter Flat No:- ");

		int flat = sc.nextInt();

		System.out.println("Enter Your Name:- " + name);
		System.out.println("Enter Your COmpany Name:- " + cname);
		System.out.println("Wing No:-  "+ wing);
		System.out.println("Enter Flat No:- " + flat);

	}

}

