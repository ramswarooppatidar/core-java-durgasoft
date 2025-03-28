package com.stringStringBuilderDuffer;

import java.nio.channels.NonWritableChannelException;

public class StringBuffer_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//default constructor
//		StringBuffer stringBuffer = new StringBuffer();
//		int capacity = stringBuffer.capacity();
//		stringBuffer.append("fyuufgdsgsgdsgfg");
//		stringBuffer.append("f");
//		int capacity2 = stringBuffer.capacity();
//		System.out.println(capacity);
//		System.out.println(capacity2);
//		
		
		//case 2
//		StringBuffer sb = new StringBuffer("ram");
//		
//		System.out.println(sb.capacity()); //s.length() + 16
//		sb.setCharAt(2, 'd');
//		sb.append("any argumet accept, int char long boolean");
//		System.out.println(sb);
//		
//		StringBuffer sb1 = new StringBuffer("PI VALUE IS");
//		sb1.append(3.14);
//		sb1.append("is excetly same ");
//		sb1.append(true);
//		System.out.println(sb1);
//		sb1.insert(7, false);
//		System.out.println(sb1);
		
//		//delete
//		sb1.delete(4, 14);
//		System.out.println(sb1);
		
		
		//setLenght(), ensureCapcity(), trimToSize()
		StringBuffer sbt = new StringBuffer(1000);
		sbt.append("ramswaroop");
		sbt.trimToSize();  // memory utilized
		System.out.println(sbt.capacity());
		

	}

}
