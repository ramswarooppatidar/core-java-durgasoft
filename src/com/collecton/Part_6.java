package com.collecton;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.Iterator;
import java.util.ListIterator;

public class Part_6 {

	public static void main(String[] args) {
	  ArrayList aList = new ArrayList();
	  for(int i =0;i<10; i++) {
		  aList.add(i);
	  }
	  Iterator itrIterator = aList.iterator();
	  System.err.println(itrIterator.getClass().getName());  //after $ inner class name
	  while(itrIterator.hasNext()) {
		  Integer integer = (Integer) itrIterator.next();
		  if(integer % 2 == 0) {
			 System.out.println(integer);
		  }else {
			  itrIterator.remove();
		  }
	  }
	  ListIterator listIterator = aList.listIterator();
	  System.err.println(listIterator.getClass().getName());
	  while(listIterator.hasNext()) {
		  Integer integer = (Integer) listIterator.next();
		  if(integer == 2) {
			  listIterator.remove();
		  }else if(integer ==3) {
			  listIterator.add(300);
		  }else if(integer == 5) {
			  listIterator.set(-5);
		  }
	  }
	}
}
/*
 LIMITAION OF ENUMERATION :
 1) we can apply enumerion concept only for lagecy classes and it is not a unversal cursor
 2) by using enum we can get only read access and we cant perform remove operation
 3) to overcome above limitations we should go for iterator
 
 ITERATOR :
 1) we can applu iterator concept for any collection object and hence it is universal cursor
 2) by using iterator we can perfom both read and remove operstions
 3) we can create itr object using itertaor method of collection interface
 public Itratot iterator()
 Iterator itr = c.iterator() //c is any collection object
 
 Method :
 	public boolean hasNext();
 	public object next();
 	public void remove()
 	
 LIMITATION ITERATOR :
    1) by using enumeratio and itertor we can always move always forwrd direction we can move toword backword
    direction this single direction cursors but not bidirectional cursor
    2) by using itertaor we can perform only read and remove operations and we cant perform replacment and a
    addition of new object
    3) to overcome above limitaion we should go for list iterator
    
LIST ITERATOR :
1) BY USINFGLIST itrator we can move either forword direction or to the backword direction and has it is bidirectional
cursor
2) by using list itertaor we can perform replacment and addition of new objects in addition to read and remove
operation

pubic ListIterator listIterator()
we can create listIterator by using list itertaor method of list Interface
ListItertaor litr = l.listItertaor() //l is nay list bject

ListIterator is a child interface of itertaor and hence all method present is iterator budefault available in
listItertaor

 define 9 mehods
   	1) public boolean hashNext()
   	2) public object next()
   	3) public int nextIndex()
   	
   	4) public boolean hasPrevioud()
   	5) public object previous()
   	6) public int previousIndex()
   	
   	7) public void remove()
   	8)public void add(Object o)
   	9)public void set(Object o)
   	
  the most powerfull cursor is listIterator but its limiation is it is applicable only for list object
  
 */
