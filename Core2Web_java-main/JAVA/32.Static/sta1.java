//Static and instance

class Sta1 {

	int x = 10;
	String str = new String("Aditya");
	static int y = 20;

	public static void main(String[] args) {

		int a = 30;
		int b = 40;
		String str1 = new String("Ashish");
		Sta1 obj = new Sta1();
		System.out.println(obj.x);
		System.out.println(obj.str);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		

	}

}
	
/*
O/P
10
Aditya
20
30
40
*/	
