package com.stringStringBuilderDuffer;

public class Practice5 {
	public static String mask(String creditCard) {
		String x = "XXXX-XXXX-XXXX-XXXX";
		//case 1
//		StringBuilder sb = new StringBuilder(creditCard);
//		sb.substring(14, 19);
//		return x+sb;
		
//		return x+ creditCard.substring(14, 19);
		
//		return x.substring(0, 14)+ creditCard.substring(14, 19);
		
		StringBuilder sb = new StringBuilder(x);
		sb.append(creditCard, 14, 19);
		return sb.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mask("1234-5678-1234-5678"));

	}

}
 