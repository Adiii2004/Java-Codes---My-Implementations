class Par2 {

	void fun(char x, char y){

		System.out.println("In fun");
		System.out.println(x);
		System.out.println(y);

	}
	
	void run(double a, double b){

		System.out.println("In run");
		System.out.println(a);
		System.out.println(b);

	}

	public static void main(String[] args){

		Parameter2 obj = new Parameter2();

		obj.fun('A','B');
		//obj.fun(65,66);

		obj.run('A','S');
		obj.run(10,20);

		obj.run(10.5,20.5);
		obj.run(10.5f,20.5f);

		obj.run(10.5f,20);
		obj.run(10.5f,20.5f);
		obj.run(10.5,20.5f);

	}

}
