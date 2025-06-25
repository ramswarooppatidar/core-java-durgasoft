package com.collecton;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class Parts_13_sortedMap {

	public static void main(String[] args) {
		
		HashMap m = new HashMap();
		m.put(10, "ramswaroop");
		m.put(13, "krishna");
		m.put(11, "rameshwar");
		m.put(15, "chitraksh"); 
		
		TreeMap map = new TreeMap();
		map.put(100, "ramswaroop");
		map.put(103, "krishna");
		map.put(101, "rameshwar");
		map.put(105, "chitraksh");
		
		TreeMap map2 = new TreeMap(m);
		
	}

}
class MyCompertor implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		return i1.compareTo(i2);
	}
	
}
/*
   SORTEDMAP (I)
   it is child interface of MAP
   2) if we want to group of key value parie according to some sorting orders of key, then we should go 
   for sorted map
   3) sorting is based on key but not based on value
   
   sorted map defined following methods : 
   Object firstKey()
   Object lastKey()
   SortedMap headMap(105)   //100, 102, 103, 104
   SortedMap tailMap(107)  //107 108 109
   SortedMap subMap(103, 107)  //103 104 107
   Comperator comperator()
   
   TREEMAP (class)
   implemented class of sortedMap
   1) underline datastructire is redblack tree
   2) insertion order is not preserved and it is based on hashcode, and some sorting order of key
   3) dublictae key not allowe but value can be dublicated
   
   4) *****if we are depending on default nature sorting order then keys should be homogenious
   and compareable otherwise we will get run time exception saying class cast exception
   
   5) ****if we are define our own sorting by comperator then keys not need be homogenious and comparable
   we can take hetorgenious noncomparable object also
   
   6) whether we are depending on default nature sorting order or customized sorting order there is no
   restrictions for values, we can take hetrogenious non comparable object also
   
   7) NULL EXCEPTENCE
    	1) for non emtye treeMap if we are trying to insert an entry with null key , then we will get
    	run time exception saying NULLPOINTEREXCEPTION
    	
    	2) for empty treemap as a first entry with null key is allowed but after inserting that entry
    	if we trying to insert any other entry, then we will get runtime exception saying null pointer
    	exception
    	
    	NOTE : the above null excptation rule applicable untile 1.6version, after 1.7 null entry is not
    	allowed for key
    	
    	but for values we can use null any number of times there is no restriction, wheter it is 1.6v or 1.7v
   
   CONSTRUCTORS :
   TreeMap m = new TreeMap();
   empty tree map it is ceated and default nature order sorting order
   
   TreeMap m = new TreeMap(Comperator c);
   for customized sorting order
   
   TreeMap m = new TreeMap(Map map);
   
    
   TreeMap m = new TreeMap(SortedMap map)
   
   
 */
