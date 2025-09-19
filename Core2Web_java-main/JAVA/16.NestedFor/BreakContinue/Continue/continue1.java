class Continue1 {

	public static void main (String[] args) {

		for(int i = 1; i<=20; i++){

			if(i % 3 == 0 && i % 5 == 0){

				continue;

			}

			System.out.println(i);
		}

	}

}
/*
Here if our if condition get fullfill using CONTINUE we skip that particular number like here in our case we have condition %3 and%5 then we have number 15 in 1 to 20 thats why in output 15 is missing cause using continue we skip that step or skip particular number
OUTPUT
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
16
17
18
19
20
*/

	
