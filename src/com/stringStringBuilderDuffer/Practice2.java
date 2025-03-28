package com.stringStringBuilderDuffer;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sb.toString();
		StringBuilder sb = new StringBuilder(5);
		String s="";
		if(sb.equals(s)) {   
			//comes from object class
			System.out.println("Match 1");
		}else if(sb.toString().equals(s)) {
			//sb.toString == String object,  then equal(overiden), means content comparison
			System.out.println("Match 2");
		}else {
			System.out.println("no match");
		}
		
		
		// obj equal obj2   obj = sb and obj2 = s  both are differeent always false, 
		//object is difference so reference also difference , object class equal method compare reference

	}

}
