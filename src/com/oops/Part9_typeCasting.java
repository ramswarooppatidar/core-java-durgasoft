package com.oops;

import java.lang.classfile.instruction.NewMultiArrayInstruction;

public class Part9_typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Ram");
		Object object =(Object)s1;
		Object object2 = new String("Ram");
		
		/*
		 * stricylt speking throught type casting we are not creatng, any new object, for the existing object
		 * we are providing another type of refernce variable, i.e we are perfomring type casting bbut not object
		 * casting
		 */
		Integer integer = new Integer(10);
		Number number = (Number)integer;
		Object o2 = (Object)number;
		Object object3 = new Integer(10);
		System.out.println(integer == number);
		System.out.println(integer == o2);
		/*
		 * NOTE :  A--->B--->C
		 * 	C c = new C 
		 *  B b = new C   // (B)C
		 *  A a = new C   // (A)((B)C)
		 *  
		 */
		
		/*ex..1 p ->m1(), c--m2()
		 * C c = new C
		 * c.m1();
		 * c.m2();
		 * ((P)c).m1()
		 * ((P)c).m2()  in valid
		 * parent refernce can be use to hold child refernce by using thar refernce we cant call child 
		 * speicfic methd and we can call only method s available in parent class
		 */
		
		/* 
		 * EXAMPLE 2:
		 * A--M1()--->B..M1()----->C---M1()
		 * C c = new C
		 * c.m1()    		   //c  method call
		 * ((B)c).m1() 		   //c  method call
		 * ((A(B)c)).m1()  	   //c  method call
		 * 
		 * It is overriding and method rsoltion is always based on run time object, 
		 */
		
		
		/* 
		 * EXAMPLE 3:
		 * A--ststic M1()--->B..static M1()----->C---static M1(){
		 * C c = new C
		 * c.m1()    		   //c  method call
		 * ((B)c).m1() 		   //B  method call
		 * ((A(B)c)).m1()  	   //A  method call
		 * 
		 * It is Method hiding and method resolution is akways based on refernce type, 
		 */
		
		/* 
		 * EXAMPLE 3:
		 * A--int x=999--->B..int x=888----->C---int x=777{
		 * C c = new C
		 * sysout(c.x)    		   //700
		 * sysout(((B)c).x) 		   //888
		 * sysout(((A(B)c)).x)  	   //999
		 * 
		 * Variable resolution always based on refernce typebut not based on run time object,
		 */
		
		 
		
		

	}

}
