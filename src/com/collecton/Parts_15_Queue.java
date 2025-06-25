package com.collecton;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Parts_15_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pQueue = new PriorityQueue(15, new MyComparet());
		pQueue.offer("z");
		pQueue.offer("l");
		pQueue.offer("b");
		pQueue.offer("a");
	
		
		System.out.println(pQueue);
	}
	
}
class MyComparet implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
	}
	
}
/*
 QUEUE INTERFACE :
 
	  1.5version enhancement (queue interface)
	  1) it is child interface of collection
	  
	  2) if we want to represent a group of indivisual object prior to pressing then we should go for queue
	   ex before sending msg all mobile number stored in some data sturtre , in which order we added mobile number
	   in same order only msg should be send for this FIFO requiremnt queue is the best coice
	  
	  3) usually queue follows FIFO order but based on our requirment we can implement our own priority order also
	  	(proprity queue),
	  	from 1.5version onwords linkedlist class implements Queue(I)
	  	LinkedList based implements of queue always followe FIFO order
	  	
  QUEUE INTERFACE SPECIFIC METHOD :
  
	  1) Boolean offer(Object o)
	  to add an object into the queue
	  
	  2) Object poll()
	  	return head and remove , if queue is empty return null
	  
	  3) Object remove()
	  	return head and remove, if queue is empty , null pointer exception
	  	
	  4) Object peak()
	  	return head, if queue is empty , return nuill
	  	
	  5) Object element()
	  	return head, if queue is empty , run time exception
  	
  PRIORITY QUEUE :
	  1) IF we want to represent a group of individual object prior to processing according to some prority
	  	then we should go for priority quque
	  	
	  2) the priority either defukt order sorting or customize sorting order defined by comperator
	  
	  3) insertion order is not preserved and it is based on some priority
	  
	  4) dublicate objects are not allowed
	  
	  5) if we depending on default nature sorting order compalsury object should be homogenious and 
	  	comparable otherwise we will get run time excption saying class cast exception,
	  	if we are defined our own sorting by comparote then object need not be homogenious and comperable
	  	
	  6) nul is not allowed even as the first element also
  
  CONSTRUCTOR :
  
	  1) PriorityQueue pq = new PriorityQueue();
	  create empty pq with default initial capacity 11,all object inserted according
	  to defaukt nature sorting order
	  
	  2)  PriorityQueue pq = new PriorityQueue(int initialCapcity);
	  create empty pq with default initial capacity "initialCapcity" ,all object inserted according
	  to defaukt nature sorting order
	  
	  3)  PriorityQueue pq = new PriorityQueue(int initialCapcity, Comparator myComparator);
	  
	  4)  PriorityQueue pq = new PriorityQueue(SortedSet s);  //treeset
	  
	  5)  PriorityQueue pq = new PriorityQueue(Collection c);
  
  NOTE : some platform wont provide support for threads prioritys and priority queues
  
  
 */
