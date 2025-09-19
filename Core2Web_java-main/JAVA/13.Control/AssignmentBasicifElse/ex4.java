/*
4. Write a program to check whether the given Character is in UPPERCASE (Capital) or
in lowercase. (take hardcoded values)
Input: ch = ‘a’;
Output: a is a lowercase character
Input: ch = ‘A ’;
Output: A is an UPPERCASE character
*/

class Ex4 {

	public static void main(String [] args) {

		char ch1 = 'a';

		char ch2 = 'A';

		if(ch1 >='a' && ch1<='z'){

			System.out.println(ch1 + " a is a lowercase character");

		}

		else if(ch2 >='A' && ch2<='Z'){

			System.out.println(ch2 + " a is a Uppercase character");
		}

		else {

			System.out.println("Invalid Input");

		}
	}

}

		
