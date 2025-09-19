class Ifelse2 {

	public static void main (String[] args) {

		char ch = 97;

		System.out.println(ch = ch);

		if (ch=='a') {

			int x = 5;

			System.out.println(ch-- + x);
		}
		else{
		
			int x = 7;

			System.out.println(ch++);

			System.out.println(x);

		}

		System.out.println(ch+=5);
	}

}

/*
a
102
e
*/
		
