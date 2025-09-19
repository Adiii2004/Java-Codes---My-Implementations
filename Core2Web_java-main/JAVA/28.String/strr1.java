
class Strr1{

	public static void main(String[] args){

		String str1 = new String("Aditya");

		String str2 = new String("Aditya");
	
		String str3 = new String("Aditya");

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));

	}

}

/*
o/p
1808253012
589431969
1252169911
We can see clearly all three strings address are seperATE cause they all are generated on the heap section. when we use "new" then it create another option for the string.
whenn we made string using new then it created on the heap
*/
