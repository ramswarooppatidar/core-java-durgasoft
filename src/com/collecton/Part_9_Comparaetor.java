package com.collecton;

import java.util.Comparator;
import java.util.TreeSet;

public class Part_9_Comparaetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new myComparetor());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(13);
		t.add(7);
		t.add(20);
		System.out.println(t);

	}

}
class myComparetor implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
	// CUSTOMIZED SORTING
//		Integer i1 = (Integer) o1;
//		Integer i2 = (Integer) o2;
//		if(i1 < i2) {
//			return +1;
//		}else if(i1 > i2) {
//			return -1;
//		}else
//		 return 0;
		
		
		//various implements of compare method 
		
//		return o1.compareTo(o2);   //default sorting ascendingc
		return -o1.compareTo(o2);   //custumized sorting descending
		
//		return 1;  //itertion order
//		return -1;   // reverse of insertion order
//		return 0   //only first element will be inserted and all remaing all dublicts
	}
	
}
/*
 1) comparator present in java,util package and it is defined to method compare and equal
 2) public int compare(Object obj1, Object obj2);
 	  -ve obj1 has to come before obj2
 	  +ve obj1 has to come after obj2
 	 boolean equal(Object o);
3) whenever we are implementing compartor implemenation compulsary we should provide implemention for
compare method and not equal method bcz it is come from object class to the inheritance

Question : write a program to insert interger objet to treeset where sorting order is descending order

at line 1 if we are bot passing coparetor object then interally jvm will call copare to method which is ment for
default nature sorting order
int his case the outputis 
 
 */

