//we use break 
class Switch5 {

	public static void main (String [] args) {

		int num = 2;

		System.out .println("Before Switch");

		switch(num){

			case 1:
			
				System.out.println("one");
				break;

			case 2:
			
				System.out.println("two");
				break;

			case 3:
			
				System.out.println("three");
				break;

			default :

				System.out.println("In Default State");
				break;

		}

		System.out.println("After Switch");

	}

}
/*Before Switch
two
After Switch
*/
