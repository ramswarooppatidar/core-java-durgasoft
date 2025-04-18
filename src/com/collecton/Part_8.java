package com.collecton;

import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.SortedSet;
import java.util.TreeSet;

public class Part_8 {

	public static void main(String[] args) {
		
		TreeSet treeSet = new TreeSet<>();
		treeSet.add('A');
		treeSet.add('a');
		treeSet.add('l');
		treeSet.add('b');
		treeSet.add('z');

//		treeSet.add(null);    //npe
		System.out.println(treeSet);
		
		TreeSet treeSet2 = new TreeSet();
		
//		treeSet2.add(null);   //till 1.6v
//		treeSet.add(new StringBuffer("A"));
//		treeSet.add(new StringBuffer("S"));
//		treeSet.add(new StringBuffer("a"));
//		treeSet.add(new StringBuffer("z"));
//		System.out.println(treeSet2);
		
		System.out.println("A".compareTo("B"));
		System.out.println("z".compareTo("k"));
		System.out.println("Z".compareTo("Z"));

	}

}
/*
 TREE-SET(c)
 1) undeline data structure is balanced treee
 2)dublicate object are not allowed , insertion order not preserved
 3) hetrogenious object are not allowed, otherwise we will get run time exception saying CLASS_CAST_EXCEPTION
 4) null interstion possible , only once
 5) implement serilizable and clonable
 6) all object will be inserted based on some sorting order it may be default nature sorting or customized 
 sorting order
 
 CONSTRUCTOR :
 TreeSet tree = new TreeSet<>();  
 empty tree set object element will inserted according dafult nature sorting
 
 TreeSet tree = new TreeSet<>(Comparator c); 
 create empty treeSet object where element inserted according to customized by comperator object
 
 TreeSet tree = new TreeSet<>(Collecton c);
 
 TreeSet tree = new TreeSet<>(ShortedSet s); 
 
  NULL :
  1) for non empty treeSet if we trying to insert null then we will get null pointer exception
  2) for empty treeSet as a first elemnt null is allowed but after inserting that null if trying to
   insert any other then we will get get run time exception saying : null pointer exception
   
 NOTE : ****(until 1.6 version null is allowed as first element to empty tree set
 	from 1.7v onword null is not allowed even as the first element , ie)
 	
 **IMPORTENT EX-2
 
 	if we are depending on default natural sorting order compulasary the object should be homogenious 
 	and comparable otherwise we will get runtime exception saying class cast exception
 	
 	a objet is said to be comparable if and only if corrosponding class implements COMPARABLE INTERFACE
 	String class and wrapper classes already implement comparable interface, but Stringbuffer class doesnt
 	implement comparable interface,
 	hence we got class_cast_exception in above example
 	
 COPARABLE(I) :
 1) it is present in java.lang pacage and it conatins only one method, compareTo
 2) public int copareTo(Object o)
     obj1.compareTo(obj2)
     |-->  -ve   obj1 before obj2
     |-->  +ve   obj1 after obj2
     |-->  0   obj1 equal obj2
 
 IF we are depending on default natural sorting order then while adding object into tree set jvm will call
 compareTo method 
 obj1 --> is inserted element 
 obj2-->is already inserted element root
 t.add(k)
 t.add(z)   z.compareTo("k)
 t.add(a)  a.compareTo("k")
 
 NOTE : if dafult natural order sorting is not availbe or if we are not setiesfied with default sorting order
 then we are go for customized sorting by using comparetor
 
 compareable ment for default natural sorting order 
 Comperator ment for customized sorting order
 */
