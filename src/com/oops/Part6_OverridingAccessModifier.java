package com.oops;

import java.io.FileNotFoundException;
import java.io.IOException;

import generics.part1;

class Pa1{
	public void m1() throws IOException {
		System.out.println("parent is call");
	}
	public void m2() throws IOException, InterruptedException {
		System.out.println("parent is call");
	}
	public static void m3() {
		
	}
	public  void m4() {
			
		}
	public static void m5() {
			
		}
}
class c1 extends Pa1{
	public void m1() throws FileNotFoundException, Exception{
		System.out.println("child is call");
	}
	public void m2() throws InterruptedException, FileNotFoundException {
		System.out.println("parent is call");
	}
	public void specific() {
		
	}
	public void m3() {
		
	}
	public static void m4() {
			
	}
//  method hiding but not overriding
		public static void m5() {
		
		}
}
public class Part6_OverridingAccessModifier{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Pa1 pa1 = new c1();
		pa1.m1();
		pa1.m5();
	}
	/*
	 * IF child class method throws any checked exception compulasry arent class method shuold throw the 
	 * same exception or its parent, other wise we will get compile time error, but there is not restriction
	 * for unchecked exception
	 */
	
	//Overriding with respect to static methods
	/*
	 * we cant overide static method as non static otherwishe we will get compile time error 
	 * m3 in c cannot overide m3 in p,overridean method in p is ststsic
	 * 
	 * similory we cant overide a non static method as ststsic,
	 * m3 in c cannot overide m3 in p,oerriding mthod in p is ststsic
	 * 
	 * If method parent and child class method are static, then we wont get any compile time error
	 * its seems overiding concept aplicabe for static methods, but it is not overriding, and it is
	 * Method hiding
	 * 
	 * METHOD HIDING :
	 * ALL rules of method hiding excetly same as overriding except the followind differences,method resoltuion
	 * compile based on refernce type,  
	 * overring-->method resolution always take care by jvm based on runtime object
	 * (jvm responsible for method resoltuion based on runtime object)
	 * 
	 * hiding-->CT POLYMORPHISUM, static polymorphisum, early dinding
	 * Riding-->dynamic, runtime, letbinding 
	 * 
	 * if both parent and child class methd non ststic then it willbecome overriding,
	 * 
	 */
	

}
