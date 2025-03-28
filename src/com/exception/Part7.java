package com.exception;

public class Part7 {

	//CASE A
  //	static ArithmeticException e = new ArithmeticException();
	static ArithmeticException e ;
	
	//CASE B
	
	
	public static void main(String[] args) {
		
//		case1
//		    System.out.println(10/0);
		
		//case2
//			throw new ArithmeticException("division by zero dghd hjdjdjjdjddkdkdd");
		
		// TODO Auto-generated method stub
		/*handover our created object to the jvm manually
		 * some the we creat exception object manually anfd we can hand over jvm manually for this 
		 * we have to use THROW key word
		 * 
		 * throw new ArithmeticException("div by zero");
		 * i create arithematic exception manually, 
		 * 
		 * hence the main objective of thow keyword is, to handover our created exception object to the jvm manually
		 * 
		 * CASE 1 : 
		 * in this case main method is responsibe to create exception object , and hand over to the jvm
		 * 
		 * case2 : programmer createding exception object explicity and hand over to the jvm manually
		 * 
		 * NOTE : best use of throw key word is for user defined exception or customized exceptions
		 * 
		 */
			
//			throw e;
//		    System.out.println("hello");   case b
			
		 /*
		  * Case A
		  * throw e if e referce null then we will get nullPointer Exception;
		  * throw e if e referce arithematicException then we will get arithematicException Exception;
		  * 
		  * Case B 
		  * after throw stetement we are not allowed to write any estement directly other wise we will
		  * get complie time code , unrechable stetement
		  * 
		  * CASE C
		  * throw only throw the throwable object, not any object
		  * we can use throw key word only for throwable types, if we trying to use for normal java objects
		  * we will get compile time error, saying incompatable types
		  */
			
			System.out.println(10/0);
			System.out.println("hello");

	}

}
