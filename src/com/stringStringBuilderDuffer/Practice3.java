package com.stringStringBuilderDuffer;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("ram");
		String str1 = sb.toString();  //create obj 1 , created in heap not scp
		//write your code here
//		String str2 = str1; /true
//		String str2 = sb.toString();  //again new object created
		String str2 = new String(str1);
//		String str2 = "ram";
		
		System.out.println(str1 == str2);

	}

}
