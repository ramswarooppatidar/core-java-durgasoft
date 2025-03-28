package com.multithreading;

class MyThreadYield extends Thread{
	public void run() {
		for(int i =0; i<2; i++) {
			System.out.println("child thread");
			Thread.yield();
		}
//		Thread.yield();
	}
}
class MyThreadJoin extends Thread{
	public void run() {
		for(int i =0; i<10; i++) {
			System.out.println("SEETA thred");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				
			}
		}
	}
}
public class PreventThread_part_5 {

	public static void main(String[] args) {
	/*
		we can prevent thread execution by using following methods, 
		yiled(), join() , sleep() method
		
		YIELD() :
		yield method causes to pass a current executing thread, to give the chance for
		wating threads of same prority,
		
		if there is no wating thread or, all wating thread have low priority then same 
		thread can continue its execution
		
		if multiple thrwads are waitng with same priority then, which wating thread will get the
		chance , we cant except it depend on thread schedular
		
		the thread which is yield when it get chance once again , depends on thread schedular
		and we cn't expect exectly
		
		
	*/
		MyThreadYield t1 = new MyThreadYield();
		t1.start();
		System.out.println(t1.getPriority());
		System.out.println(Thread.currentThread().getPriority());
		for(int i =0; i<2; i++) {
			System.out.println("main thread main");
		}
		
	/*
		if comment line 1 we cant expect which thread will complete first, if we are not commenting line
		1 then child thread always call, yield method, bcz of that main thread will get chance more number number of times
		and chance of completing  main thread first, is heigh
		
		Some platform wont provide, proper support for yield method
 
	*/
		
	/*
		  IF A THREAD WANT TO WAIT UNTIL COMPLETING OTHER THREAD THEN WE SHOULD GO FOR JOIN METHOD
		  IF THREAD T1 WANT TO WAIT UNTIL COMPLETING T2 THEN T1 HAS TO CALL T2.JOIN
		  IF T1 execute t2.join() then immedeaitely t1 will be wating state until t2 competer
		  once t2 complete then t1 continue its execution
		  
		  ex: t1 veue fixing , t2 printing, t3 distribution
		  t2 is waitng until t1 is completion hence, t2 has to call t1.join()
		  t3 has to wait until wedding cart printing t2 completin, has t3 call t2.join()
		  
		  public final void join() throws interruptedException
		  public final void join(long ms) throws interruptedException
		  public final void join(long ms, int ns) throws interruptedException
		  
		  NOTE : EVERY JOIN METHOS THROWS EXCEPTION, WHICH IS CHECKED EXCEPTION HENCE COMPULSORY 
		  WE SHOULD HANDLE THIS EXCEPTION EITHRT BY, TRY CATCH , THROWS KEY WORD, OTHERWISE 
		  WE WILL GET COMPLIE TIME ERROR
		 
	*/
		
		MyThreadJoin t2 = new MyThreadJoin();
		t2.start();
		
		try {
//			t2.join();
			t2.join(6000);  //dead line only for 10 sec
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i =0; i<10; i++) {
			System.out.println("Rama thread : ");
		}
	}

}
