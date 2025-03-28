package com.exception;

public class Part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EXCEPTION HIRARCY
		/*
		 * Trowbale class access root for java exception hirarcy
		 * Trowable class defines, two chils classes 1) exception 2) error
		 * 
		 * EXCEPTION : RECOVERABLE
		 * MOST of the time exception  are caused by our program and this are recurable if our programing
		 * requirment is read data from remote file located at london at run time if remote file is not
		 * availble then we will get rn time exception file not found exception, 
		 * if file nt found exception occure we can provide local file and contimue rest of problem normally 
		 */
			try {
				//fetch london file
			}catch (Exception e) {
				// TODO: handle exception
				//local file read
			}
			
		/* ERROR :
		 * Most of the time error are not caused by our problem and this are due to leak of system resources
		 * error are non  recurable, ex if OUT-OF-MEMORY-ERROR error occurse beign a programmer we cant do anything
		 * and prgram will be terminated abnormally
		 * 
		 * system admin or server admin is responsible to increase heap memory
		 * STCKOVERFLOW ERROR, INSSERTION ERROR
		 * 
		 */
			
		/*
		 * EXCPTION ----> RUNTIME EXCEPTION, IOEXCEPTION, SQLEXCPETION, INTRUPTED EXCEPTION,
		 * 			REMOTEEXCEPTION, IOEXPTION, FILE NOT FOUND EXCEPTION
		 * RUNTIME EXCEPTION-->ARTH-->NULL POINTER--->INDEXOUTOFBOUND--->CLASSCASTEXCPETION
		 */

	}

}
