package com.multithreading;

//import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

class MyRunable implements Runnable{

	@Override
	public void run() {
		// job of thread
		System.out.println("inside run method : "+Thread.currentThread().getName());
		for(int i =0; i<10; i++) {
			System.out.println("child thresd");
		}

		
	}
	
}
class Durga extends Thread{
	
}

public class ThreadRunable_part_3 {

	public static void main(String[] args) {
		/*
		 * Runable interface present in java.lang.package and its contains one method run method
		 * 
		 */
		System.out.println(Thread.currentThread().getName());
		MyRunable r = new MyRunable();
		Thread t = new Thread(r);  // target runable
		System.out.println(t.getName());
		t.start();
		System.out.println(t.getName());
		
		System.out.println("main thread :"+ Thread.currentThread().getName());
		for(int i =0; i<10; i++) {
			System.out.println("main thresd");
		}
		
/*		Case Study
		MyRunable r1 = new MyRunable();	
		Thread t1 = new Thread();
		Thread t2 = new Thread(r);
		t1.start();
		t1.run();
		t2.start();
		t2.run();
   	    r.start();
		r.run();
		
		*/
		
		/*
		t1.start() a new thread weill be created and which is responsible for exceution of
		thread class run method , which has empty implementation
		
		t1.run() no new thread is created , and thread class run method executed, just normal method call
		
		t2.start() new thread will be created which is responsible for the execution of myRunable class
	    run method
	    
	    t2.run() a new thread won't be created and my runable run method will be executed, just like a normal
	    method call
	    
	    r.start()  compile thime error, saying myRunable class dosn't have start capability
	    
	    r.run() not new thread will be created , and my runable run method will be executed, like a normal
	    method call;
		*/
		
		
		//RECOMMONDED
		/*
		among two way to defined a thread implements runable approch is recommanded
		
		int the first approc our class always extends thread class, there is no chance of extending any
		other class, hence we are mmissing, inheritance benifits
		
		but in the second approch while implementing ruanble interface we can extend any other class
		hence we won't miss any inheritance benefit
		
		bcz of above reason implement runable interface approch is recommonded, then extending thread class

		 */
		
		// CONSTRUCTOR
		/*
		Thread t = new Thread();
		Thread t = new Thread(Runnable r);
		Thread t = new Thread(String name);
		Thread t = new Thread(Runnable r, String name);
		Thread t = new Thread(ThreadGroup tg, String name);
		Thread t = new Thread(ThreadGroup tg, Runnable r);
		Thread t = new Thread(ThreadGroup tg, Runnable r String name);
		Thread t = new Thread(ThreadGroup tg, Runnable r String name, long stackSize);
		
		*/
		
		//DURGAS APPROCH TO DEFINED THREAD, NO RECOMMONDED TO USE
		//hybride
		Durga d = new Durga();
		Thread t5 = new Thread(d);
		t5.start();
		
		//SETnAME, GETnAME
		/* 
		 * 
		 * EVERY THREAD IN JAVA HAS SOME NAME , IT MAY BE DEFAULT NAME GENERATED BY JVM
		 * or customized name provided by programmer
		 * 
		 * t.getName(), t.setName()
		 * 
		 * //for main(threaad)
		 * Thread.currentThread().getName()
		 */
		
	}

}
