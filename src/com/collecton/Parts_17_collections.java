package com.collecton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Parts_17_collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<>();
		l.add("g");
		l.add("w");
		l.add("q");
		l.add("a");
		System.out.println(l);
	     Collections.sort(l, new MyComp());
		
		  // Custom sort using Lambda
        Collections.sort(l, (s1, s2) -> -s1.compareTo(s2));

	}

}
class MyComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = o1.toString();
		String s2 = o2.toString();
		return -s1.compareTo(s2);
	}
	
}
/*
 COLLECTION : SORTING ELEMENT OF LIST 
 colections class defines the following two sort methods
 
 public static void sort(list l)
   
   1) to sort based on default nature sorting order , 
   in this case list should compulsary conatin homogenious and comparable object otherwise 
   we will get class cast exception
   
   2) list should not conatin null, otherwise we will get nul pointer exception
   
 public static void sort(list l, Comperator c)
   1) to sort based on customized sorting order
   
   2) list should not conatin null, otherwise we will get nul pointer exception
   
 Collection class defined following binary search methods
  1) public static int binarySearch(List l, object target)
  	if list is the sorted according to default nature sorting order then we have to use this method
  
  2) public static int binarySearch(List l, object tearget, Comperator c)
 	we have to use if list is sorting according to customized sorting order
 	
 3) public static void reverse(List l)
   reverse method to reverse order of elemnts of list 
 
 4) Comperator c1 = collections.reverseOrder(Comperator c);
   reverseOrder method to get reversed compertor
 
 CANCLUSION :
	 1) above serch method used interanlly will use binary serch algorithum
	 2) successful serch returns index
	 3) unsucessful serch returns insertion point
	 4) insertion point is the location where we can place the target element in the sortd list
     5) before caling binary serch compulsary listed should be sorted , otherwise we will get unpredectable result
 */
  
