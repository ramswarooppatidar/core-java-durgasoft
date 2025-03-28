package com.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * character class:
		 * [abc]     either a or b or c
		 * [^abc]    except a and b amd c
		 * [a-z]     any lower case alphabate symbol a-z
		 * [A-Z]     any upper case alphabate symbol A-Z
		 * [a-zA-Z]  any aphabate number
		 * [0-9]     any digit 0 tp 9
		 * 
		 * [0-9a-zA-Z]  any alpha numerice symbol
		 * [^0-9a-zA-Z] except alpha numeric ,  special charcetor
		 */
		
		Pattern pattern = Pattern.compile("[abc]");
		Matcher matcher = pattern.matcher("ab#@78ghs");
		while(matcher.find()) {
			System.out.println(matcher.start()+"......"+matcher.group());
		}
		
		System.out.println("[^abc]");
		Pattern pattern1 = Pattern.compile("[^abc]");
		Matcher matcher1 = pattern1.matcher("ab#@78ghs");
		while(matcher1.find()) {
			System.out.println(matcher1.start()+"......"+matcher1.group());
		}
		
		System.out.println("[a-zA-Z0-9]");
		Pattern pattern2 = Pattern.compile("[a-zA-Z0-9]");
		Matcher matcher2 = pattern2.matcher("ab#@78ghs");
		while(matcher2.find()) {
			System.out.println(matcher2.start()+"......"+matcher2.group());
		}
		
		System.out.println("[^a-zA-Z0-9]");
		Pattern pattern3 = Pattern.compile("[^a-zA-Z0-9]");
		Matcher matcher3 = pattern3.matcher("ab#@78ghs");
		while(matcher3.find()) {
			System.out.println(matcher3.start()+"......"+matcher3.group());
		}
		
		/*
		 * "/s" any space charcetry
		 * "/S  except Espace character
		 * "/d"  any digit 0-9
		 * "/D" except digit
		 * "/w"  any word chacter [a-zA-Z0-9]
		 *  "/W"  EXCEPT any word chacter [^a-zA-Z0-9]
		 *  . any chacter
		 */

	}

}
