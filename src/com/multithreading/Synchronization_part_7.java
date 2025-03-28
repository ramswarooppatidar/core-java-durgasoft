package com.multithreading;
class x{
	synchronized void m1() {
		System.out.println("execute m1");
	}
	synchronized void m2() {
		System.out.println("execute m22");
	}
	public void m3() {
		System.out.println("m3");
	}
}
class Display{
	public synchronized void wishe(String name) {
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
}
class MyThread_ extends Thread{
	Display display;
	String string;
	MyThread_(Display display, String string){
		this.display = display;
		this.string = string;
	}
	public void run() {
		display.wishe(string);
	}
}
public class Synchronization_part_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 synchronized is a modifier applicabel only for methods and block but not for classes
		 and variables
		 
		 if multiple threads are trying to opertae simulatiously on the same java object then
		 there may be a chance of data inconsistance problem, to overcome this problem we should
		 go for synchronized key word
		 
		 if a method or block decleared as scynchronized then at a time i=only one thread is allowed to excecute
		 that method or bock on given objec, so that data inconsistancy problem will be resolved
		 
		 the man advatage of scynch key word is we can resolve data inconsistency problems, but main 
		 disavatage of synck key word is it increase waitng time of thread and creates performance 
		 problems hence if there is no speifice requirment, that is is no recommonded to use
		 synchronized key word
		 
		 
		 Internally synch concept implemented by using lock, every object in java has a unique lock
		 , whenver we are using synchronize key word then only lock concept will come into the picture,
		 if a thread want to execute synchronizwd method on the given object first it has to get lock 
		 of that object once thread got the lock then it is allowed to execute any shryconized method
		 on the object. once the method execution completes , automatically thread relases the lock,
		 accuring and releasing lock internally takes care by JVM, and programmer not respnsible for 
		 this activity
		 
		 
		 while a thread executing shcyn. method on given object the remaining thread are not allowed to 
		 execute to any synch,. method on the same object but, temianing thread are allowed to 
		 execute non synch. method simulataniously
		 
		 Lock concept implemented on object but not based on method
		 
		 SNCYNOIZED AREA/NON SYNCHRONIZED
		 non-sync. :  this area can be access any number of threads simultaniously
		 sync : this area access by thread one at a time
		 
		 sync-area : wherever we are perfoeriming opeartion add/delete/update/delete
		 state of object is changes
		 non-synch area : wherever object state not be changed, read operation
		 */
		
		Display d = new Display();
		MyThread_ t1 = new MyThread_(d, "Dhoni");
		MyThread_ t2 = new MyThread_(d, "Yuvraj");
		MyThread_ t3 = new MyThread_(d, "Kohli");
		MyThread_ t4 = new MyThread_(d, "Rohit");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		/*
		t1, call wish method, t2 call wish method, 
		if we are not declaring wish method as synchronous than  both thread willl be executed 
		simulataniously and hence, we will get irregular output,
		
		if we declear wish method as synchronized then at a time only one thread is allowed
		to execute wish method, and given display object, 
		hence we will get regular output
		
		*/
	}

}
