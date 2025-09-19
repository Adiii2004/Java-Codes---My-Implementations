/*
4.Write a program to demonstrate logical operators.
Y our program should:
Perform logical AND, logical OR, and logical NOT operations on the given
boolean values.
Display the results of each operation.
Example:
	first boolean value (true/false): true
	second boolean value (true/false): false
	Logical AND: true && false = false
	Logical OR: true || false = true
	Logical NOT for the first value: !true = false
	Logical NOT for the second value: !false = true
*/

class Ex4{

	public static void main (String[] args) {

		boolean x = true;

		boolean y = false;

		System.out.println(x && y);

		System.out.println(x || y);

		System.out.println(!x);

		System.out.println(!y);

	}

}
