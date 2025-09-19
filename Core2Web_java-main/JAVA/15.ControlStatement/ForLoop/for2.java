class For2{

	public static void main(String[] args) {

		for(int i = 1; i<=5; i++) {

			System.out.println("Hello Student");

		}

	}		
}

/*
Now here we are going to see how for are working
For(initilization(1); Condition(2); increament/Decreament(4))
{

		//Body(3)

}

in above code  we can see 
1st step is initilize 
	we initilize i = 1; 
	The process of initilization is only done for once and it occur at the starting at the loop
2nd Step is Condition cheak 
	In above example we cheak condition using "i<=5" that will cheak the condition and going for printing
3rd step
	 code going into body that means code is undergoes "System.out.println" after going under body is goes to the 4th step which is i++ 		operator.Basically in body we get the prime objective of the loop
4th step 
	It use the increament or decreament operator for reach the condition and this is final step 


Now lets see the DRY RUN for the Above Code

i  i<=5  SOP("Hello Student")  i++
1  1<=5		Printed        i=2
   2<=5		Printed	       i=3
   3<=5		Printed        i=4
   4<=5		Printed        i=5
   5<=5		Printed        i=6
   6<=5					now here conditionget false thats why here Output not get printed
