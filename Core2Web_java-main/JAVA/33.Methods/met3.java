class Met3 {

	int x = 10;
	static int y = 12;

	void fun() {

		System.out.println("In fun Method ");

	}
	static void run() {

		System.out.println("In RUn method");

	}

}

class Two {

	public static void main(String[] args) {

		System.out.println("In Main Method " );
	
		Met3 obj = new Met3();
	
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.fun();
		obj.run();

	}

}
/*
O/P:-
In Main Method 
10
12
In fun Method 
In RUn method
*/
