import java.util.*;

class A3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size:- " );

		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i = 0; i<arr.length; i++) {
			System.out.print("Enter Element :- ");
			arr[i] = sc.nextInt();

		}
			System.out.println("Array Elements are:- ");
		for(int i = 0; i<arr.length; i++) {

			System.out.println(arr[i]);
		}

	}
}
