class Strr3{

	public static void main(String[] args){

		String str1 = "Aditya";	
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));

		String str2 = "Aditya";	
		System.out.println(str2);
		System.out.println(System.identityHashCode(str2));

		
	}

}
/*
o/p
Aditya
1808253012
Aditya
1808253012
here we can clearly see the java memory management it save string at same address cause of efficient memory management
