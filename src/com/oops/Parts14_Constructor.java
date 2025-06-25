package com.oops;

class Testtt{
	int id;
 public Testtt(int id) {
	  
 }
 public Testtt(Double id) {
	
 }
 public  Testtt() {
	 
 }
}
class Check{
	
}
public class Parts14_Constructor {
	String name;
	int rollNumber;
	static int count=0;
	{
		//in stance block we can initilized value of instance variable, but not good practice
		count++;
	}
	public Parts_14_Constructor(String name, int roll) {
		this.name = name;
		this.rollNumber = roll;
//		count++
	}
	public Parts_14_Constructor() {
//		count++
	}
	public Parts_14_Constructor(String name) {
		this.name = name;
//		count++
		
	}
	public static void main(String[] args) {
		// inililized intance varible 
		Parts_14_Constructor obj1 = new Parts_14_Constructor();
		obj1.name = "Ramswaroop";
		obj1.rollNumber=1010;
		
		Parts_14_Constructor obj2 = new Parts_14_Constructor();
		obj2.name = "Ramswaroop";
		obj2.rollNumber=1010;
		
		Parts_14_Constructor obj3 = new Parts_14_Constructor("ram", 2773);
		System.out.println("total object :"+count);
		
		//default constructor 
		Check check = new Check();

	}
	/*
	 CONSTRUCTORE :
	 once we creates an object compulsary we should perform initilization then only the object is the possition
	 to response properly
	 
	 whenwher we are create a object some pice of code executed automitically to perform initlization of the object
	 this pice of code is nothing but constructor;
	 hence the main purpose of constructor is to perfom to inilization of object;
	 
	 NOTE : the main puspose of constructor is to perform initlization of object but not to create object
	 
	 DIFFERENT BETWEEN CONSTRUCTOR AND INSTANCE BLOCK
	 the main puspose of cons is to perform inilization of object but other than initlization if we want to perform
	 any activity for every object creation , we should go fro instance block(like update one entry in the database
	 for every object cretion,or increment count value for evry object cretion etc.)
	 
	 both constructor and instance block will be executed for every object creation but instance block first followed
	 by constructor next,
	 
	 ******Increment counting constructor is code redundency, we need to add cout++ in each constructor,
	 in coustructro chaning, count increse multiple time for single object
	 
	 
	 RULES CONSTRUCTOR :
	 1) name of class and name of c0nstuctor must be matched
	 2) return type concept not applicble for constructor even void also,by mistack if declare return type 
	 of constructore we wont gate any compiler time error , compiler treats as a method
	 3)  only applicable modifer for constructore, public, protected, private, default, 
	 other than this we get compile time error
	 
	 
	 DEFAULT CONSTRUCTOR:
	 1) compiler is responsible for generate default constructor not jvm,
	 2) if our class dosn't contain any constructor then compiler generate default constructor;
	 3) if we are writing atleast one construoctor then compile want generate default constructor;
	 
	 
	 
	 */

}
