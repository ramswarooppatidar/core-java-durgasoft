package com.oops;

class Pa{
	public void prop() {
		System.out.println("gold land cash");
	}
	public void marray() {
		System.out.println("shree-lakshami");
	}
	public void other() {
		System.out.println("only parent");
	}
	//covarient 
	public Object m1() {
		return "";
	}
	public Number m2() {
		return 1.2f;
	}
	public Double m3() {
		return 2.3;
	}
	public Boolean m4() {
		return true;
	}
	
	//private
	private void m5() {
		System.out.println("parent private method");
	}
	//final
	public final void  m6() {
		
	}
}
class Ca extends Pa{
	public void marray() {
		System.out.println("Anuradha");
	}
	public void specific() {
		System.out.println("specific");
	}
	
	//covarient return type, or child type return type, it is invalid in 1.4 version
	public StringBuilder m1() {
		return new StringBuilder("rte");
	}
	public Double m2() {
		return 1.2;
	}
	public double m3() {
		return 1.3;
	}
	public boolean m4() {
		return false;
	}
	private void m5() {
		System.out.println("child private method");
	}
	public final void m6() {
		
	}
}
class Parent{
	public void m1() {
		
	}
	public void m2() {
		
	}
	void m3() {
		
	}
	public void m4() {
		
	}
}
abstract class Child extends Parent{
	public abstract void m1();
	
	public final void m2() {
		
	}
	public void m3() {
		
	}
	void m4() {
		
	}
}
class SubClass extends Child{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Part5_Oerriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * OVERRIDING ;
		 * what ever method parent has bydefault available to the child through inheritance if child class
		 * not setiesfied with the parent class implementsation, then child s allowed to redefined that 
		 * method based on its requirment , this process is called overriding
		 * the parent class method whch is overriden is called overridean method,
		 * and child class method which is overriding is called overriding method
		 */
		Pa p1 = new Pa();
		p1.marray();
		p1.prop();
		System.out.println("\n");
		
		Pa c1 = new Ca();
		c1.marray();
		c1.prop();
		c1.other();
		c1.specific() //compile check parent refernce , so check method in parent class
		System.out.println("\n");
		
		Ca c2 = new Ca();
		c2.marray();
		c2.prop();
		c2.specific();
		System.out.println("\n");
		
		/*
		 * iN OVERIDING method resolution, always takes care by, jvm based on runtime object and hence overiding
		 * is also consider as runtime ploymorphisum , or dynamic polymorphisum or letbinding,
		 *
		 * RULES FOR OVERRIDING :
		 * 
		 * 1) in overriding methods name and arguments types must be matched, that is method signatures must be same
		 * 2) in overriding return type must be same but tis rule is aplicable until 1.4 version only from 1.5 version
		 * onword we can take , covarient retun types, according to this chid class method return type need not be same
		 * as parent mathod return type, its child type also allowed
		 * 
		 * 3) parent class method return type---->child class method return type
		 * Object---->string\stringbuilder|,   Number--->Integer|Number  
		 * doble--->int (WRONG,NOT ALLOWED FOR PRIMITIVE TYPES)
		 * covirent return type concept aplicable only for bject types, but not for premitive types
		 * 
		 * 4) parent class private method not availbe to the child and hence overridng concept not applicabe for
		 * private methods,
		 * based on over requiremtn we can defined excetly same private method in chld class it is valid but
		 * not overriding
		 * 
		 * 5) we cant override parent class final method in child class if we trying to override we will get 
		 * compile time error
		 * 
		 * 6) parent class abstract method we should overide in child class to provide implemention
		 */
		Pa p4 = new Ca();
		p4.m5();  //private method call with parent refernce 
		p4.specific();  //only child class method
		
		/*
		 * 7) we can override non-abstarct method as abstract
		 * we can overide non-final method as final aslo
		 * 
		 * 8) In overriding the following modifier wanot keep any restriction
		 * 1) synchonized, native, strictfb
		 * 
		 * 9) while overridng we cant reduce schope of access modifier but we can increase the scope,
		 * ce : m4 in child cannot overide m4 in ,  attemptied weaker acess modifier public
		 * 
		 * private<default<protected<public accessmodifier
		 * parent-->child
		 * public--->public
		 * protected---->protected|public
		 * default---->default|protected|public
		 * private ---->overiding concept is not aplicabele for private
		 */

	}

}
