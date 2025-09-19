class Par4 {

	void fun(float x){

		System.out.println("In Fun");

	}

	public static void main(String[] args){

		Par4 obj = new Par4();

		obj.fun(10.5f);
		obj.fun('A');
		obj.fun(10);
		obj.fun(50l);
		obj.fun(10.5);

	}

}
/*
Long can be convert into the float
*/

