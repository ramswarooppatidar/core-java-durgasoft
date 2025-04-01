package com.oops;

public class Parts12_instanceFlow {
	int x = 10;
	{
		m1();
		System.out.println("first instance block");
	}
	Parts12_instanceFlow(){
		System.out.println("execute constructor");
	}
	public static void main(String[] args) {
		// when object srete then instance fllow is executed
		// if we comment line 1 one then o/p is "main method"
		Parts12_instanceFlow test = new Parts12_instanceFlow();   //line 1 
		System.out.println("main method");
	}
	public void m1() {
		System.out.println("value of y is :"+y);
		System.out.println();
	}
	int y = 20;
}
/*	Whenever we are executing a java class first static contriol flow is will be executing
 * in the static control flow if we creating an object then the following sequence of events will be executed
 * as a part of instance control flow 
 * 1) Id entification of instance member from top t bottom
 * 2) execution of instance varibale and instance bock from top to bottom
 * 3) execution of constructor 
 * 
 * NOTE : static controll flow is 1 time activity which will be perfom at the time of class loading, 
 * but instavce control flow is not a one tie activity and it will be perfom for evry object create
 * 
 * Object creation is most costly opertaion, if there is no specific requiremnt then it is not recommended
 * to create object
 * 
 * instance control flow in parent to child relation-ship
 * 
 */
class child extends Parts12_instanceFlow{
	int x = 100;
	{
		m2();
		System.out.println("first instance block child");
	}
	child(){
		System.out.println("execute constructor child");
	}
	public static void main(String[] args) {
		// when object srete then instance fllow is executed
		// if we comment line 1 one then o/p is "main method"
	 child test = new child();   //line 1 
		System.out.println("main method child");
	}
	public void m2() {
		System.out.println("child value of y is :"+y);
		System.out.println();
	}
	
	int y=200;
}
/*
 * whenever we are createing child object then following sequence of order form oautomatically as a part
 * of instance control flow
 * 1) identification of instance meber from parent to child
 * 2) execution of instance variable assignmnet and instance block only in parent class
 * 3) execution of parent constructor
 * 4) execution of instamce vairble assignment and instave block in child cls
 * 5) execution child constructor
 */
