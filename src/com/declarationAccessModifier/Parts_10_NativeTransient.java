package com.declarationAccessModifier;

import java.lang.annotation.Native;

public class Parts_10_NativeTransient {

	static {
		System.loadLibrary("Native natives");  //1
	}
	public native void m1(); //2
	public static void main(String[] args) {
		// NATIVE
		
	/*
	 * netive is a modifier applicable only for method and we cant apply any where else, 
	 * the method which are imlemented in non java(mostly c or c++) are called netive methods or forgin method
	 * 
	 * the main objectives of nativekeywird are 
	 * 1) to improve performance of the system
	 * 2) to achieve machin level or memory level communication to use already existing legassy non java code
	 * 
	 * pseudo cod to use native key word in java
	 * Native native1 = new Native();
	 * native1.m1();  //3
	 * 1) load native libraray
	 * 2) declare nativ emethod
	 * 3) invoke native method
	 * 
	 * for native method implemention is alreday avaialbe in old language like c/c++ and we are not responsible
	 * to rovide implemetation, hence netive method declartion should ends with semicolon;
	 * public native void m1();
	 * native method not have body
	 * 
	 * for native method imlemetation is already avaiable in old languages but for abstarct methods
	 * implementation should not be avaialbe, hence we cant decalre netive method as abstract, 
	 * native abstract combination id illegal combination for method
	 * 
	 * we cant decler netaive method as strictfe because there is no guartent that old languGES follow
	 * IEEE750  for standard , hence netive stricfb combination is inlegal combination of methods
	 * 
	 * the manin advantage is performance will be improved but the main disadvatnage is it breaks platform
	 * independent nature of java,
	 * 
	 */
	
		//TRANSIENT KEY WORD
	/*
	 * transisent is the modifier applicable only for variable we can use transient key word in serilization
	 * context
	 * 
	 * at the time of serilization if we dont want to save the value of perticular variable to meet security
	 * constant then we should declear that varible as transient
	 * at the time of serilization jvm ignores original value of transient varible and save default value to
	 * the file, Hence transient means NOT TO SERILIZE
	 */
		
		//volatile
	/*
	 * volatile is modifier applicable only for varible, and we cant apply any where else .
	 * if the vaue of the varible keep on changing by multiple thread, then there may be a chance of data inconsistancy
	 * problem we can solve this problem by using volatile modifier
	 * if a varible declared as volatile then for every thread jvm will cretae a seprated local copy,
	 * every modification performed by the thread will takes place in local file, so there is no affect on remianing
	 * threds
	 * 
	 * the man advatnge of volatile key owrd is we can overcome data incosistency problem but the main disadvantge 
	 * of volatile key word is creating and maintaing a separte cpy for evry thread increse complexity of programming
	 * and creats performance problems, hence if there is no speififc reqiuirement it is never recommended to use
	 * volatile key word, and it is almost depricated key word
	 * 
	 * final varibles mean the value never changes whee as volatile varibles mens value keep on changing hence
	 * volatile final is illegal combination for variables
	 * 
	 */
	}

}
