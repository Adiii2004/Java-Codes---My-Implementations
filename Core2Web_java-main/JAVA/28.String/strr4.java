
class Strr4{

	public static void main(String[] args){

		String str1 = "Aditya";

		String str2 = "Adi";
	
		String str3 = new String("Aditya");

		String str4 = str1 + str2;

		String str5 = str4;

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));

	}

}

