package com.internationlization;

import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Date_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* various location follow various styles to represent data
		 * india : dd-mm-yyyy
		 * us : mm-dd-yyyy
		 * we can use date Formate to formate  java date according to particular locale
		 * 
		 * date formate presne t i  java.text package and it is an abstruct class
		 * we cant create create object using constructor
		 * DateFormate df = new DateFormate(), wrong
		 * */
		
		DateFormat df = DateFormat.getInstance();
		df.getDateInstance();
		df.getDateInstance(DateFormat.FULL);  //wednesday, 10th september, 2024
//		System.out.println(df.format("12/10/2013"))	;
		df.getDateInstance(DateFormat.DEFAULT);
		df.getDateInstance(DateFormat.MEDIUM); ////10th sep, 2024
		df.getDateInstance(DateFormat.SHORT); // 10/08/2024
		df.getDateInstance(DateFormat.LONG); //10th september, 2024
		
		//default dtyle is medium
		System.out.println("full form is :"+DateFormat.getDateInstance(0,Locale.US).format(new Date()));
		System.out.println("Long date is : "+DateFormat.getDateInstance(1, Locale.US).format(new Date()));
		System.out.println("Medium date is : "+DateFormat.getDateInstance(2, Locale.US).format(new Date()));
		System.out.println("Short date is : "+DateFormat.getDateInstance(3, Locale.US).format(new Date()));
		
		//formate
		System.out.println();
		System.out.println("COUNTRY STYES   : ");
		DateFormat uk = DateFormat.getDateInstance(0, Locale.UK);
		DateFormat us = DateFormat.getDateInstance(0, Locale.US);
		DateFormat itley = DateFormat.getDateInstance(0, Locale.ITALY);
		System.out.println("uk style is : "+uk.format(new Date()));
		System.out.println("us style is : "+us.format(new Date()));
		System.out.println("itely style is : "+itley.format(new Date()));
		
		//date time instance
		System.out.println();
		System.out.println();
		System.out.println("DATE TIME INSTANCE  : ");
//		getDateTimeInstance(dateStyle, timeStyle, locale)
		DateFormat ukt = DateFormat.getDateTimeInstance(0,0, Locale.UK);
		DateFormat ust = DateFormat.getDateTimeInstance(0,1, Locale.US);
		DateFormat itleyt = DateFormat.getDateTimeInstance(0,2, Locale.ITALY);
		DateFormat grm = DateFormat.getDateTimeInstance(0,3, Locale.GERMANY);
		System.out.println("uk date-time style is : "+ukt.format(new Date()));
		System.out.println("us date-time style is : "+ust.format(new Date()));
		System.out.println("itely date-time style is : "+itleyt.format(new Date()));
		System.out.println("Germany date-time style is : "+grm.format(new Date()));
		
		
		

	}

}
