//Leftshift Operator (<<)

class Leftshift1 {

	public static void main (String [] args ) {

		int x = 10;		//0000 0101
		System.out.println(x<<3);
		/*Here we can see ,using leftshit we in particular manner.
		we take example here 10 and use <<3 that means it works like
		10 * 2 = 20 (1st)
		20 * 2 = 40 (2nd)
		40 * 2 = 80 (3rd)
		here we can clearly see there are number increasing interms of 3 bits cause we mention that <<3*/

		/*we can take another example		
		if i have x=5 and i need to print x<<5
		then it works as below
		5 * 2 = 10  1st
		10 * 2 = 20 2nd
		20 * 2 = 40 3rd
		40 * 2 = 80 4th
		80 * 2 =160 5th 
		now here we do until 5 bits cause it given in output <<5 */

		int y = 5;
		System.out.println(y<<5);

	}

}
