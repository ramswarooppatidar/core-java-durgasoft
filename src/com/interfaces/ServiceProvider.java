package com.interfaces;

public abstract class ServiceProvider implements Part_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public void m1() {  //public
		System.out.println("m1");
		
	}
	
}
class subServiceProvider extends ServiceProvider{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}
/*
 *  1) whene ever we are implemnting an interface for each and every method of that interface we have to 
 * provide implemention , other wise we have to declare class as abstract, 
 * then next level child class is responsible to provides implementation
 * 
 * 2) every interface method is always public and abstract whether we are decalring or not, 
 * hence whenever we are implement interface method compulsary we should decalre as public , other wise 
 * we will get compile time error
 * 
 * 
 *  Extends ver Implemnts,
 *  a class can extend, class can implemtnt any number
 *  Interfcae A , B,  iNTERFACE C extend A, B
 *  1) a class can extend only one class at a time, 
 *  2) an interface can extend any number of interfaces simulataniolsy (multiple inheritance)
 *  3) a class can implement any no. of interface simulataniously
 *  4) class A  extends Another class B and can implement any number of interfaces simulataniously I1, I2, I3
 *  
 *  NOTE : extends followed implements , first extends then 2 nd implements
 *  
 *  
 */
