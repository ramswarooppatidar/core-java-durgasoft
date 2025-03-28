package com.exception;

class toYuoungException extends RuntimeException{
	toYuoungException(String s){
		super(s);  //
	}
}
public class Part9 {
	public static void main(String []args) {
		int age = 15;
		if(age<18) {
			throw new toYuoungException("this is custom exception ");
		}
	}
}

//class toOldException extends Exception{
//	toOldException(String s){
//		super(s);
//	}
//}
//public class Part9 {
//	public static void main(String []args) {
//		int age = 15;
//		if(age<18) {
//			throw new toOldException("this is custom exception, but checked exception ");
//		}
//	}
//}


	/*
	 * TRY :
	 * to maintain risky code
	 * CATCH :
	 * To handle exception
	 * FINALLY :
	 * To perfoem cleanup activity
	 * THROW :
	 * To hand-over our created exceptio object to the jvm manually
	 * THROWS :
	 * To deleigate resonsibity of exception handling to the caller method
	 */
	
	//VARIOUS TYPE OF COMPILE TIME ERROR
	/*
	 * unreportedException,  must be caugh in try catch or thrown
	 * exception already been caught,
	 * uncrecahble code
	 * incompatable type, (throwable)
	 * try without catch or finally
	 * catch without try
	 * finally without try,
	 * never throe in corrosponding try body (for fully checked)
	 * 
	 */
	
	/*
	 * some time to meet programming requiremnt , we defined our own excetio suvh type of exceptions
	 * are called customized are user defined exception,
	 * ex tooyOUNGeXCEPTION, userNotFoundException, insufficientFoundEception
	 * 
	 * NOTE : trhow key word is bext suitable for user defined or customized exceptio but not for predefined
	 * exceptions
	 * 
	 * NOTE 2 : it is highly recommended to defined cistomized exception to be unchked exception,so we have to extend runtime
	 *  exception but not exception 
	 *  
	 * NOTE 3: SUPER() TO description, is availbe to default exception handler, that is presen in throwable class
	 */

