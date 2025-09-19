//RightShift Operator = >>

class Rightshift1 {

	public static void main (String [] args ) {

		int x = 20;	//0001 0100
		/*Now in rightshift , we remove bits from rightside which given in example
		lets see from above example 
		we have 20, Which binary number is 0001 0100 and we have given x>>2 , here 2 is given thats why we need to remove 2 bits from 			rightside like here only left 000101 last 2 bits get removed and new number get 0000101 which is 5
		output is 5 */
 

		System.out.println(x>>2);

	}
}

		
