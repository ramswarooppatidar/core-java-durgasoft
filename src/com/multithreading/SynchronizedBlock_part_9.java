package com.multithreading;

class DisplayBlock{
	public void wishe(String name) {
//		1 lkha line of code
		//object level lock
		synchronized (this) {
			for(int i =0; i<10; i++) {
				System.out.print("Good morning : ");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					System.out.print(name);
				}
				System.out.println(name);
			}
		}
		//class level lock
//		synchronized (DisplayBlock.class) {
//			for(int i =0; i<10; i++) {
//				System.out.print("Good morning : ");
//				try {
//					Thread.sleep(1000);
//				}catch(InterruptedException e) {
//					System.out.print(name);
//				}
//				System.out.println(name);
//			}
//		}
//		1 lkha line of code
	}
}
class MyThread_block extends Thread{
	DisplayBlock display;
	String string;
	MyThread_block(DisplayBlock display, String string){
		this.display = display;
		this.string = string;
	}
	public void run() {
		display.wishe(string);
	}
}
public class SynchronizedBlock_part_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		if very few lines of the code required synchronization, then it is not recommonded
		to dclear entire method as synchronized, we ave to enclosed those few lines of the
		code by using synchronized block,
		 
		the main advantage of block over synch. method it
		reduces wating time of threads and improves performance of the system,

		we can declear synch. block as followes
		to get of lock of current object 
		sync(this){
		}
		to get lock of particular object b,
		synch(b){
			if a thread got lock of particular object b, then only it is allowed to execute this area
		}
		synch(Display.class){
			if thread got lock of class level , then it is allowed to execute ths area
		}
		 */
//		DisplayBlock d1 = new DisplayBlock();
//		MyThread_block t1 = new MyThread_block(d1, "Dhoni");
//		MyThread_block t2 = new MyThread_block(d1, "Kohli");
//		t1.start();
//		t2.start();
		
		
		//irregular if object level lock(this), regular if class level lock(Display.class)
		DisplayBlock d1 = new DisplayBlock();
		DisplayBlock d2 = new DisplayBlock();
		MyThread_block t1 = new MyThread_block(d1, "Dhoni");
		MyThread_block t2 = new MyThread_block(d2, "Kohli");
		t1.start();
		t2.start();
		
		/*
		 *  int x;
		 *  synchronized(x)
		 *  
		 *  lock concept applicable object type and class type but not for primitived and hence we
		 *  can't pass primitive type as argument to synchronized block other wise we will get
		 *  compile time error, unecepeted type found it refernce
		 *  
		 *  if multiple thred are opertaing simulataniously on same java object then, there may be a chance of
		 *  data inconsistency problem , this is called race condition, we can overcome this problems by
		 *  using scynchronized key word, 
		 *  
		 *  //CLASS LEVEL LOCK VS OBJECT LEVEL:
		 *  if class is instance method ten object level lock is required and if class have
		 *  static method then class level lock is required
		 *  
		 *  
		 *  while a thread executing synchronized method on given object, is remaining threads are allowed to
		 *  execute any other synchronized method simulataniously on the same object, no
		 *  
		 *  what is synch block ?
		 *  how to declear sync block ? to get the lock of current object 
		 *  
		 *  how to declear synch. block to get class level lock? CalssName.class
		 *  what is advantage of synch block over synch. method? wating time reduceing, performe improve
		 *  
		 *  is thread can aquired multiple lock simulataniously ? Yes
		 *  from front objects
		 */
		
	}

}
