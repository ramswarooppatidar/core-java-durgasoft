package com.oops;

import java.lang.classfile.instruction.NewMultiArrayInstruction;
class Animal{
	
}
class Monkey extends Animal{
	
}
public class Part4_Overloading {
	public void m1() {
		
	}
	public void m1(int i) {
		System.out.println("int-args : "+i);
	}
	public void m1(float i) {
			System.out.println("float-args");
		}
	
	
	public void m2(String s) {
		System.out.println("String-args");
	}
	public void m2(Object o) {
		System.out.println("Object-args");
	}
	
	
	
	public void m3(StringBuilder sb) {
		System.out.println("orgs string builder");
	}
	public void m3(String s) {
		System.out.println("String-args");
	}

	
	public void m4(int i, float f) {
		System.out.println("int-float version");
	}
	public void m4(float f, int i) {
		System.out.println("float-int version");
	}
	
	public void m5(int i) {
		System.out.println("int version");
	}
	public void m5(int... i) {
		System.out.println("ver-arg version");
	}
	
	
	public void m6(Animal a) {
		System.out.println("animal-version");
	}
	public void m6(Monkey m) {
		System.out.println("monkey-version");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * CASE 1 :AUTOMATIC PROMOTION IN OVERLOADING
		 * while resolving overloaded methods, if exect match method is not available, then we wont
		 * get any comilpe time error immediately,
		 * first it is promot argument to the next level and check method is availabe or not, if matched method 
		 * is avalibe then it will be consider, if matced method is not avalibe , then comlile promits
		 * argument one evelt o next level, this process will continue until all possible promotions,
		 * still if matched methods are not availbe then, we will get compile time error.
		 * 
		 * the folloeing are possible promotion in overloading
		 * 
		 * byte--->short--->int-->long---->float---->double
		 * char--->int
		 * this process is called automatic promotion in overloading
		 */
		Part4_Overloading object = new Part4_Overloading();
		object.m1('c');
		//object.m1(23.56); ce : canot find symbol, method m1.dobule loaction.class
		object.m1(553l);
		object.m1((byte)12);
		object.m1(56.67f);
		object.m1((short)1000);
		
		/*
		 * CASE 2 :
		 * while resolving methods compiles will always give presidance for child type arument and
		 * compared with parent typw argument
		 */
		object.m2(new Object());
		object.m2(new StringBuilder("String builder"));
		object.m2(null);  // string builder and String at  same level
		/*
		 * CASE 3 :
		 * refernce m3 to ambigues
		 */
		object.m3(new StringBuilder("String builder"));
		object.m3(null);
		
		/*
		 * CASE 4:
		 * ce : refernce to m4 is ambifues for(10, 10)
		 * ce :canot finrd symbol (f, f)
		 */
		object.m4(10, 10.5f);
		object.m4(10.6f, 10);
		object.m4(10, 10);
		object.m4(10.5f, 10.5f);
		
		/*
		 * CASE 5:
		 * int... lext chance,
		 * in general vararg method get leat priority, that is if there is no other method matched
		 * ten ver arg method will chance itis excetly same as dafult case inside switch
		 */
		object.m5(10);
		object.m5();
		object.m5(10,20);
		
		/*
		 * CASE 6 :
		 * In overloading always get chance of refernce time;
		 * NOTE : in overloading method resolution always takes cares by compiler based on refernce type
		 * inoverloading run time object wont play any role,
		 */
		Animal a = new Animal();
		object.m6(a);  //animal-versin
		Monkey m = new Monkey();
		object.m6(m);
		Animal a1 = new Monkey();
		object.m6(a1);

	}

}
