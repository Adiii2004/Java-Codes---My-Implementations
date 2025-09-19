
class Strr1 {

	public static void main(String[] args) {

		String str1 = new String("Aditya");

		System.out.println(System.identityHashCode(str1));			
		
		str1 = str1 + "salunke";
		System.out.println(str1);//AdityaSalunke
		System.out.println(System.identityHashCode(str1));
	
		str1 = str1 + "karjat"; 
		System.out.println(str1);//str1 = AdityaSalunkeKarjat
		System.out.println(System.identityHashCode(str1));
	}

}

/*
whenn you update string ,like in above example we can see when we update 2nd time string  then first string is disconnect with address and updated string is gone at that adress and disconneted string is taken by garbage collector
*/
