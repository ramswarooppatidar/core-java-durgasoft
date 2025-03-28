package com.stringStringBuilderDuffer;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Ram";
		String s2 = new String("Ram");
				
		//case 1
		String s3 =s2;
		if(s1 == s3) {
			System.out.println("Equal");
		}else {
			System.out.println("not Equal");
		}
		
		//case 2
		if(s1.equals(s2)) {
			System.out.println("Equal");
		}else {
			System.out.println("not Equal");
		}
		

	}

}
