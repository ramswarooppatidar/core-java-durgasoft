package com.multithreading;

public class InterThreadComm_part_10 {

	public static void main(String[] args) {
		/*
		 * INTER THREAD COMMUNICATION :
		  
		  two threads can communication with each other by using wait() notify() and notifyall(), 
		  
		 1) the thread( person check postBox t1) 
		  which is expecting updation is responsible to call wait() method, then
		  immedeatily the thred will entered into waiting state
		  
		  (Postman t2)
		 2) the thread which is responsible to perform updation ,
		  after performing updation
		  it is responsible to call notify() method, then wating thrad will get that notification
		  and continue its execution with those updated items
		  
		  wait(). notify()....notifyall()*******
		  present in object class but not in thread class because thread can call this methods
		  an any java object
		  
		 3) to call wait , notify , notifyAll, methods an any object ,that is thread should be owner of
		  that object, that is the tread should has lock of that object, that is the thread should be
		  inside the synchronized area
		  hence we can call wait(), notify(), notifyAll() methods only from synchronized area, otherwise we 
		  will get run time exception saying illegalMonitorsStatesException
		  
		  
		  4)  if a thread calls wait() method on any object it immediatly relases the lock of the particular object
		  and entered into waiting state
		  
		  If thread calls notify() method an any object, it releases the lock of the that object but may
		  not immediately,
		  *** except wait(), notify(), and notifyAll(), there is no other method where thread releases the lock
		  
		  METHOD :
		  	public final void wait(){}   //throws intrupted exception
		  	public final nativ vid wait(long ms){}   //native not writte in java //throws intrupted exception
		  	public final  vid wait(long ms, int ns){} //throws intrupted exception
		  	
		  	publin final native notify()
		  	public final native notifyAll();
		  	
		  NOTE : evry wait method throws intruptted exception which is checked exceptions hence,
		  whenever we are using wait method complusray we should handle this intrupted exception
		  either by try catch or throws key word
		  otherwise will get compile time error
		  	
		 */

	}

}
