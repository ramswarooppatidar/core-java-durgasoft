package com.oops;

public class Parts10_staticFlow {
//	EXAMPLE 1
//	static int i=10;
//	static {
//		m1();
//		System.out.println("first static block");
//		//drect read
//		System.out.println(i);
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		m1();
//		System.out.println("main method");
//	}
//	public static void m1() {
//		//indirect read
//		System.out.println("j value "+j);
//	}
//	static {
//		System.out.println("second static block");
//	}
//	static int j = 20;
	
	
	/*
	 * whenewere we are using java class the following sqequcence of code is executing as a staric controll flow
	 * 1) idetification of static memeber from tiop to botton
	 * 2) execution of statc varible assignment and static block top to bottom,
	 * 3) execution of main method
	 */
	
	/*
	 * inside a static blok we are trying to read a variable the read operatio  is called direct read
	 * if we are calling amethod and within the method we are read the varible then read operation is called
	 * indirect read
	 * 
	 * 0=riwo(read indirective write state)
	 * if a varaible just identified by the the jvm and original value not yet assigned, then the variable is 
	 * said to be in read indirectly and write only state(riwo)
	 * 
	 * if a vaible is in read indirectly write only state then we cant perform direct read;but we can perfomr
	 * indirect read
	 * 
	 * if we are trying to read directly then we will get compile time error saying,
	 *  illegal for waord refernce
	 */
	
//	EXAMPLE 2
	
//	static int i = 10;
//	static {
//		System.out.println("i valus isssssssssssssssssssssss:"+i);
//	}
//	public static void main(String args[]) {
//		
//	}

	
	//EXAMPLE 3
	
//	static {
//		System.out.println("i valus isssssssssssssssssssssss:"+i);
//	}
//	static int i = 10;
//	public static void main(String args[]) {
//		
//	}
	
	
	//exapmpe 3
	
	static {
		m1();  //indirct read  0[RIWO]
	}
	
	public static void m1() {
		System.out.println("i valus isssssssssssssssssssssss:"+i);
	}
	static int i = 10;
	public static void main(String args[]) {
		
	}

}
