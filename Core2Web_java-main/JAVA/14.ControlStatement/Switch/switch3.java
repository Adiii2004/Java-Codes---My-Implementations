class Switch3 {

	public static void main (String [] args) {

		int num = 5;

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
OUTPUT
Before Switch
In Default State
After Switch
/*
