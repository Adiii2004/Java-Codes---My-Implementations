/*
Difference between the Equals method and "==" operator...???
*/

class Diff {

	public static void main (String[] args) {

		String str1 = "Aditya";
		String str2 = "Aditya";


		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2 );

		String str3 = "Salunke";
		String str4 = new String("Salunke");

		System.out.println(str3.equals(str4));//It compare content 
		System.out.println(str3 == str4 );//It compare address i.e. is false cause it form on heap thats why address is diff



	}

}
