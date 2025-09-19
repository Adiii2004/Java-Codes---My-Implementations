class Logical4 {

	public static void main (String [] args ) {

		int x = 5;
		int y = 3;

		System.out.println((x-- <= ++y) && (++x < y--));//false
		System.out.println(x);
		System.out.println(y);

	}

}
