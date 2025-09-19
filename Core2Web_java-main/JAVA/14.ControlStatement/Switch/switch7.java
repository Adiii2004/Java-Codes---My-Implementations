class Switch7 {

	public static void main (String [] args) {

		char data = 'B';

		System.out .println("Before Switch");

		switch(data){

			case 'A':
			
				System.out.println("A");
				break;

			/*			
			case 65:
			
				System.out.println("65");
				break;
			switch7.java:16: error: duplicate case label
			case 65:
			^
			switch7.java:26: error: duplicate case label
			case 66:
			^
			*/
			
			case 'B':
			
				System.out.println("B");
				break;

			/*case 66:
			
				System.out.println("66");
				break;
			*/
	

			default :

				System.out.println("In Default State");
				break;

		}

		System.out.println("After Switch");

	}
}

