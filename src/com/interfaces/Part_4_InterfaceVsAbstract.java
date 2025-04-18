package com.interfaces;

class p{
	p(){
		System.out.println("parent :"+this.hashCode());
	}
}
class c extends p{
	c(){
		System.out.println("child "+this.hashCode());
	}
}
public interface Part_4_InterfaceVsAbstract {
	public static void main(String arg[]) {
		p object = new C();
		System.out.println("main "+ object.hashCode());
	}
}
/*
 approch 1 :
 without having constructor in abstract class,
 more code , code redundency problem is there , if 100 properties in abstrcat class(parent) and studen(child)
 teacher(child)  again and again we write constructor with 100 properties, 
 
  
  approch2: with constructorin abstarct class
  from student child we use super(100) properties, same as techer so, readablity of code increase,
  parent class constructor is used for evry child cration
  
  Constructor is used to initiliazed the object but not create theobject
  
  NOTE : either directly or indirectly we cant create object for abstrct class
  
  QUESTION :
  any way we cant create bject for abstract class and interface but abstract class c an contain constructor
  but interface dosnt conatian constructor, what is the reason
  
  ANSWER :
  the main purpose of constructor is to perfom initilization of instance varibles
  abstract class can conatin instance varible which are required for child object, to perfom initilizztion
  of those instance varibles constructor is required for abstrct class 
  but every varible is present inide interface is always public static final whether we are declaring or
  not and there is no chance of existing instance varible inside interface, hence construcor concept is
  not required for interfce
  
  
  whenever we are creteng child class object parent object wont to be created just parent class constructor 
  will be executed for child object purpose only
  
  Question : 
  inside interfce every method is abstract and we can take only abstract method in abstrct class alos then
  what is difference between interface and abstrt class , itis possible to replce interface with abstrct class
  
  ANSWAR : WE CAN REPLCE interface with abstractclass but it is not good programming practices this is somthing like 
  recruting ias officer for sweping activity
  if every thing is abstrct then then it is highly recommendedto interfce
  
  
  
  
 */
