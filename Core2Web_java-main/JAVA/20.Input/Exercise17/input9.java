//Write a program to take the range from the user and print even numbers
import java.util.*;
class Input9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num1: = ");

		int num1 = sc.nextInt();

		Scanner ac = new Scanner(System.in);

		System.out.println("Enter num2: = ");
		
		int num2 = ac.nextInt();

		for(int i = num1; i<= num2; i++){

			if(i%2==0){

				System.out.println(i);

			}
		
		}

	}

}
