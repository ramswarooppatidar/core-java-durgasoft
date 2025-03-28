package com.internationlization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormte_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* various location follow various fomates
		 * for In : 1,23,345
		 * US : 123,45
		 * we use to number fomate class to fomate a java number according to locale
		 * it is ab abstrct class
		 * numFormate nf = new nf(), wrong
		 * 
		 * */
		NumberFormat num1 = NumberFormat.getInstance();
		NumberFormat num2 = NumberFormat.getNumberInstance();
		NumberFormat cur = NumberFormat.getCurrencyInstance();
		NumberFormat per = NumberFormat.getPercentInstance();
		
		//number formate for specific Locale
		//the above method are same but we have to pass corrosponding locale as a argument
		per.format(0);
		//once we got numformate object we can call formate and parse method on that object
		
		//write  aprogram to display a java number in italy specific form
		double d=1236774.7896;
		NumberFormat itl = NumberFormat.getInstance(Locale.ITALY);
		String string=	itl.format(d);
		System.out.println(" itly specific :"+string);
		
		//i want currency number, write a program to display java number in UK, US,INDIA currency form
		double d1 = 123456.78;
		Locale india = new Locale("pa", "IN");
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(india);
		System.out.println("india specific : "+nf1.format(d1));
		

		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println("uk specific : "+nf2.format(d1));
		

		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("us specific : "+nf3.format(d1));
		
		//SETING MAXIMUM AND MINIMUM FRACTION AND INTEGER DIGITS
		//NUMBER FORMATE CLASS DEFINED FOLLOWING METHOD FOR THIS PURPOSE
		// setMaximumFractionDigit();
		// setMinimumFractionDigit();
		// setMaximumIntegerDigit();
		//  setMinimumIntegerDigit();
		NumberFormat nf4 = NumberFormat.getInstance();
		nf4.setMaximumFractionDigits(2);
		System.out.println("setMaximumFractionDigits(2) : "+nf4.format(4563.789));
		System.out.println("setMaximumFractionDigits(2) : "+nf4.format(4563.7));
		
		nf4.setMinimumFractionDigits(2);
		System.out.println("setMINIMUMFractionDigits(2) : "+nf4.format(4563.789));
		System.out.println("setMINIMUMFractionDigits(2) : "+nf4.format(4563.9));
		
		nf4.setMaximumIntegerDigits(2);
		System.out.println("setMaximumIntegerDigits(2) : "+nf4.format(456563.789));
		System.out.println("setMaximumIntegerDigits(2) : "+nf4.format(3.789));
		
		nf4.setMinimumIntegerDigits(3);
		System.out.println("setMinimumIntegerDigits(3)(3) : "+nf4.format(456563.789));
		System.out.println("setMinimumIntegerDigits(3)(3) : "+nf4.format(3.789));
		
		
		
		

	}

}
