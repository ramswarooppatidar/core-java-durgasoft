package com.declarationAccessModifier;

class child extends Part_9_StaticModifier{
//	 CASE 2
}
public class Part_9_StaticModifier {
	static int x =10;    //1
	int y =20;			//2
	public void m1() {  	//3
		System.out.println(x);
		System.out.println(y);
	}
	public static void m2() {     //4
		System.out.println(x);
//		System.out.println(y);  //error
	}
	public static void main(int arr[]) {
		
	}
	public static int getAvg(int x, int y) {
		return x+y/2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {};
		main(arr);
		Part_9_StaticModifier t1 = new Part_9_StaticModifier();
		t1.x =200;
		t1.y =500;
		Part_9_StaticModifier t2 = new Part_9_StaticModifier();
		System.out.println("x "+t2.x +" , y : "+t2.y);
	/*
	 * sttaic is modifier applicable for method , varibles but tnot for classes
	 * we cant declare top level class with static modifier but we can declear inner class as static
	 * (such type of inner classes are static nested classes)
	 * 
	 * in the case of instance varible for every object a seprate copy willbe cretaed but in case of
	 * sttaic varoble a single copy will be created at clas slvevel and shread by every object of that class
	 * 
	 * 
	 * we cant access instance member directly from static area but we can access from instance area directly
	 * we can accesss static memebers from both instance and static area directly
	 * 
	 * within the same class which of the above declartion we can take simultationly
	 * 1 & 3
	 * 1 & 4   //wrong  non static varible can not acces static area
	 * 
	 
	 * 2 & 3
	 * 2 & 4
	 * 
	 * case 1 : 
	 * Overloading concept applicble for static methods including main method, but jvm can always 
	 * call string []arg  method only
	 * other overloaded we have to call just normal method class
	 * 
	 * CASE 2:
	 * INHERITANCE  concept for static method including main method hence while executing child class, if
	 * child dsnt conatin main method the parent class main method will be executed
	 * 
	 * CASE 3:
	 * if main class also in chld then :
	 * this is method hiding but not overriding, execute child main
	 * it seems overiding concept is ablicable for static method but it is not overriding, and it is method hiding
	 * NOTE for static methods overloading and inheritance concept are applicable but overriding concept 
	 * are not applicble but instance of veridng method hiding concept is aplicable
	 * 
	 * case 4 :
	 * in side method implemetion if we are using at least one instance varible , then that method talk 
	 * about a particular object hence we shoul declare method as instance method,
	 * inside method implemention if are not using , any instance varible then this method no where related to 
	 * particular object hence we have to decalre such type method as staic method  irrespected of whether using
	 * STATIC VARIABLE or NOT
	 * 
	 * for sttaic method implemtion should be availbe where as for abstract method implemention not availbe, hence
	 * abstarct static combination is illegal for methods
	 */
		
	/*
	 * SYNCHRONIZED
	 * is the modifier applicable for method and vblocks, but not for varible and classes,
	 * if the multiple thread operating simulataniuly on the same java object then there may be a chance of data
	 * incinsistance problem this is called race condtion,
	 * we can overcome this problem by using synchronized key word,
	 * 
	 * if a methd or block declered ad synchronized then at the time , one thread allow to execute that method or block 
	 * on given object so that dtaa inconsistance problem wll be resolved, the main disadvantge of synchroni key
	 * word is it increasing wating time o thred and creating peformr problem if there is o speific rewuired
	 * then it is not recommendrd to use syn key word
	 * 
	 * syn ethod shold compulsray conatin implementaion where abstarct method dosnt implemention, hence abstarct
	 * sysnchronized id illegal combition of modifier for methods
	 */

	}
	
	

}
