package com.oops;

//class DBDriver{
//	static {
//		//register driver with driver manager
//	}
//}
public class Parts11_staticBlock {

//	static {
//		System.loadLibrary("native library path");
//		//hashcode , yeild, start etc. native method
//		System.exit(0);
//	}
//	public static void main(String [] args) {}
	
/*
 * static block will be executed at the time of class loading hence at the time of class loading 
 * if we want to perfomr any activity we have to defined that inside static block
 * 
 * EXAMPLE 1: 
 * at the time of java class loading the coorrsoponding netive library should be loaded we have to defined 
 * this activity inside static block
 * NOTE : within a class we can decler any number of static block but all this static block will be
 * executed from top to bottom
 * 
 * EXAMPLE 2 :
 * AFTER LOADING EVERY DATA base driver class we have to register driver class to driver manager, but inside 
 * data base drive class there is static block to perfrom this activity and we are not responsible to 
 * perform register explicitly
 * 
 * NOTE : within a class we can decler any number of static block but all this static block will be
 * executed from top to bottom
 * 
 * QUESTION : without writing main method it is possible to print some statement to the console,
 * by using static block
 * 
 *   static int x = m1()
 *   public static int me()
 *   {sysout("print something on console")  return 10;
 *   System.exit(0)}
 *   
 *   class Test{
 *     static Test test = new Test();
 *     { sysout()
 *       System.exit(0);     /instance block is executed
 *       }
 *    }
 *    
 *   class Test{
 *   static Test test = new Test();
 *   Test(){    //constructor executions
 *     Sysout();
 *    }
 *    
 *   NOTE : from 1.7 version onwords main medthos is mendatory to start a program execution, Hence
 *   from 1.7 version onwords without writing main method, it is impossible, to print some stetments to the 
 *   console
 */
	
/*
 * static CONTROLL FLOW IN PARENT TO CHILD RELATION SHIP
 */
	
	static int i=10;
	static {
		m1();
		System.out.println("first static block");
		//drect read
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		System.out.println("main method");
	}
	public static void m1() {
		//indirect read
		System.out.println("j value "+j);
	}
	static {
		System.out.println("second static block");
	}
	static int j = 20;
}

 class Parts_11_Dervied extends Parts11_staticBlock  {

	static int x=100;
	static {
		m2();
		System.out.println("first static block Derived");
		//drect read
		System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m2();
		System.out.println("main method Dervied");
	}
	public static void m2() {
		//indirect read
		System.out.println("y value "+y);
	}
	static {
		System.out.println("second static block dervied");
	}
	static int y = 200;

}
 
 /*
  *  OUTPUT IS :
  *  D:\eclips\Java_\src>javac com/oops/Parts11_staticBlock.java
  *  
  *      //GENERATE TWO .CLASS FILE ARE AS FOLLOW
  *   
  *      com/oops/Parts11_staticBlock.class
         com/oops/Parts_11_Dervied.class

		
		D:\eclips\Java_\src>java com.oops.Parts_11_Dervied
		
		
		
		j value 0
		first static block
		10
		second static block
		y value 0
		first static block Derived
		100
		second static block dervied
		y value 200
        main method Dervied

  *  
  *  
  */  
 /*
  * WHENEVER WE are executing child class the following sequence of event will of executed automatically
  * as the part of static control flow
  * 1) identifiaction of static memebers from parent child
  * 2) execution of static varible assignment and sTAtic blocks from parent to child
  * 3)execution of only child class main method,
  */
		