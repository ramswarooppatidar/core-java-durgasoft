package com.exception;

import java.io.IOException;
import java.io.PrintWriter;

public class Part8 {
	
	Part8() throws Exception{
		
	}
	public void greet() throws Exception{
		
	}

	public static void main(String[] args)
//	throws InterruptedException
	{
//		throw new Exception();
//		throw new Error();
		// THROWS KEY WORD
//		PrintWriter pwPrintWriter = new PrintWriter("hello");
//		pwPrintWriter.write(0);
		
		/*
		 * In our program if there is possibility of rasing checked exception then, compulasry
		 * we should handle that checked exception, other wise, we will get complie time error
		 * saying,  un reported exception ?xxx  must be caught decler to be thrown
		 */
		
		Thread.sleep(1000);
		/*
		 * unreported exception interupted	exCEPTION MUST BE Caugnht or decler to be thrown,
		 * we can handle this comile time erro by using by the following to ways,
		 * 1) by using try catch intrupted exeption 
		 * 2) by using throw key words, we can use throes key word to delicate responsibility of exception handling
		 * to the caller(it may be anoher mathod or jvm) then caller method is responsible to handle that exception
		 * 
		 */
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
			/*
			 * throws keyword required only for checked exception and uses of throws key word for unchaked
			 * exceptions ther is no use or no impect, 
			 * 
			 * throws key word required to convence compiler, and uses of throws key word doesnt prevent
			 * abnormal termination of program
			 * 
			 * 
			 */
			
			try {
				doStuff();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			/*
			 * in above program if we will remove one throws stetement then , code wnot compile
			 * 
			 * throws is use to delegate exception handling to the caller
			 * it is used for only compiler convienec, throws does not prevent abnormal termination of program
			 * 
			 * it is used for only checked exception using for checked exception there is no impact
			 * NOTE : it is recommended to use try catch over throws key word,
			 * 
			 * CASE 1: we can use throws key word for methods and constructor but not for classes,
			 * 
			 * CASE 2:
			 * we can use thows key word only for throwable type if we use to try to use normal java classes then we 
			 * willl get cmpile time error, syaing incompatable types
			 * 
			 * CASE 3 :
			 * Exception must be caugh and declear to be throws,
			 * 1) compile time error, 2) Exception in thread main
			 * 
			 */
			
//			throw new Exception();  CASE 3
//			throw new Error();      //CASE 3 error : unchecked exception
			
			try {
				System.out.println("hello");
			}catch(ArithmeticException e) {
				
			}
			
			try {
				System.out.println("hello");
			}catch(Exception e) {
				
			}
			
			//case 4
			/*
              within the try block if there is not chancing to rasing a exception we cant write catch
              block for that exception other wise we will get compile time error saying,
              
              exception xxx is never thrown in yhe body of corrosponding try stetement,
              but this is only applicable for only for fully checked excetion
              exception , partialy checked,io, intrupted fullchecked
              arithemetic unchked,  error uncheked
			 */
			
			try {
				System.out.println("hello");
			}catch(IOException e) {
				
			}
			
			try {
				System.out.println("hello");
			}catch(InterruptedException e) {
				
			}
			
			try {
				System.out.println("hello");
			}catch(Error e) {
				
			}
			
			
			
	 } //closing main method

		private static void doStuff() throws InterruptedException {
			// TODO Auto-generated method stub
			doMoreStuff();
			
		}
	
		private static void doMoreStuff() throws InterruptedException {
			// TODO Auto-generated method stub
			Thread.sleep(1000);
		}
		
		
		 
	

}
