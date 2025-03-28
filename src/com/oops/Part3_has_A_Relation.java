package com.oops;
class Engine{
	public void strat() {
		System.out.println("engine is start");
	}
}
class Car{
	Engine engine = new Engine();
	/*
	 * Yes, there's an error in the Car class because you are trying to call a method (engine.strat()) directly
	 *  inside the class body, outside any method or constructor. In Java, statements (like method calls) must
	 *   be inside a method, constructor, or an initializer block.
	 */
	engine.strat();
	/*
	 * Why is this an error?
	    The method call (engine.strat();) is not inside a method, constructor, or initializer block.
		Java does not allow direct execution of statements inside a class body.

	 */
	Car(){
		engine.strat();
	}
	public void methodCar() {
		engine.strat();
	}
	
	public void m1() {
		System.out.println("no args");
	}
	public int m1(int i) {
		System.out.println("int args");
	}
	public void m1(double d) {
		System.out.println("double args");
	}
}

public class Part3_has_A_Relation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine engine = new Engine();
		engine.strat();
		
		/*
		 * HAS A relationship is also known as, composition or aggregation
		 * there is no specific keyword impliment has a relationship, but most of the time we are depending on
		 * new keyword,
		 * the main advatage of has a relationship is, reussebulity of the code
		 * 
		 * ex. -->Car has a engine refernce
		 * 
		 * DIFFERNCE BETWEEN COMPOSITION AND AGGREGATION
		 * 
		 * WITHOUT existeing conatiner object, if there is no chance of existing conatined objects, then
		 * conatiner and conatin object are, stringly associated, and this string association is nothing but
		 * compossition,
		 * 
		 * University consists of several departments withoud existing university, there is no chnace
		 * of of exixting department , hence university and department are strogly asscoicated and
		 * this string association is nothing but, composition
		 * 
		 * AAGEGATION
		 * without existing container object there is chance of existing conatined object then conatiner and 
		 * conatined objects are, weekly associated, and this week association is nothing but agregation
		 * 
		 * ex. department consists of severl proficcers without existing department, there may be a chance of
		 * exixting profficer objects, 
		 * Hece department and proficcer object are weekly associated and ths week association is nothing but
		 * aggregation
		 * 
		 * NOTE : 
		 * in composisiton object are strongly associated, whereus in aggregation object are wekly associated
		 * 2) in compostion container object holds directly conatined object, whereus in aggrigation conatiner object
		 * s hold just refernce of conatined objects
		 * 
		 * 3(if we want total functionality of a class automatically then we should go for  IS-A-RELATIONSHIP
		 * ex.  complete functionality of Person class required for student
		 * if we want part of the functionality then we shoul go for,HS-A-RELTIONSHIP
		 * ex, test class conatin 100 method , within the demo class required2/3 method
		 */
		
		//METHOD SIGNATURE
		/*
		 * In java mathod signature consits of method names followed by argument types,
		 * ex. ---> m1(int, float), 
		 * return type is not part of method signature in java,
		 * 
		 * compile are used to method signature while resolving method calls,
		 * 
		 * within a class two method with same signatrue not allowed,
		 * 
		 */
		
		//Overloading
		/*
		 * two mathod are said to be overloaded if and only if both methods having same name, but d
		 * different argument types,
		 * 
		 * in c language method overloading concept is not availabe we cant declear multiple methods,
		 * with same name but different arguments types, if there is change in argument type coplusary
		 * we should go for new mtethod name , which increses complexity of programming
		 * abs(int i),
		 * fabs(float)
		 * labs(long)
		 * 
		 * 
		 * but in java we declear methosd the same name but different argument types such type of metho are c
		 * callled overloaded method, 
		 * abs(int)
		 * abs(long)
		 * abs(float)
		 * Having overloading concept in jva reduces complexity of the programming, 
		 */
		Car car = new Car();
		car.m1();
		car.m1(12);
		car.m1(12.66);
		/*
		 * IN overloading method resolution  always take care  by complier based on refernce type hence overloading
		 * is also consider as compile time polymorphisum , or static polymorphisum or early binding
		 */

	}

}
