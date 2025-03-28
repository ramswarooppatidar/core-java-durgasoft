package com.internationlization;

import java.util.Locale;

public class Locale_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* A locale is epresnt a geographic loaction(country), or a language are both
		 * EX : we can crtae a local object to reprent india,
		 * we can create local object to represent englisg language
		 * loacl classs prent in java .util package, 
		 * it is a final class, it is direct child class of object
		 * it implements serilizable and clonable interface
		 * */
		Locale l = new Locale("English");
		//Locale l1 = new Locale( String language, String country);
		Locale l1 = new Locale("English", "India"); //"pa" "IN"
		
		//local class contain some constant we use that constant directly
		Locale l2= Locale.CANADA;
		
		Locale l3 = l2.getDefault();
		System.out.println("default "+l3);
		

		Locale locale[] = l2.getAvailableLocales();
		for(Locale ls : locale) {
			System.out.print(ls+" ");
		}
		
		//important methods of loacle class
		l2.getDisplayCountry();
		System.out.println(l2.getDisplayCountry());
		System.out.println(l2.getLanguage());
		System.out.println(l2.getDisplayLanguage());
		
		String language[] = l2.getISOLanguages();
		for(String string : language) {
			System.out.print(string+" ");
		}
		
		String country[] = l2.getISOCountries();
		System.out.println(country);
		for(String string : country) {
			System.out.print(string+" ");
		}
		
		
		

	}

}
