package generics;

import java.security.PublicKey;
import java.util.ArrayList;

public class Part4 {
	//generic wildcart " ? "
	public static void m1(ArrayList<Integer> l) {
		
	}
	public static void m2(ArrayList<?> l) {
//		l.add("");  error
		l.add(null);
		
		//read only operation, this type of methods
		}
		public static void m3(ArrayList<? extends x> l) {
				// x either class or interface
			}
		public static void m4(ArrayList<? super x> l) {
			// x either class or interface
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();
		ArrayList<Double> l3 = new ArrayList<>();
		m1(l2);
//		m1(l1);
//		m1(l3);
		
		m2(l1);m2(l3);m2(l2);
		
		ArrayList<? extends Number> l4 = new ArrayList<Integer>();
		ArrayList<? super String> l5 = new ArrayList<Object>();
//		ArrayList<?> l6 = new ArrayList<?>();  //?  we are used only declartion part
//		ArrayList<?> l7 = new ArrayList<? extends Number>();  // ?  we are used only declartion part
		
		/*
		 * m1 of arrayList<String> l ,  we can call this method only string type
		 * we can call this method m1 by passing arlist of only interg type
		 * 
		 * within the methos we can add only string type of object to the list, by mistak
		 * if we are trying to add any other type then we will get, compile time error,
		 * 
		 * m2 of arrayList<?> l , we can call this method with any type;
		 * within the method we can't add anything to the list expect null,bcz we dont know the type 
		 * exectly,
		 * null is valid bcz it is valid value for any type;
		 * this type of method best suitable for read only opertaion,
		 * 
		 *  
		 *   m3(ArrayList<? extends x> l)  x is class or interface,
		 *   if class is class then we can call, arraylist of x type or child class,
		 *   if x is interface then we can call this method, by passing arraylist of eithrt x type or its
		 *   implementsation clases;
		 *   but within the method we can't add anyting to the list, except null, bcz we don't
		 *   know type of x exectly,
		 *   tis type of methos also bext suitable for read only operation;
		 *   
		 *   
		 *    m4(ArrayList<? super x> l)
		 *    if x is the class then, we call this method by passing arraylist either x type or its super classes
		 *    if x is an interface then we can cal this method by passing arraylist of eithr x type or super class
		 *    of implemetaion class of x
		 *    within the method we can add x type of object and null to the list,
		 *    
		 *    ArrayList<?> l7 = new ArrayList<? extends Number>()
		 *    ArrayList<?> l6 = new ArrayList<?>()
		 *    including compile time error
		 *   
		 */

	}

}
