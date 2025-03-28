package com.stringStringBuilderDuffer;

import javax.crypto.spec.RC2ParameterSpec;

public class ConceptString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String vs StringBuffer
		
		//1 check mutability
//		String s = new String("ram");
//		String s1 = s.concat(" swaroop");
//		System.out.println(s);
//		System.out.println(s1);
//		
//		StringBuffer sb = new StringBuffer("ram");
//		sb.append(" swaroop");
//		System.out.println(sb);
		
		//2 == / equals
//		String str = new String("ram");
//		String str1 = new String("ram");
//		
//		System.out.println(str == str1);
//		System.out.println(str.equals(str1));
//		//true bcz it is overwrite equal method of object class, 
//		// equal method of object class not content comparison
//		
//		StringBuffer strb = new StringBuffer("ram");
//		StringBuffer strb2 = new StringBuffer("ram");
//		
//		System.out.println(strb == strb2);
//		System.out.println(strb.equals(strb2)); 
		//false  equal methos of object class compare adrress not content, and buffer class not overwrie equal methods
		//so ts return false
		
		
		//SCP 
		String s = new String("ram");
		String s1 = new String("ram");
		String s2="ram";
		String s3="ram";
		
		String string = new String("ram");
		string.concat("swaroop");
		string = string.concat("Patidar");
		//6 object create 3 in heap, 3 in scp,  but 2 of heap is eligible for gc
		

}
}
