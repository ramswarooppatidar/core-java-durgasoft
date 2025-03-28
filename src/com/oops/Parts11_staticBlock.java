package com.oops;

class DBDriver{
	static {
		//register driver with driver manager
	}
}
public class Parts11_staticBlock {

	static {
		System.loadLibrary("native library path");
		//hashcode , yeild, start etc. native method
		System.exit(0);
	}
	public static void main(String[] args) {}
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
 * without writing main method it is possible to print some statement to the console,
 * by using static block
 */
	

}
