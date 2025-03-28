package com.exception;

import javax.naming.ContextNotEmptyException;

public class Part6 {
	public static void main(String args[]) {
		/*
		 * FINAL :
		 * final is modifier applicable for classsses , method and variable
		 * if callss declear as final then we cnt extend that class, we cant reate child class for
		 * that class inheritance is not possible for final classes
		 * 
		 * if method is final we can not overide that method in child class
		 * 
		 * if variable is decleard as final, then we cant perform reasignment for that variable
		 * 
		 * FINALLY :
		 * finally is a block, always assosciated with try catch to maintain cleanup code,
		 * the sepeciality of finally block is it will be executied always irespective of whether exception 
		 * is raise or not rasied whether handle or not handled,
		 * 
		 * FINALZIE finalize()
		 * finalized is a method always envoked by garbage collector just before distroying the object to perfom clenup
		 * activities, once finalize method completes immediatly garbage collector destroies that object
		 * 
		 * NOTE : finally block responisble for cleanup activeity related to try block,that is waht ever resouces well open 
		 * at part of try block will be closed inside finally block
		 * 
		 * finalize method is responsible to perform clenup activity re;latedd to oject that is waht is resourcse 
		 * associated with object will be delocated before distury the method using finalie( method
		 * 
		 * in try catch finally, order is important
		 * 2) try without catch and finally git compile time error
		 * 3) whenwher write catch block complsury try block must be required. catch without try invalid
		 * 3)
		 * finally block always followd try block, finally wthout try ivalid
		 * CURLY BRESES REQUIRED FOR TRY CATCH AD FINALY {}
		 */
		
		
	}
}
