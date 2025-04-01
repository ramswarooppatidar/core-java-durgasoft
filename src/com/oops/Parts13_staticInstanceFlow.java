package com.oops;

public class Parts13_staticInstanceFlow {
//	{
//		System.out.println("first instance block");
//	}
//	static {
//		System.out.println("first static block");
//	}
//	Parts13_staticInstanceFlow(){
//		System.out.println("constructor");
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Parts13_staticInstanceFlow teat1 = new Parts13_staticInstanceFlow();
//		System.out.println("main");
//		Parts13_staticInstanceFlow teat2 = new Parts13_staticInstanceFlow();
//	}
//	{
//		System.out.println("second instance block");
//	}
//	static {
//		System.out.println("second static block");
//	}
	
	
	
	
//	private static String m1(String s) {
//		System.out.println(s);
//		return s;
//	}
//	public Parts13_staticInstanceFlow() {
//		m = m1("1");
//	}
//	{
//		m = m1("2");
//	}
//	static String m = m1("3");
//	public static void main(String arg[]) {
//		// TODO Auto-generated method stub
//		Parts13_staticInstanceFlow tes2 = new Parts13_staticInstanceFlow();
//	}

	
	
//	private static String m1(String s) {
//		System.out.println(s);
//		return s;
//	}
//	public Parts13_staticInstanceFlow() {
//		m = m1("1");
//	}
//	
//	static String m = m1("3");
//	{
//		m = m1("2");
//	}
//	static {
//		m = m1("1000");
//	}
//	public static void main(String arg[]) {
//		// TODO Auto-generated method stub
//		Parts13_staticInstanceFlow tes2 = new Parts13_staticInstanceFlow();
//	}
	
	
	int x = 100;
	public static void main(String arg[]) {
		// in a static area instance variable is identify only when object is created,  
		//bcz instance flow is executed when object is created, so dirctly instance varible not read in
		//static area
		System.out.println(x);
		Parts13_staticInstanceFlow tes2 = new Parts13_staticInstanceFlow();
		System.out.println(tes2.x);
		Parts13_staticInstanceFlow t2 = (Parts13_staticInstanceFlow)Class.
				                             forName("Parts13_staticInstanceFlow").newInstance();
//		Parts13_staticInstanceFlow t3 = Parts13_staticInstanceFlow.getParts13_staticInstanceFlow();
		
	}
	
	/*
	 * NOTE : from static area we cant access instance members directly bcz while executeing static area 
	 * jvm may not idetify instance memebers
	 * 
	 * QUESTION : IN HOW MANY WAYS WE CAN AN OBJECT IN JAVA ARE IN HOW MANY WAYS WE GET OBJECT IN JAVA
	 * 1) by usinf new opertaor
	 * 2) by using newInstance method
	 * 3) by usinf factoryMethod
	 * 		Runtime r = Runtime.getRuntime();
	 *      DateFormate df = DateFormate.getInstance();
	 * 4) using clone method
	 *    Test t1 = new Test()
	 *    Test t2 = (Test) t1.clone();
	 * 5) desialization
	 * 	FileInputStream fis = new FIS();
	 * 	FileOutputStream fos = new FOS(fis);
	 * 	Animal a = (Animal) fos.readObject();
	 * 
	 */
	 */
}
