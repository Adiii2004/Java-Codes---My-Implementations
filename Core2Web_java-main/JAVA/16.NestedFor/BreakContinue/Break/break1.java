//Break

class Break1 {

	public static void main (String []  args ) {

		for (int i = 1; i<=50 ; i++){

			if(i % 4 == 0 && i % 5 == 0){

				break;

			}
			System.out.println(i);

		}	
	}
}

/* Here in break we can see if our condition get fullfill before ending of loop our condition will get printed if not runnimg till end
here we got output 
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
cause at 20 our condition will get fullfilled ,if get true then it get break thats why it throw out for loop and loop suddenly stop and print number from 1 to 20
*/
