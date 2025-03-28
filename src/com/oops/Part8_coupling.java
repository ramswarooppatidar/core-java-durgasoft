package com.oops;

import java.lang.classfile.instruction.NewMultiArrayInstruction;

class A{
	static int i = B.j;
}
class B{
	static int j = C3.k;
}
class C3{
	static int k = D.m1();
}
class D{
	public static int m1() {
		return 20;
	}
}
public class Part8_coupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* COUPLING
		 * The degree of dependency between the componetns is called coupling, 
		 * if dependency is more then it is consider as tightly coupling if depencdecy is less then it is consider
		 * as losling coupling
		 * 
		 * the above component is are said to be tightly  couple with each other dependecy between componenet
		 * is more, tightly coupling is a not a good programming pratice bcz it  hace several disadvtages
		 * 1) without affecting remaining components, we cant modify any component we cant modify any components
		 * and henece enhance ment is difficult
		 * 2) it supreses reusebality
		 * 3) it reduces maintainibility of the appplication
		 * 4) we have to maintaine dependency betwen the component as as possible, that is losly coupling
		 * is a good programming practice
		 */
		
		/*
		 * COHISION
		 * FOR every componet clear and well defined functionlity is defined then that componets is said to
		 * be follow high cohision,
		 * 
		 * LOW COHISION ---->HIGH COHISION
		 * High cohision is always good programming practice bcz it has several advantage
		 * 1) without affecting remaining components we can modify any componets
		 * hence enhance ment become easy
		 * 2) it promots reusablity of the code(where ever validation is required we can re use the
		 * same validated servelt without re writing)
		 * 3) it improves maintainability of the application,
		 * 
		 * NOTE : loosling copling and high cohision are good programming pratices
		 */
		
		/*
		 * OBJECT TYPE CASTING
		 * we can use parent refernce to hild child object, 
		 * we can use interface referne to hold implemented class oblect
		 * Runnable r = new Thread()
		 */
		Object object = new String("durga");
		StringBuilder sbBuilder = (StringBuilder)object;
		/*
		 * A b = (c) D
		 * A : class/interface Name
		 * B : name of refernce variable
		 * C : class Interface Name
		 * D : refernce varibale name
		 * 
		 * 1) compile type chaecking 1, the type of D and C must have some relation either child to parent
		 * or parent toc hild or same type , ther wise we will get compile time error, :
		 * in convertable found in d type required c
		 * ex 1 ..Object object = new String("durga");
		 *        StringBuilder sbBuilder = (StringBuilder)object;
		 * ex 2 String object = new String("durga");
		 * 		StringBuilder sbBuilder = (StringBuilder)object;
		 * error : in conertable type 
		 * 
		 * 2)  compile type checking to
		 * c must be either same or dervied type of A other wise we will get comile time error saying
		 * in compatale type in c found c required a
		 * ex..1 Object object = new String("durga");
		 * 		 StringBuilder sbBuilder = (StringBuilder)object;
		 * 
		 * ex..2 Object object = new String("durga");
		 *  StringBuilder sbBuilder = (String)object;
		 *  
		 * 3) RUN TIME CHECKING
		 * run time object type of D must be either same or dervied type type of C , other wise we
		 * will get tun time exception saying, class cast exception
		 * ex 1 ..Object object = new String("durga");
		 *        StringBuilder sbBuilder = (StringBuilder)object;
		 * 
		 * 
		 * excpetion :  java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.StringBuilder
		 * 
		 *  ex 1 ..Object object = new String("durga");
		 *        Object o = (String)object;
		 */
	}

}
