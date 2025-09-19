
import java.io.*;

class Buffer4{ 
	
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Name:  ");
		String name = br.readLine();
		System.out.println("Enter Society Name:  ");
		String sname = br.readLine();
		System.out.println("Enter Wing:  ");
		char wing = (char)br.read();
		br.skip(1);
		System.out.println("Enter FlatNo:  ");
		int fn =  Integer.parseInt(br.readLine());

		System.out.println("Enter Name:  ");
		System.out.println("Enter Society Name:  ");
		System.out.println("Enter Wing:  ");
		System.out.println("Enter Flatno:  ");

	}

}

		

