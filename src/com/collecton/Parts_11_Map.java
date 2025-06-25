package com.collecton;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Parts_11_Map {

	public static void main(String[] args) {
	  Map<Integer, String> map = new HashMap<Integer, String>();
	 Object object = map.put(101, "ram"); //return null
	 System.out.println(object );
	  map.put(102, "pawan");
	  Object object1 = map.put(101, "Ramswaroop"); //return old value
	  System.out.println(object1);
	  
	 Collection collection= map.values();
	 System.out.println("collection :"+collection);
	 
	 Set set = map.keySet();
	 System.out.println(set);
	 
	 Set s1 = map.entrySet();
	 System.out.println(s1);
	 Iterator itrIterator = s1.iterator();
	 while(itrIterator.hasNext()) {
		 Map.Entry entry = ( Map.Entry) itrIterator.next();
		 System.out.println(entry.getKey());
		 System.out.println(entry.getValue());
	 }
	}
}
/*
 map is not child interface of collection
 1) if we want to represent a group of object as key value paires then we should go for map
 2) both key and values are object only
 3) dublicate key are not allowed but values can be dublicated
 4) ecah key value pair is called entry, hence map is consider as a collection of enty objects
 
 MAP INTERFACE METHOD :
 1) Object put(object key, object value)
  to add one key value parie to map , if the key is already present then old value will be placed with
  new value, and return OLD VALUE
  
  2) void putAll(Map map);
  3) Object get(oBJECT key)
  4) Boolean containsKey(Object key);
  
  5) Set keySet();
  6)  Collection values();
  7) Set entrySet();
  entry : 
  a map is group of key value paire and each key value parie are entry map is consider as collection of
  entry objects,
  withou existing map object there is no chance of existing entry object, 
  hence entry interface define inside map interface
  interface Map{
  	interface entry{
  	  object getKey();
  	  object getValue();
  	  object setValue(object new)  //return old value
  	  }
  	 }
  	 
 HASHMAP (c)
 1) undrline data structre is hashtable
 2) insertion order is not preserved and it based n hashcode og kay
 3) dublicats keys are ot allowed but value can be dubllicated
 4) hetrogenious oject are allowed for both key and value
 5) null is allowed for key (only once)
 6) null is allowed for valued(many times)
 7) imlements serilizable and clonable interface but nt rendom access
 8) is beast chice for serch operation
 
 CONSTRUCTOR :
 HashMap m = new HashMap();
 create empty hashMap nitial capacity 1 and default fill ration .75
 
 HashMap m = new HashMap(int initialCapcity);
 
 HashMap m = new HashMap(int initialCapcity, float fillRation);
  
 HashMap m = new HashMap(Map m);
 
 
 HASHMAP    || HASHTABLE
 1) every methos present in hashMap is not synchronized  || every method present in hasTable is synchronized
 
 2) at a time multiple thread allowe to operate and hance is is not thread safe || at a timeonly thread is allowed to
 opert on hash atble and hash it is thread safe
 
 3) relatively performace is hight bcz thread are not required to wait to perte on hashmap object  || rlatively 
 performance is low bcz threads are required to operte on hashtable object
 
 4) null is allowed for both key and  value    || null is not allowed for key and value  other wise we will get npe
 
 5) itroduce in 1.2 v and it is not legacy ||intriduce in 1.0 v and it is lagecy
 
 how to get synchronized version hasMap object
 HashMap m = new HashMap()
 HashMap m1 = collection.synchronizedMap(m);
 
 */
