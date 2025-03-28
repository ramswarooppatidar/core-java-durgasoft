package com.oops;
class P{
	public void m1() {
		System.out.println("parent");
	}
}
class C extends P{
	public void m2() {
		System.out.println("child");
	}
}
interface P1{
	void m1();
}
interface P2{
	void m1();
}
interface CI extends P1, P2{
	void m2();
}
class ITF implements CI{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Part2_is_realtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * it is also no as inheritance , themain advantage of is a relationship is code reuseability
		 * by using extend key word we, can impliment is a relationship
		 */
		P p0 = new P();
		p0.m1();
		p0.m2();   //error
		
		P p1 = new C();
		p1.m1();
		p1.m2();  //error 
		
		C c1 = new C();
		c1.m1();
		c1.m2();
		
		/*
		 * CONCLUSION 1 :
		 * whatever methos parent has by default availble to the child, and hence the child refernce we can call
		 * both parent and child class method
		 * 
		 * CON 2:
		 * whatecver method child has not availble to the parent and hence on parent refernce we cnt call child 
		 * specific methods
		 * 
		 * CONCLUSION 3 :
		 * parent referce can be used to hold child object, but using the referce we cant call child speific methods
		 * but , we can call the methods present in parent class
		 * 
		 * CONCLUSION 4 :
		 * parent referce can be used to hold child object but child referce canot use to hold parent object
		 * 
		 * Total java api is implemented based on inhertance concept, 
		 * the most comoom method which are applicable for any java object are defined in object class,
		 * and hence every class in child is a child class of object, either directly or in directly so
		 * object class method, is availble to every child class, without rewriting, 
		 * 
		 * Throwbale class define most common method or require every exception and error class hence this class
		 * as root for java exception hiraracy
		 * 
		 * Multiple inheritance: a java class cant extend more then one class at a time, henece java wont 
		 * suport for multiple inheritance in classess,
		 * 
		 * class A extends B, C{}
		 * 
		 * NOTE : if over class dosnt extends any other class, then only our class is direct child class of 
		 * object
		 * A-->child of Object
		 * if our class extends any other class then , our class is indirect child class of object
		 * Class A Extend B{}
		 * A--child-->B--CHILD-->Object (multilevel Inheritance)
		 * 
		 * NOTE:either directly and indirectly java wnot provide support inheritance with respect to classess
		 * 
		 * why java not support multiple inheritance : due to ambugity problems,
		 * but interface can extends any no. of interface, java support multiple inhertiace wrt interfaces
		 * 
		 * WHY AMBIGUITY PROBLEMS WONT BE THERE THIS INTERFACE ?
		 * PI---->M1(), P2--->M1(),  CI--->EXTENDS M1, M2
		 * 
		 * Eventhough multiple method declartion are availble but implementaion is quiqe and hence there is
		 * no chance of ambigutity problem in interfaces
		 * 
		 * NOTE : strictyly speaking throught interface we wanot geting inhertiance,
		 * 
		 * Cyclic inheritance is not allowed in a java,  A extends B, B class Extends A
		 */
	}

}
