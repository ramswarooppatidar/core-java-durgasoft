package com.collecton;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class Part_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vector = new Vector();
		//vector speific method
		vector.add(2);
		vector.addElement(5);
		vector.addElement(8);
		vector.addElement(12);
		vector.addElement(11);
		vector.addElement(2);
		vector.removeElement(2);
		System.out.println(vector);
//		vector.removeAllElements();
		vector.elementAt(0);
		vector.size();
		vector.capacity();
		
//		enumeration
		Enumeration enumeration = vector.elements();
		while(enumeration.hasMoreElements()) {
			Integer aInteger = (Integer) enumeration.nextElement();
			if(aInteger%2 == 0)
				System.out.println(aInteger);
		}
		
		Vector<Integer> stack = new Stack<Integer>();
		stack.elements();
	}

}
/*
 ARRAYLIST            ||     LINKEDLIST
 is best choice if frequent operation is retrive ||  itis best choice if frequent operation is insertion and deletion
 2) bcz it is implement reandomAccess   || n
 3) worst choice in delete and insertion due to shifting element || worst choice in retrive 
 4)in arrylist the element will be stored in consucatiove memory location and hence retrive operation will bcm easy
   || in linked list the element wont be stored in consucative memory location hence , retrive operation is complex
   
 VECTORE :
 1) underline data growable array and resizable aary
 2) intertion order is preserved
 3) dublicates are allowd
 4) hetorgenious object are allowed
 5) null intersion is possible
 6) it implements serelizable clonable and rendom aceess interface
 7) every method present in vector is synchonized and hence vector object is thread safe
 
 CONSTRUCTOR :
 Vector v = new Vector()  with default intital capacity 10
 once reaches its max capacity then a new vector object will be created with new (capacity = current*2)
 
  Vector v = new Vector(1000) 
  
  Vector v = new Vector(int initialCapacity, int incrementCapcity);
  Vector v = new Vector(1000, 5)
  
  Vector v = new Vector(Collection)
  create an equivelaent vector object for given collection this constructor meant for iterconvertion between 
  collection objects
  
  
  STACK (class)
  1) it is child class of vector
  2)it is specially dedign class last in first in order
  3) Stack stack = new Stack();
  4) Methods :
      s.push()  //a, b ,c
      s.pop()
      s.peek()
      s.empty()   //isEmpty colection method
      int offset = s.search(a)    //offset 3
      int offset = s.search(z)    //offset -1
      
      
  THREE CURSOR OF JAVA :
  if we want to get object one by one from the colection then we should so for cursor, there are 3 type ofcusor
  available in java
  enumeration
  iterator
  listIterator
  
  ENUMERATION :
  we can use enu to get objects one by one from lagecy collection object 
  we can create enum object by using elemnts method vector class
  
 
 */

