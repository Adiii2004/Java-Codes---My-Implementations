class Switch4 {

	public static void main (String [] args) {

		int num = 2;

		System.out .println("Before Switch");

		switch(num){

			case 1:
			
				System.out.println("one");

			case 2:
			
				System.out.println("two");

			case 3:
			
				System.out.println("three");

			default :

				System.out.println("In Default State");

		}

		System.out.println("After Switch");

	}

}
/*
Before Switch
two
three
In Default State
After Switch
*/
