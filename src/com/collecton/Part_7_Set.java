package com.collecton;

import java.util.HashSet;
import java.util.Set;
//import java.util.TreeSet;

public class Part_7_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		set.add("ram");
		set.add(10);
		set.add("shyam");
		set.add("ajay");
		set.add("patidar");
		set.add(30);
		set.add("a");   //false
		System.out.println(set);
//		ShortedSet<Integer> h = new TreeSet<Integer>();
	}
}
/*
 SET :
 1) set is child iterface of collection 
 2) if we want to represnt a group of indivisual object as single entity where dublicts are
 not allowed and intertion order not preserved
 3) set interface doesnt conatine any new method and we have to only collection interface method
 
 HASHSET :
 1) underline data structire for hashset is hashtable
 2) dublicate object are not allowed
 3) itertion order is not preserved and it is based on hashcode of objects
 4) null itertion s possible (only once)
 5) hetrogenious object are allowed
 6) implememnts serlizable and clonable but not rendom aceess
 7) hashset is based choice if our frequent operation is search operation
 
 NOTE : in hashset dublicts are not allowed if we trying to isert dublicts then we wont get any 
 compile time or run time err and add return simply return false;
 
 CONSTRUCTOR :
 HashSet set = new HashSet()
 create empty hashset object with default initial capacity 16 and default fill ration 0.75
 
 HashSet set = new HashSet(int initialcapacity)
 create an empty hashset object with spefied intial capacity and default fill ration 0.75
  
 HashSet set = new HashSet(int initialcapacity, float fillRation)
 create an empty hashset object with spefied intial capacity and our fill ration (any)
    
 HashSet set = new HashSet(Colection c)
 create an equivamet hashSet for given collection 
 this constructeor ment for inter convertion between collection object
 
 
 FILL RATION | LOAD FACTOR
 after filling how much ration a new hashset object will be created, this ration is called fill ration
 or load factor
 
 LINKED-HASH-SET
 it is child class of hashset, it is exectly same as hashSet including constructors and method,
 except the following differenced hashset and linkedhashset
 1) underline data structir is hashtable  || underline data linkedlist + hashtable
 2) insertion order not preserved || order is preserved 
 3) 1.2 v  || 1.4 v
 
 in general we can use linkedhash set to develop chahe based application where dublictas are not allowed and
 intertion order preserved
 
 SHORTEDSET :
 1) child interface of Set(I)
 2) if we want to represent a group of individual objects according to sum sorting order without dublicats
 then we should go for shorted set
 3) sorted set interface defined the following spefific method
 	1) Object first()
 	2) Object last()
 	3) ShortedSet HeadSet(106)  [100,103,104]
 	4) ShortedSet tailSet(106)  [106,107,110]
 	5) ShortedSet subSet(100, 110)  [100,103,104,106,107]
 	6)Comparetor comparetor()
 
 */
