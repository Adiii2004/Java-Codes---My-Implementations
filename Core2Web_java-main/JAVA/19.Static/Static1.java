class Static1 {

	void fun() {

		System.out.println("IN Fun Method ");

	}

	static void run() {

		System.out.println("In run Method " );

	}

	public static void main(String[] args) {

		System.out.println("In main method");

		run();

		Static1 obj = new Static1();
		obj.fun();

	}

}
