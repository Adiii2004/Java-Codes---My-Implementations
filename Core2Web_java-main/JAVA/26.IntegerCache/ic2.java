
class Ic2 {

	public static void main(String[] args){

		char ch1 = 'A';//65	1000
		char ch2 = 'a';//97	2000
		char ch3 = 'B';//66	3000

		int x = 65;		//1000
		int y = 97;		//2000
		int z = 66;		//3000

		System.out.println(System.identityHashCode(ch1));
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(ch2));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(ch3));
		System.out.println(System.identityHashCode(z));

	}

}

