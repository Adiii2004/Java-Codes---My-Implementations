class Static2 {

	void methodFun() {

		System.out.println("IN fun Method ");

	}

	void methodGun() {

		System.out.println("In Gun Method " );

	}

	void methodRun() {

		System.out.println("In run Method " );

	}

	public static void main(String[] args) {

		System.out.println("In main method");
		Static2 obj = new Static2();
		obj.methodFun();
		obj.methodGun();
		obj.methodRun();
	}

}
