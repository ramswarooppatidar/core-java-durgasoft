package com.collecton;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Parts_16_navigableSet {

	public static void main(String[] args) {
		TreeMap<String, String> tm = new TreeMap<String, String>();
		tm.put("d", "dog");
		tm.put("a", "apple");
		tm.put("b", "bat");
		tm.put("g", "gune");
		tm.put("c", "cat");
		System.out.println(tm);
		System.out.println(tm.ceilingKey("c"));
		System.out.println(tm.higherKey("e"));
		System.out.println(tm.lowerKey("e"));
		
		NavigableMap<String, String> tm2 = tm.descendingMap();
		System.out.println(tm2);
		System.out.println(tm.descendingMap());
		
		
		
		
	}

}
/*
 1.6version enhancment in collection fream work, as a part of 1.6 v the following two concept is introduced
 in collection fream work
 1) navigableset
 2) navigableMap
 
 NAVIGABLE SET(I) :
 	1) it is the child interface of sorted set and it is deineds serveral methods for navigation purposes
 
 METHOD :
	 1) floor(e)
	 it is return highest element which is <=e
	 
	 2) lower(e)
	  it is return highest element which is <e
	  
	 3)celling(e)
	  it is return lowest element which is >= e
	  
	 4) higher(e)
	  it is return lowest element which is > e
	  
	 5) pollFirst(e)
	 remove nad return firstelement
 
	 6) polllast()
	  remove nad return last element
	  
	 7) descendingSet()
	 it return navigableSet in reverse order
	 
 NAVIGABLEMAP :
 
	 1) navigable map is child interface or sortedmap, it defined several methos for navigation purposes
	 
	 2) navigable map defined the following methods
	 
	 1) floorKay(e)
	 it is return highest element which is <=e
	 
	 2) lowerKey(e)
	  it is return highest element which is <e
	  
	 3)cellingKey(e)
	  it is return lowest element which is >= e
	  
	 4) higherKey(e)
	  it is return lowest element which is > e
	  
	 5) pollFirstKey(e)
	 remove nad return firstelement
 
	 6) polllastKey()
	  remove nad return last element
	  
	 7) descendingMap()
	 it return navigableSet in reverse order
 
 COLLECTIONS( class) :
 collection class defined several utility methods for collection object like sorting seraching
 reversing etc
 
 1)sorting elements of list
 colections class defines the following two sort methods
 
 
 
 
*/
