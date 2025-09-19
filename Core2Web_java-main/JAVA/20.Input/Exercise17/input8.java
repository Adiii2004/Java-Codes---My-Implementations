//write a program to take the range as a input and printthe sum of number is range
import java.util.*;

class Input8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num1: = ");

		int num1 = sc.nextInt();

		Scanner ac = new Scanner(System.in);

		System.out.println("Enter num2: = ");
		
		int num2 = ac.nextInt();
		
		int sum = 0;

		for(int i =num1; i<=num2; i++){
			sum+=i;
			System.out.println(sum);
			

		}

	}

} 

		
