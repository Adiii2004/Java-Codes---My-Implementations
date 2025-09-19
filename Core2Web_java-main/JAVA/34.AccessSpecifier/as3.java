//Here we are accesing the data from another file that name is as2.java ,we compile program using "javac as2.java as3.java " we can compile two file at a time
//public ,dafault and protected access specifier have same behavoir in same folder but they change their behavoir outside the folder

class two {

	public static void main (String[] args){

		one obj  = new one();
		System.out.println(obj.data);

	}

}
