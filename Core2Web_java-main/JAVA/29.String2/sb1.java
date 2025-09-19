class Sb1 {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Aditya");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb.capacity());

		sb = sb.append( "Salunke");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb.capacity());

	}

}

//String buffer size is 16 but when we write string in String buffer then it size will be the 16 + String
