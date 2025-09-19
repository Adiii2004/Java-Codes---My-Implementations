/*
9. Write a program to check the day number(1-7) and print the corresponding day of week.
Input : 1
Output: Monday
Input : 7
Output: Sunday
Input : 8
Output: day number must be between 1 to 7!!!!
*/

class Ex9 {

	public static void main(String[] args) {

		int num1 = 1;

		if(num1 == 1){

			System.out.println("Sunday");

		}

		else if(num1 == 2){

			System.out.println("Monday");

		}
		
		else if(num1 == 3){

			System.out.println("Tuesday");

		}

		else if(num1 == 4){

			System.out.println("Wednesday");

		}

		else if(num1 == 5){

			System.out.println("Thursday");

		}

		else if(num1 == 6){

			System.out.println("Friday");

		}

		else if(num1 == 7){

			System.out.println("Saturday");

		}

		else{

			System.out.println("Please enter valid input ");

		}

	}

}



