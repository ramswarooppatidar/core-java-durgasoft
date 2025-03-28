package com.oops;

import javax.print.attribute.IntegerSyntax;

class Parentt{
	int x =999;
	public void m1(int... i) {
		System.out.println("parent");
	}
}
class Childd extends Parentt{
	//it is overloading but not verriding
	int x = 888;
	public void m1(int i) {
		System.out.println("child");
	}
}
public class Part7_override_var_arg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parentt parent = new Parentt();
		parent.m1(12);
		System.out.println(parent.x);
		
		Childd child = new Childd();
		child.m1(0);
		System.out.println(child.x);
		
		Parentt parent2 = new Childd();
		parent2.m1(12);
		System.out.println(parent2.x);
	}
	/*
	 * we can override vararg method with the another verarg mwthod only, if we are trying to
	 * overide with normal method then it will become overloading, but not overriding
	 * 
	 * in the above program if we replace child method with vararg method then it will become
	 * overriding, in this case the output is, parent child child
	 * 
	 * Variable resoltion always taje care by compiler, based on refernce type, in respective of
	 * whether the variable is static or non static(overiding concept aplicable only for methods but 
	 * not for varible)
	 * 
	 */
	 

}
