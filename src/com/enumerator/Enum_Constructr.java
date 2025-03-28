package com.enumerator;

import java.time.temporal.WeekFields;
 //static import
import static java.lang.Math.sqrt;
//normal import
import java.lang.*;
import java.security.PublicKey;
enum Week{
	 KF, HJ, GD, G,JDJ;
	//public static final Week GD = new Week();
	 Week(){
		System.out.println("constructor");
	 }
 }
enum Fish{
	gf(30),GHF(45),JFHF(45),GAHHA;
	//public static final Fish gf = new Fish(30);
	//public static final Fish gf = new Fish();
	;
	int price;
	Fish(int value){
		this.price= price;
	}
	Fish(){
		
	}
	public int getPrice() {
		return price;
	}
}
enum Color{
	GREEN, RED, BLUE, ORANGE;
	public void info() {
		System.out.println("universal color");
	}
}
enum Color2{
	GREEN,
	RED
	{
		public void info() {
			System.out.println("DANGEROUSE color");
		}
	},
	YELLOW,ORANEGE;
	public void info() {
		System.out.println("universal color");
	}
}
public class Enum_Constructr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*an enum can contain constructor?
		 * enum constructor will be execute sepratley, for every enum constant at the time of enum class loading
		 * autoatically
		 * 
		 * Week w = new Week();
		 * we cant create enum object directly and hence we cant envoke enum constructor directly
		 * error : enum type may not be instanciated
		 * 
		 * inside enum we can declear method but should be concrrent method om=nly
		 * and we cant declear abstrct methods
		 * 
		 * 
		 * CASE 1:
		 * Every enum const is represnt an object of type enum, hence
		 * whatever method we can apply on java object, ,can be applicable on enum constant also
		 * 
		 * Fish.gf.equals(fish.gh)
		 * Fish.gh.hashCode()
		 * Fish.gf < Fish.hj // between two object not use relational operator, invalid
		 * Fish.gf.ordinal() < Fish.hj.ordinal() 
		 * 
		 * 
		 * CASE 2
		 * if we want to use any class or interface directly from outside package, then the required import 
		 * is normal import,
		 * if we want to use/excess static member without class name, then the require import is static import
		 * ex : import java.lang.Math 
		 * Math.sqrt(25)
		 * static import, (static varible directly import without class anme then use )
		 * import static java.lang.Math.sqrt
		 * 
		 * 
		 * CASE 3:
		 * color2 enum and enumeration
		 * 
		 * 
		 * Case 4;
		 * enum, Enum, Enumerator
		 * enum  key word : enum is keyword in java which can be use to define a group of named constant
		 * 
		 * Enum class : Enum is a class in java present in java.lang package, every eum in java
		 * should be directly child class of Enum class, hence this class as base class for all java enums
		 * 
		 * Enumertor is Interfece : enumertion is an interface preent in java.util packge, it is collection
		 * reltion concept we can use enumertaion object to get object one by one forn the colection
		 * 
		 * 
		 */
		System.out.println("hello, static import "+ sqrt(25));
		System.out.println("normal import "+ Math.sqrt(25));
		Week w = Week.GD; //line 1
		
//		Week f1 = new Week()
//		we cant create enum object directly and hence we cant envoke enum constructor directly
		
		Fish f[] = Fish.values();
		//public static final Fish gf = new Fish(30);
		//public static final Fish gf = new Fish();
		for(Fish fish : f) {
			System.out.println(fish+" ........"+fish.price);
			System.out.println(fish+" ........"+fish.getPrice());
		}
		
		Color c[] = Color.values();
		for(Color c1 : c) {
			c1.info();
		}
		Color2 c2[] = Color2.values();
		for(Color2 c1 : c2) {
			c1.info();
		}
		
		
		

	}

}
