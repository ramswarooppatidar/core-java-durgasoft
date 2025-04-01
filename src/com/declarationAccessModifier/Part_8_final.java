package com.declarationAccessModifier;

public class Part_8_final {
	final int x =10;
	x =20;
	static int y;
	final static int finalvalue=12;
//	public void m1() {
//		x= 10;
//	}
	public Part_8_final(){
		m1();
	}
	

	public static void main(String[] args) {
		// FINAL VARIABLE
		/*
		 * 1_ FINAL INSTACE VARIABLES;
		 * 1) if the variable of the variable is varied from , object to object such type of varible are called 
		 * instance variables
		 * 2) for evry object a separte copy of instance varibles will be created
		 * 3) fro instance variable we are not required to perfom initializtion explicity jvm will always 
		 * provide default values
		 * 4) if the instance varible declerd as the final then compulsary we have to perform explicity ,
		 * whether you are using are not, and jvm wont provide default values
		 * 
		 * RULE :
		 * for final instance varible compulsar perfom initializtion before construction complition,
		 * that is the following are various places for initialization
		 *  1) at the time of declartion
		 *  2) at instance block
		 *  3) at constructor
		 *  
		 *  this in only possible places to perfom initilization for final instance varible, if we try to perfom
		 *  ini any where else then we will get compile time error
		 */
		
		/*
		 * final static String collageName;
		 * if the value of the varible is nt varied from, object to object such type of varibls
		 * are not recommonded to declare to instance varible, we have to decalre those varible as class
		 * lavel by using static modifier
		 * 
		 * in tha case of inst varible for every object a sprt copy will be crteated but in case of sts varible
		 * a single copy willl e crted at the class level and shered by, every object or that class
		 * 
		 * 
		 */
		System.out.println(y);
		/*
		 * STATIC VARIBLE AS FINAL :
		 * if the static varible declred as final then compulsary we need to perfom initilaze explicity
		 * other wise we will get compile time error , jvm wnot provide default value;
		 * final static int val = 12;
		 * Note :  before class loading comlition initilaze perom
		 * 
		 * rule :
		 * for final sts varible comp to perfom ini before class loading complition;
		 * that is, following are various places for this :
		 *  1) at the time of declartion
		 *  2) inside static block
		 *  
		 * 
		 * 
		 */

	}

}
