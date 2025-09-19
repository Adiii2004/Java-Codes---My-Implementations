
import java.util.*;

class Input5{
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to cheak it available in 16 table or not:- ");
		int num1 = sc.nextInt();
		if(num1%16==0){

			System.out.println(num1 + " is present in 16 table");

		}

		else{

			System.out.println(num1 + " is not present in 16 table");

		}

	}

}
		
