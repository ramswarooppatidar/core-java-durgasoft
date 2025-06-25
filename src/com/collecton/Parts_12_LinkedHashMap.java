package com.collecton;

import java.security.Identity;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
class Temp{
	public String toString() {
		return "temp";
	}
	public void finalize() {
		System.out.println("finalize method called");
	}
}

public class Parts_12_LinkedHashMap {

	public static void main(String[] args) throws InterruptedException {
		Integer i1 = new Integer(10);
	 	Integer i2 = new Integer(10);
	 	HashMap map = new HashMap();
	 	map.put(i2, "ram");
	 	map.put(i1, "ramswaroop");
	 	System.out.println(map);
	 	
	 	//hashmap used .equal method to check is key euals or not , 
	 	
		IdentityHashMap map1 = new IdentityHashMap();
		map1.put(i2, "ram");
	 	map1.put(i1, "ramswaroop");
	 	System.out.println(map1);
	 	
	 	//weakhashmap concept*****
	 	Temp temp = new Temp();
	 	HashMap map2 = new HashMap();
	 	map2.put(temp, "anuradha");
	 	temp = null;
	 	System.gc();
	 	Thread.sleep(1000);
	 	System.out.println(map2);
	 	
	 	Temp temp1 = new Temp();
	 	WeakHashMap map3 = new WeakHashMap();
	 	map3.put(temp1, "anuradha");
	 	temp1 = null;
	 	System.gc();
	 	Thread.sleep(3000);
	 	System.out.println(map3);
	 	

	}

}
/*
 	1) it is child class  of hashmap
 	2)  it is same as HashMap except following difference
 	HashMap   ||  LinkedHashMap
 	1) underline data structire is hashtable  || underline data linkedlist + hashtable(hybride data structure)
 	2) insertion order is not preserved and it is based on hashcode of keys  || insertion order is preserved
 	3) intoduced in 1.2 version || introduce in 1.4version
 	
 	example :  in the program of parts 11 is replace by linkedhashmap then order is preserved
 	
 	NOTE : linked hashset and linkedhashmap are commonly used for developing chahce based application
 	
 	
 	Integer i1 = new Integer(10);
 	Integer i2 = new Integer(10);
 	1i == i2   false;
 	i1.equals(i2)   true
 	
 	difference between == and .equal operator
 	in general == ment for refernce comparesion (address comperision)  where as .equals method ment for
 	content comperession
 	
 	IDENTITY_HASH_MAP( class)
 	
 	it is exectly same as hashMap including methods and constructer excpet the following differnce, 
 	int the case of normal hashMap jvm used .equal method to identify dublicte key, which is ment for
 	content compersion, 
 	but in the case of identityhashmap  jvm will used == operator to identitfy to dublicte key,
 	which is ment for refernce comperssion(Address comperrion)
 	
 	i1 and i2 are dublicate key  i1.equals(i2) return true
 	if we replcae hashMap with identityHashMap then i1 and i2 are not dublicts keys,
 	bcz i1 === i2  false*******
 	in this case {10="ram", 10="ramswaroop"}
 	
 	WEAK_HASH_MAP(CLASS): 
 	
 	1) it is exectly same as hashMap excpet the following difference
 	in the case of hashMap evenThough object doesnt have any refernce it is not eligibal for GC, if
 	it is associated with hashMap that is hashMap dominates garbage colector.
 	but in the case of weakHashMap if object doesnt contain any refernces it is eligibal for GC
 	even though object associated with WeakhashMap, that is garbage collector dominats wekhASHMAP
 	
 	in the above example temp object not availble for gc bcz it is associated with hashMap,
 	output is
 	 
 	*****{temp="durga"}  and {temp="durga}   *****
 	
 	if we replace hashMap with weakHashMap then , temp is eligibal for gc in this case output is
 	*****{temp="durha}  , finalized method call , {}   *****
 	
 	
 */
