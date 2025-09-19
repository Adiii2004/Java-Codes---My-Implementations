/*
6.Write a program to demonstrate various assignment operators.
Y our program should:
Initialize two variables with numeric values.
Use compound assignment operators like +=, -=, *=, /=, %= to modify the values
of the variables.
Display the updated values after each operation.
Example:
	Initial value of a: 10
	Initial value of b: 5
	After a += 3, a = 13
	After b -= 2, b = 3
	After a *= 2, a = 26
	After b /= 3, b = 1
	After a %= 5, a = 1
*/

class Ex6 {

	public static void main (String[] args) {

		int A = 8;

		int B = 9;

		System.out.println(A += 3);//11

		System.out.println(B -= 2);//7

		System.out.println(A *= 2);//22

		System.out.println(A /= 4);//5

		System.out.println(A %= 6);//5

	}

}
