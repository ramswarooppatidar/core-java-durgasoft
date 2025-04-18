package com.collecton;

public class Part_2 {

}
/*
 9 key Interface of collection framework
 1) Collection 
 2) List
 3) set
 4) ShortedSet
 5) NavigaleSet
 6) Map
 7) ShortedMap
 8) NavigableMap
 9) Queue
 
 COLLECTION (I):
 1) if we want to reprset a group of indivisual object as a single entity the we should go for collection,
 2) collection interface defined the most common methods which are aplicable for any collection object
 3) in general collection inteface is consider is root interface of collection framework
 4) there is no concrete class which implements collection interface directly
 
 
 DIFFERNCE BETWEEN COLLECTION(I) AND COLLECTIONS(Class)
 
 COLLECTION(I) :
 collection is an interface if we want to reprsent a group of indivisual object as single entity then,
 we should go for collection
 
 COLLECTIONS(Class) :
 collections is an utitlity class present in java.util package to defined sevrl utitliy methods for 
 collection objects(like sorting, searching etc...)...
 
 LIST( I )
 it is the child interface of colection
 2)*** if we want to represnt a group of indivisual object has a single entity where
  dublicats are allowed and interation order must be preserved then we should go for list
 
 Collection(1.2v)------>List(1.2)---(ArrayList(1.2v), linkedlist(1.2 v), vector---->stack(v1.0 lagesy class))
 Note : in 1.2v vector and stack classes re engineered to implemet list interface
 
 SET (I)
 1) it is child interface of collection
 2)*** if we want to represent a group of indivisual objects as a single entity where dublicats are not
 allowed and interation order not required, then we should go for set
 
 collectio----->set(1.2v)------->HashSet(1.2v)------>linkedHashSet(1.4v)
 
 SHORTEDSET(I)
 1) it is child interface of set
 2) if we want to rersent a group of indivisual object as a single entity where dublicts are not allowed
 and all object should be inserted according to some shorting order , then we should go for shorted set
 
 
 NAVIGABLESET(I)
 1) it is child inerface of shorted set
 2) it conatins several method for navigation purposes
 
 Collection---->SET(I, 1.2v)---->SHORTEDSET(I, 12v)----->NAVIGABLESET(I, 1.6v)-----TreeSet(Class, 1.2v)
 
 DIFFERENCE BETWEEEN LIST AND SET
 1)dublicate allowed in list || set not allowed
 2) intertion order preserved || interation order not preserved
 
 6 QUEUE(I)
 IT IS Child interface of collection
 2) if we want to represent a group of indisyabl object prior to processing thn we should go for queue
 3) usually queue follow first in forst order but based on our requiremnt we can imlement our own priority
 order also
 collection--->queue(i, 1.5v)---->(priorityQueue(I), BlockingQueue(I))
 
 Note : all the above interfaces, collection, list,set, shortedset, navigableset, queue ment for
 reprsenting a group of indivisual object,
 if we want to represent a group of object as key value \paries
 then we should go for map
 
 7 MAP(I) :
 1) MAP is NOT child inerface of collection
 2) if we want to represent a group of object as key value paires then we should go for map
 3) both key and value are object only dublicate key are not allowed but values can be dublicated
 
 Map(i)--->(HashMap(c)----LinkedHashMap(c,1.4),weakHashMap, IdentityHashMap1.4)
       (1.0v)dictonary(absClas)--->Hashtable(class)---propeties(c)
       
8 SHORTEDMAP(i)
it is childinterface of map
2) if we want to represent a group of key value parie, according to some shorting order of keys, then
 we should go for shorted map
3) in shorted map the shorting should be based o key butnot based on value


9) NAVIGABLEMAP(I) 1.6v
It is child interface of shorted map
2) it defines serveral methods for nevigation purposes
3) one implemented classes TreeMap(class)
 
 */
