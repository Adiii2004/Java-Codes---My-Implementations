
class Parameter1 {

	void gun() {
	
		System.out.println("IN Gun" );

	}
	void fun (int x) {

		System.out.println("In Fun");
		System.out.println(x);

	}

}

class Parameter2 {

	void run(float i,float f) {

		System.out.println("In Run");
		System.out.println(i);
		System.out.println(f);

	}

	public static void main(String[] args) {

		Parameter1 obj1 = new Parameter1();
		obj1.gun();
		obj1.fun(10);

		Parameter2 obj2 = new Parameter2();
		obj2.run(50,50);

	}

}
