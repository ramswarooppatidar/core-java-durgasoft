package com.stringStringBuilderDuffer;

public class FinalvsImmutaible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//final  => if final , then we can't reassign the object, but content is changed
		final StringBuffer sBuffer = new StringBuffer("Ram");
		sBuffer.append("swaroop");
		System.out.println(sBuffer); // CONTENT IS CHANGE 
		
		//reassignment of reference is not allowed
//		sBuffer = new StringBuffer("Patidar"); 
		
		//immutable taking about object, final is talking about varible
		//immutable means can't chanage the object,
		
		//we can't make String buffer immutable's

	}

}
