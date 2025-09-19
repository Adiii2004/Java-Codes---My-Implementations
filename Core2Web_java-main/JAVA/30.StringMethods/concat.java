/*
method Name:- 
concat

Description:

concated String to another string, basically it concate Two String

Prototype;
public String concat(String str)

*/

class Concatmeth{

	public static void main(String [] args) {

		String str1 = "Aditya";
		String str2 = "Salunke";

		System.out.println(str1);//Aditya
		System.out.println(str2);//Salunke

		str1 = str1.concat(str2);//AdityaSalunke
		

		System.out.println(str1);//Aditya
		System.out.println(str2);//Salunke

	}

}

