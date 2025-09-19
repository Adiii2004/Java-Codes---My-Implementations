import java.util.*;

class Input10 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the maths marks:- ");

		int mark1 = sc.nextInt();

		Scanner ac = new Scanner(System.in);

		System.out.println("Enter the Science marks:- ");

		int mark2 = ac.nextInt();

		Scanner dc = new Scanner(System.in);

		System.out.println("Enter the History marks:- ");

		int mark3 = dc.nextInt();

		Scanner ec = new Scanner(System.in);

		System.out.println("Enter the Social Science marks:- ");

		int mark4 = ec.nextInt();

		Scanner cc = new Scanner(System.in);

		System.out.println("Enter the Graphics marks:- ");

		int mark5 = cc.nextInt();

		System.out.println("The Total Marks is :- "+ (mark1 + mark2 + mark3 + mark4 + mark5 ));

	}

}
