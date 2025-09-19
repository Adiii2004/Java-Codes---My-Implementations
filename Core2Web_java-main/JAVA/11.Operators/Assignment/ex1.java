/*
1.Write a program to perform basic arithmetic operations on two numbers.
Y our program should:
Perform addition, subtraction, multiplication, and division on the given numbers.
Display the results of each operation.
Example:
first number: 10
second number: 5
Addition: 10 + 5 = 15
Subtraction: 10 - 5 = 5
Multiplication: 10 * 5 = 50
Division: 10 / 5 = 2
*/

class Ex1 {

	public static void main(String[] args) {

		int num1 = 10;

		int num2 = 5;

		System.out.println("Addition : " + (num1 + num2) );

		System.out.println("Subtraction : " + (num1-num2));
	
		System.out.println("Multiplication : " + num1*num2);

		System.out.println("Division: " + num1/num2);

	}

}
