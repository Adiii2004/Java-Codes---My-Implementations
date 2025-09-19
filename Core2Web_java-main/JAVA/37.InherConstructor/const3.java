class Const3 {

	Const3() {

			super();//invokespecial

	
	}

}


/*
Compiled from "const3.java"
class Const3 {
  Const3();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return
}


After we write the Super it dosent affect the byte code that means super is already present in the format of the invokeSpecial ie Super is a "invokeSpecial" and the meaning of super is "Call the constructor of Self Parent".
*/
