package com.interfaces;

import javax.security.auth.x500.X500Principal;

public class Part_2_method implements Part_2_If {
   
	public static void main(String[] args) {
		// we can not change value of final varible
	   x = 777;
	   System.out.println(x);
	   
	   // this is loacl varible for this method
	   int x = 777;
	   System.out.println(x);
	}
}
/*
 *  Inside implements class we can access interface variable but cant modify values
 */
