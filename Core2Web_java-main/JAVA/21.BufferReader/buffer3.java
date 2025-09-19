
import java.io.*;

class Buffer3{ 
	
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Company Name:  ");

		String cmpName = br.readLine();

		System.out.println("Enter Employee Name:  ");

		String empName = br.readLine();

		System.out.println("Enter Employee Id:  ");

		int empid = Integer.parseInt(br.readLine());

		System.out.println("Enter Company Name:  " + cmpName);
		System.out.println("Enter Company Name:  " + empName);
		System.out.println("Enter Company Name:  " + empid);

	}

}
		
