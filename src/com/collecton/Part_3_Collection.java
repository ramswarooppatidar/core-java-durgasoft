package com.collecton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Part_3_Collection {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> list1 = new ArrayList<>();
	        list1.add("Apple");
	        list1.add("Banana");
	        list1.add("Cherry");
	        list1.add("Date");
	        list1.add("Banana"); // duplicate for fun
	        
	        list1.remove("Banana");
	        System.out.println("After remove('Banana'): " + list1);
	        // Output: [Apple, Cherry, Date, Banana]
	        
	        
	        /*
	         removeAll(Collection<?> c)
             Removes all elements from the list that exist in another collection.
	         */
	        List<String> toRemove = Arrays.asList("Apple", "Date");
	        list1.removeAll(toRemove);
	        System.out.println("After removeAll([Apple, Date]): " + list1);
	        // Output: [Cherry, Banana]

	        /*
	         retainAll(Collection<?> c)
             Keeps only the elements that exist in another collection. Removes everything else.
	         */
	        List<String> toRetain = Arrays.asList("Cherry");
	        list1.retainAll(toRetain);
	        System.out.println("After retainAll([Cherry]): " + list1);
	        // Output: [Cherry]
	        
	        list1.containsAll(toRetain);
	        list1.contains(toRetain);
	        
	        list1.clear();
	        System.out.println("After clear(): " + list1);
	        // Output: []
	}

}
/*
 if we want to respresnt a group of indivisual object as a single entity, then we should go for collection
 colection interface defines the most common methods which are applicable for any collection object
 
 */
