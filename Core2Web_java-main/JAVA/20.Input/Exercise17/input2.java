
import java.util.*;

class Input2{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age:= ");

		byte age = sc.nextByte();

		if(age>=18){

			System.out.println("The voter is  eligible for voting");

		}
		else{
	
			System.out.println("The voter is not eligible for voting");

		}
	}

}

