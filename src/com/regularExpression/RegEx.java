package com.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//patter and matcher classes in, regex package and introduce in JAVA1.4 version
		//pattern is compile version of regExpresion it is java equvalent object, of pattern
		Pattern pattern = Pattern.compile("xyz");
		
		//matech object use to check given pattern , in the target string, create matcher object
//		by using matcher Method of patter clsss
		Matcher matcher = pattern.matcher("abbbbabhdjdabxyzhhdjdxyzhgfgajhgkahfkajhklajsxyz");
		int count=0;
		while(matcher.find()) {
			count++;
			System.out.println(matcher.start()+"...."+matcher.end()+"...."+matcher.group());
		}
		System.out.println("total number of occurence :"+count);

	}

}
