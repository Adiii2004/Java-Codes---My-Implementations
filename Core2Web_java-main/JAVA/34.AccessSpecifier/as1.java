//Acess Specifier 1.Privet
class one {

	private int x = 10;
	static int y = 12;

	private void fun() {

		System.out.println("In fun Method ");

	}
	/*
	When we try to access private variable or method in another class then error comes like 
	as1.java:27: error: x has private access in one
		System.out.println(obj.x);
		                      ^
	as1.java:29: error: fun() has private access in one
		obj.fun();
		   ^
	*/


	static void run() {

		System.out.println("In RUn method");
	
	}

}

class Two {

	public static void main(String[] args) {

		System.out.println("In Main Method " );
	
		one obj = new one();
	
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.fun();
		obj.run();

	}

}
/*
We can access or call Privet in class.
Default can access or call in folder.
public can access or call through all folder. 
protected can access from all but there are a condition inheritance is a compulsary.
*/

