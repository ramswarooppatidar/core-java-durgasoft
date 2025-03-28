package com.multithreading;

class MyThread extends Thread{
	public void run() {
		//execute child class
		System.out.println("run method");
//		for(int i =0; i<10; i++) {
//			System.out.print(i+" ");
//		}
	}
	public void start() {
		//execute run method
		super.start();
		System.out.println(" start method");
	}
	//overoading, normal method
	public void run(int i) {
		//execute child class
//		for(int j =0; j<10; j++) {
//			System.out.print(j+" ");
//		}
	}
}
public class Introduction_part_2 extends Thread {
//	public void run() {
//		for(int i =0; i<10; i++) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
//	}
//	public void start() {
//		//execute run method
//		super.start();
//		System.out.println(" start method, Introduction_part_2");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* DEFINING THREAD
		 * we can defined a thread in the following two ways, by extending thrad class second 
		 * by implementing Runable Interface
		 * 
		 * 1 by extedning thread class
		 * 
		 * CASE 1: THREAD SCHEDULAR
		 * it is the part of jvm,
		 * it is responsible to schdule threads, that is if multiple thread is wait for get chance of excution
		 * then which order thread will be executed , is decide by thread schdular,
		 * 
		 * we cant exect alorithum followed by thread schedular it is varied from jvm to jvm
		 * so we cnt expect thread execution order , and exect output,
		 * hence whenwhere situation is multi threading therr is no guarent to exect output
		 * put we can provide servral possible output,
		 * 
		 * main thread 10x then child thread, 
		 * child thread 10x main thread,
		 * main thread, child thread
		 * child thread main thread
		 * 
		 * CASE 2 : difference betwee t.start()  and  t.run()
		 * in the case of t.start() a new thread will be created which is responsible for th execution of the 
		 * run method
		 * but in the case of t.run  a new thread wan't to be cretaed and the run methid eill be excecuted jut a
		 * normal method call by the main threda, hence the above proble m if we replace t.start with t.run
		 * the output is same as , main thread order
		 * 
		 * 
		 * //CASE 3 :importance of thread start method
		 * 
		 * it is responsible to perform to register the thread with thread schedular and all other mendetory 
		 * activities, hence withiout excuting thread class start method there is no chance to start
		 * new thread injava due to this thrad method of start is heart of multi threading
		 * 
		 * start(){
		 * 10 register thread schedular
		 * mandetory work
		 * invoke run()
		 * }
		 * 
		 * CASE 4: 
		 * we can overload run() method
		 * 
		 * CASE 5: IF WE NOT OVERIDING RUN() METHOD
		 * if we not overiding run method then, thread class run method  will be executed which 
		 * has emty implemention , so we not get any output
		 * highly recomonded run method, other wise don't go for multi threading concept
		 * 
		 * CASE 6: overing of start() and run()
		 * 
		 * if start() overiding, then child class start method is executed, so no chance to create thread
		 * so , run method is no execute,
		 * if we overide start(), then we not use multithreading concept
		 * 
		 * thread is created
		 * start(){
		 *  super.start()
		 * }
		 * 
		 * 
		 * start run main,
		 * start main run,
		 *  run start main
		 *  
		 *  
		 *CASE 8: THREAD LIFE CYCLE
		 *new/brn state------->t.start()--->running---->dead
		 *
		 *CASE 9 : 
		 *after strat a thread if we trying to start same thread then we will get run time exception
		 *sayiny illegalthreadStateException
		 */
		Introduction_part_2 t1 = new Introduction_part_2();
		System.out.println("THREAD NAME hsjjsjs : "+t1.getName());
		t1.run();  //normal method call,
		t1.start();
		System.out.println("THREAD NAME 2 : "+t1.getName());
		
		MyThread t2 = new MyThread();  // thread instances, main thread create
		t2.start();  // main thread start child thread
		System.out.println("THREAD NAME : "+t2.getName());
		
	   //java.lang.IllegalThreadStateException
//		t2.start();
		
		
		System.out.println("main thread");
		System.out.println();
		
//		for(int i =11; i<33; i++) {
//			System.out.print(i+" ");
//		}

	}

}
