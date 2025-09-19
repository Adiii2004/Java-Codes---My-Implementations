/*
7.What is the output of given code:
Remember you have to first solve it in your own notebook and then type the code in your PCs.
Code
	class C2W{
		public static void main(String[] args) {
			int num = 100;
			num--;
			System.out.println(num<<1);
			num=num>>>1;
			num+=3;
			System.out.println(num);
		}
	}

*/

class Ex7{
	public static void main(String[] args) {
		int num = 100;
		num--;
		System.out.println(num<<1);//198
		num=num>>>1;
		num+=3;
		System.out.println(num);//52
	}

}
