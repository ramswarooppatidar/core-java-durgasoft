package generics;

public class Part3<T extends Number> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Bounded types
		//we can bound the peramter for a particular range by using extends keyword,
		//such type are called bounded types
		/*
		 * systex for bounded type
		 *  
		 * calls<T extend x>{}
		 *  x can be either class and interface if x is class then as is peramter
		 * we can pass, either x type or its child classes
		 * if x is in interface , we can pass either x type or its implemetatio classes
		 * 
		 * Test<T extends Runable>{
		 * }
		 * Test<Thread> t = new Test<Thread>();
		 * 
		 * 
		 * 
		 * IN COMBNATION
		 * we can defined bounded type and in combinaton also
		 * 
		 * class<T extends Number && Runable>{
		 *  }
		 *  
//		 *  class<T extends Number && Runable & Comprable>{}   correct
		 *  class<T extends  Runable && Number>{}   Incorrect, class folowed interface
		 *  class<T extends  Number && Thread>{}  incorrect not extends 2 class
		 *  
		 *  we can defined bounded type only by using, extends key word, and we cant use
		 *  implements and super key words, but we can replcae implements key word purpose with extends key word
		 *  
		 *  as a type peramer t we can take any valid java identifer, but it is convesion to use, t
		 *  
		 *  based on our requirment we can decler any number of type peramter, and alll this peramter should be seprated 
		 *  with comma , 
		 *  class test<X,Y,Z>{},  class HashMap<k, v>{}
		 */

	}

}
