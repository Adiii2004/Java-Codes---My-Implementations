//JAVA allow to use STRING in Switch Case
class Switch8 {

	public static void main (String [] args) {

		String Friends = "Aditya";

		System.out.println("Before Switch");

		switch(Friends){

			case "Neha":
			
				System.out.println("Neha");
				break;

			case "JEEVAN":
				System.out.println("JEEVAN");
				break;
			
			
			case "Anurag":
			
				System.out.println("Anurag");
				break;

			case  "Aditya":
			
				System.out.println("Aditya");
				break;
			
	

			default :

				System.out.println("In Default State");
				break;

		}

		System.out.println("After Switch");

	}
}

