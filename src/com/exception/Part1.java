package com.exception;

import java.lang.classfile.CodeBuilder.CatchBuilder;

public class Part1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * INTRODUCTION :
		 * 
		 * An unexpected and an wanted event that disturbs the normal flow the problem s called exception
		 * ex. tyrepictured excpetion, sleeping exception , fileNotFoundException,
		 * 
		 * it is highly recomnded to hadle exceptions, and the main objective of exception handling is
		 * garcefull termination of the program(data base example)
		 * 
		 * Excpetion handling doesnt mean reparing an exception we have to provide, alrebativ eway to
		 * continue rst of the programm normal is the concept of exception handling,
		 * 
		 * ex.over programing requirment is from remote file located at londone at run time if a london file is not available \
		 * over program should not be terminated ubnormally we have to provide some local file to contionue \
		 * rest of the program normally this way of defined the alernative is nothing but excpetion handling
		 */
			try {
				//file from london location
			}catch(Exception e){
				// get /ocal file 
			}
		 
		 /*
		  * RUN TIME STACK MACHENISUM :
		  * 
		  * for evry thread jvm will ceate a run time stack, each and evry method call perfomed by that thread wiill be
		  * stroed in corrosponding stack each entry in the stack is called , stck frem or activation record
		  * after completing, every method call the corrosponding entry form the stack wil be removed, 
		  * after compleint all method calls the stck will bcm emty and that empty stack will bw destroyed bty jvm , just
		  * just before terminating the thread
		  */

	}

}
