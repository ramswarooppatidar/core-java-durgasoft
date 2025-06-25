package com.multithreading;

import java.awt.PrintGraphics;

class ThreadB extends Thread{
	int total;
	public void run() {
		
		for(int i =0; i<=100; i++) {
			total += i;
			System.out.println(total);
		}
		//1 croe line below;  b.join()
	}
}
class ThredCommunicate extends Thread{
	int total;
	public void run() {
		synchronized (this) {
			System.out.println("child thread strat caluculation of total"); //2
			for(int i =0; i<=100; i++) {
				total += i;
			}
			System.out.println("child thread call notify method");  //3
			this.notify();
		}
	}
}
public class Parts11_InterThreadCommunication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		ThreadB b = new ThreadB();
//		b.start();
//        //Thread.sleep(6); 
//		//westing some time, performnceissue we dont know what is exect time in updation
//		
//        //b.join(); 
//		//increse wating time always get updated value    
//		System.out.println("total is**************** :"+b.total);
		
		
		ThredCommunicate boj = new ThredCommunicate() ;
		boj.start();
		Thread.sleep(10);   //if we use wait()  then main always in waiting
		synchronized (boj) {
			System.out.println("main thread call child thread");  //1
//			boj.wait();    // without sleep method
			boj.wait(10);   
			System.out.println("main thread get notify");   //4
			System.out.println("total is**************** :"+boj.total);  //5
		}
		System.out.println("program end");  //6
		
	}
	
	/*
	 * PRODUCER CONSUMER PROBLEMS :
	   producer thread is responsible to produce the item into the quesue, and
	   consumer thread is responible for consume the items from queue,
	   
	   if queue ie empty then consumer thread will call wait method and enterd into
	   waiting state, after producing items to the queue
	   producer thread is responsibe to call otify method then , waiting consumer
	   will get that notification and continue its execution with update items
	   
	   DIFFERENT BETWEEN NOTIFY() AND NOTIFYALL()
	   1) we can use notify method to give the notification for only one wating thread
	   if a multiple threads are waiting then only one thread will be notify and reaing
	   threads have to wait for further notification
	   which thread will be notify we cant excpect it is depends on jvm
	   
	   2) notifyAll()
	   we can use notify all to give notification for all waitng thread of particular
	   object , eventhough multiple thread notify but execution will be perfomrd one by
	   one bcz threads required lock and only one lock is availabe
	   
	   NOTE : an which object we are calling wait method thread required the lock of that 
	   particular object, 
	   for exampl if we are calling wait method on s1 then we have to call wait method on s1
	   but not on s2
	   example : 
	   stack s1 = new Stack
	   stack s2 = new Stack
	    synchronized(s1){
	        s1.wait();     //invalid
	     }
	     synchronized(s2){
	        s2.wait();     //valid
	     }     
	   
	 */
	
	

}
