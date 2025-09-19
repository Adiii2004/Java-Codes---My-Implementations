//Negation Operator = ~
//in 8 bits we are only use 7 bits there are 1st bit for deciding the sign of number like +,-
class Negation1 {

	public static void main(String[] args) {

		int x = 10;	//Output -11

		System.out.println(~x);

		int z = 0b11111111111111111111111111110101;
		/*above we take the negation of binary of 10, actually binary of 10 is 0000 01010 this is only 1 bye cause only we have 8 bits,and int have total 4 bytes that means there are total 32 bits thats why we take negation of all number and our answer will come -11*/

		
		System.out.println(z);
	}

}
