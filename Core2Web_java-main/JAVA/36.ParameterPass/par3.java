
class Par3 {
	
	void fun (long x,double y) {

		System.out.println("In FUn");
	}

	public static void main (String [] args) {

		Par3 obj = new Par3();

		obj.fun('A','B');
		obj.fun(10,10.5);
		obj.fun(10,10.5f);
/*
		obj.fun(10.5f,20.5);
		obj.fun(20.5,10.5f);		*/
		obj.fun(20l,10.5);

	}

}
/*
Hirerchy of promotion

Interger Family -  byte--short--int--long
Floatingfamily -   float--double

*/


		
