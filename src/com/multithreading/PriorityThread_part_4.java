package com.multithreading;

class MyThreadp extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("child thread");
		}
	}
}
public class PriorityThread_part_4 {

	public static void main(String[] args) {

		
		/*
		  evry thread in java have some priority, it may be dafault priority generated 
		  by jvm , or customized priority provide by prigrammer, priority range 1-10
		  1 is min proirity , thread class defined the following costants to represent
		  some standard priorities, 
		  threda. minpriority 1,
		  thread,normalPriority 5,
		  thread,max =10
		 
		 
		  thread schedular will use priority while alocating processor , the thread which having hpriority wi
		  will get chance first,
		  if two thread having same priority then , we cant except execution order, it depends on thread schedular
		  
		  public final void setPriority(int i){
		  	setPriority()  //allowed range 1 to 10 //ilegal arg exception
		  }
		  getPriority()
		  
		  the default priority for only main thread is 5 , for all remain thread default priority will be
		  inherited, from parent to child , 
		  that is wahtever priority parent thread has , the same priority
		  will be there for child thread
		  
		  NOTE : some platforms wont provide proper support thread priorities
		 
		 */
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		
//		Thread.currentThread().setPriority(8);
		MyThreadp t1 = new MyThreadp();  //parent class and parent thread bothare different
		System.out.println("child thread priority : "+t1.getPriority());  //8
		//some OS not support priority of thread  
		t1.setPriority(10);
		t1.start();
		
		for(int i =0; i<10; i++) {
			System.out.println("main tread : ");
		}
		
	}

}
