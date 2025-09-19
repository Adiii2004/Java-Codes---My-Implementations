class Met1 {
	
	static void fun() {

		System.out.println("In Fun" );

	}

	public static void main (String[] args) {

		//There are total three methods for calling static method ,like here we can call fun using three diff methods

		//1st is we can create the object and call the method
		Met1 obj = new Met1();
		obj.fun();
		

		//2nd is using class name 
		Met1.fun();


		//3rd is method name
		fun();
	}
}
