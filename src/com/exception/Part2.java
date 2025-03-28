package com.exception;

public class Part2 {

	public static void main(String[] args) {
		doStuffe();

	}

	private static void doStuffe() {
		doMoreStuffe();
		System.out.println(10/0);
		
	}

	private static void doMoreStuffe() {
		// TODO Auto-generated method stub
		System.out.println("hello");
//		System.out.println(10/0);
		
	}
	/*
	 * Inside a method if any exception is occurse the method in which its raised is responsible to ceate
	 * exception object by including, following information :
	 * name of exception, 
	 * dexcription of exception,
	 * location at which exception occurce(stack trase)
	 * 
	 * after creating excpetion object method hend over the object to the jvm
	 * 
	 * jvm will check whether the ethod contains any exception handling code or not, if the method dsnt
	 * conatin exception handling code then jvm termibates the method abnormally, and remove the corrosonding
	 * entry from the stck,
	 * 
	 * then JVM identify the calller method, and checks whether caller method conatins any handling code or not
	 * if the caller method dsnt conatin handling code, then jvm terminats the caller method abnormally
	 * ad removes the corrospnding entry form the stack, 
	 * this process will be continue until, main methos and if main method also, dsnt contain handling code
	 * then, jvm terminats main method ab normally and removes corrosponding entry from the satck,
	 * 
	 * then JVM handovers responibility of excpetion handling to default excpetion handler, which is the part
	 * of JVM , dafult excpetion handler prints excpetion information in the following formate, and terminats
	 * program abnoarmlly:
	 * excpetion in thred "xxx"  name of the excpriton, descprion & stack trace
	 * 
	 *  Exception in thread "main" java.lang.ArithmeticException: / by zero
	 *  at com.exception.Part2.doMoreStuffe(Part2.java:17)
	 *  at com.exception.Part2.doStuffe(Part2.java:11)
	 *  at com.exception.Part2.main(Part2.java:6)
	 *  
	 *  
	 *  //EXAMPE 2, 10/2 IN DOSTUFF
	 *  
	 *  if 10/0 in doStuff then exception is :
	 *  Exception in thread "main" hello
	 *  java.lang.ArithmeticException: / by zero
	 *  at com.exception.Part2.doStuffe(Part2.java:12)
	 *  at com.exception.Part2.main(Part2.java:6)
	 *  
	 *  NOTE : in a program if at least one method terminats abnormally then program termiation is abnormal
	 *  termination,
	 *  if all methods terminated normally then only program termination is normal termination.
	 *  (tHIS DEFAULT EXCEPTION HANDLING)
	 */

}
