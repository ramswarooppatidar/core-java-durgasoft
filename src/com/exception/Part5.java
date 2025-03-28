package com.exception;

import java.sql.SQLException;

public class Part5 {
	public static int digiSum(String s) {
		char [] ch = s.toCharArray();
		int sum =0;
		for(int i =0; i<ch.length; i++) {
			try {
				sum += Integer.parseInt(String.valueOf(ch[i]));
			}catch(Exception e) {
				System.out.println("character "+ch[i]+" is not a numeric value");
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = digiSum("g6jasj83fmdjhk7");
		System.out.println("sum is :"+ sum);
		
		/*
		 * it is highly recommended to handle exception the code may raise an exception is called risk
		 * code we have to define that code in try block and corrosponding handling code we have defined in side
		 * catch block
		 */
		
		try {
			//stetemen 1
			//stetment 2
			//stetment 3
		}catch(Exception e){
			//stetment4
			e.printStackTrace(); 				        //exception name , description, trace
			System.out.println(e); System.out.println(e.toString());   //same          //excep name, discription
			System.out.println(e.getMessage()); // dicription
		}
		//stetment 5
		
		/*
		 * CASE 1 : NO exception
		 * flow of code is , 1,2, 3, 5
		 * 
		 * CASE 2: Exception in stet. 2
		 * Flow of code is  1,4,5,
		 * at excpetion is raised at line 2, then corrosponding catch blocke is matched then normal termination
		 * 
		 * case 3 :  no catch block, exception in 1 line
		 * flow is 1, 5
		 * 
		 * CASE 4:
		 * If excpetion at stet.4 and stet .5 is always abnormal termination
		 * 
		 * NOTE : within the try block if any where excpetion raisd rest of the try block wont be
		 * exceuted even though we handle that exception,Hence within the try block we have to take only risk code
		 * and length of try block should be as less as possible
		 * 
		 * NOTE : in additon catch block there may be chance to raised exception in side catch and finally block
		 * 
		 * if nay stet which is not part of try block and raisee the exceptio then it is always abnormal termination
		 * 
		 */
		
		//MESSAGE TO PRINT EXCEPTION MESSAGE
		/*
		 * throwable class efine this methos to print the exception
		 * e.printStackTrace()
		 * e.toString()
		 * e.getMessage()
		 * 
		 * NOTE : internallu default excpetion handler will used printstack exception information to the console
		 */
		
		// TRY WITH MULTIPLE CATCH  BLOCK
		  try {
			  //risk code
		  }catch(ArithmeticException e) {
			  
		  }catch(ClassCastException e) {
			  
		  }catch(IndexOutOfBoundsException e) {
			  
		  }catch(Exception e) {
			  //default
		  }
		  /*
		   * the way of handling the exception varied from exception to ecxeption, so every exception tyep is highly
		   * recommended to seprtae catch block, try with mutile catch block is walys possible and recoomend to use
		   */
		  
		  //ORDER OR CATCH BLOCK
			  try {
				  
			  }catch(Exception e) {
				  
			  }catch(ArithmeticException e) {
				  
			  }
			  
			 try {
				  
			  }catch(ArithmeticException e) {
				  
			  }catch(Exception e) {
				  
			  }
		  /*
		   * IF TRY with multi catch block present then then the order of catch block is very important
		   * we have to take, child first then parent , other wise we get compile time error, saying
		   * exception "xxx" is already been caught 
		   * 
		   * we cant declear two catch block for same exception, other wise we will get compile time error
		   */

	}

}
