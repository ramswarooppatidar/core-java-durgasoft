package com.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * "/s" any space charcetry
		 * "/S  except Espace character
		 * "/d"  any digit 0-9
		 * "/D" except digit
		 * "/w"  any word chacter [a-zA-Z0-9]
		 *  "/W"  EXCEPT any word chacter [^a-zA-Z0-9]
		 *  . any chacter
		 */
		
//		Pattern p = Pattern.compile("\s");
//		Matcher m = p.matcher("a7b  #2@k");
//		while(m.find()) {
//			System.out.println(m.start()+"....."+m.end()+"..."+m.group());
//		}
//		
//		System.out.println("/S");
//		Pattern p1 = Pattern.compile("\\S");
//		Matcher m1 = p1.matcher("a7b  2@k");
//		while(m1.find()) {
//			System.out.println(m1.start()+"....."+m1.end()+"..."+m1.group());
//		}
//		
//		System.out.println("/W");
//		Pattern p2 = Pattern.compile("\\W");
//		Matcher m2 = p2.matcher("a7b  2@k");
//		while(m2.find()) {
//			System.out.println(m2.start()+"....."+m2.end()+"..."+m2.group());
//		}
//
//		System.out.println(".");
//		Pattern p3 = Pattern.compile(".");
//		Matcher m3 = p3.matcher("a7b  2@k");
//		while(m3.find()) {
//			System.out.println(m3.start()+"....."+m3.end()+"..."+m3.group());
//		}
//		
		/** quantifier  we can use , to specifing number f ocuurence to match
		 *  "a" excetly one a
		 *  "a+"  atlest one a
		 *   "a*" any number of a including 0 number
		 *   a?   at most 1 a
		 */
		System.out.println("Qantifire");
		Pattern q = Pattern.compile("a");
		Matcher mq = q.matcher("abaabaaaba");
		while(mq.find()) {
			System.out.println(mq.start()+"....."+mq.end()+"..."+mq.group());
		}
		
		System.out.println("Qantifire a+");
		Pattern q1 = Pattern.compile("a+");
		Matcher mq1 = q1.matcher("abaabaaaba");
		while(mq1.find()) {
			System.out.println(mq1.start()+"....."+mq1.end()+"..."+mq1.group());
		}
		
		System.out.println("Qantifire a*");
		Pattern q2 = Pattern.compile("a*");
		Matcher mq2 = q2.matcher("abaabaaabaaaa");
		while(mq2.find()) {
			System.out.println(mq2.start()+"....."+mq2.end()+"..."+mq2.group());
		}
		
		System.out.println("Qantifire a?");
		Pattern q3 = Pattern.compile("a?");
		Matcher mq3 = q3.matcher("abaabaaaba");
		while(mq3.find()) {
			System.out.println(mq3.start()+"....."+mq3.end()+"..."+mq3.group());
		}
	}

}
