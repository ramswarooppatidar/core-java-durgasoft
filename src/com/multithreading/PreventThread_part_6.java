package com.multithreading;

class MyThreadJoin_2 extends Thread{
	static Thread mt;
	public void run() {
		try {
			mt.join();  //
		} catch (Exception e) {
			// TODO: handle exception
		}
		for(int i =0; i<10; i++) {
			System.out.println("SEETA thred");
			
		}
	}
}
class MySleep extends Thread{
	
}
public class PreventThread_part_6 {
	/*
	  CASE 2 : WATING OF CHILD THREAD UNTIL COMPLETING MAIN THRED
	  child thread call the join method on main thread object, hence child thread has to wait
	  until completing main thread in this case output is, 
	  main main .....followed by child thread child thread 
	  
	  CASE 3 :if main thread call join mathod on child thread object, and child thread call 
	  join method on main thread object, then both the thread will wait forever, and programm is stucked
	  (this is something like deadlock)
	   
	  CASE 4 :IF A THREAD CALL JOIN METHOD ON SAME THREAD ITSELF THEN, THE PROGRAMM WILL BE STUCKED
	  THIS IS SOMTHING LIKE DEAD LIKE, 
	  IN THIS CASE THRED HAS TO WAIT INFINITE AMOUNT OF TIME
	  
	  
	  CASE 5: SLEEPING
	  if a thread don't want to perfome any operation for particular amount of time,
	  then we should go for sleep method
	  
	  public static native void sleep(long ms) throw interupteException
	  public static void sleep(long ms, int ns)
	  every method throw IE which is checked exception, hence whenever we are using sleep method
	  compulsory we should handle, intrupted exction, either by try catch or throws key word,
	  either wise we will get complie time error
	*/
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//CASE 4
//		Thread.currentThread().join();
		
		MyThreadJoin_2.mt = Thread.currentThread();
		MyThreadJoin_2 t2 = new MyThreadJoin_2();
		t2.start();
		
		//CASE 3  VALID IF mt.join() also present
//		t2.join();
		
		for(int i =0; i<10; i++) {
			System.out.println("Rama thread : ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//sleep thread
		for(int i =0; i<10; i++) {
			System.out.println("sleep thread");
			Thread.sleep(50000);
		}
		
		/*
		 * HOW A THREAD CAN INTRUPT ANOTHER THREAD :
		 * A thread can intrpt a sleeping threador wating thread by using, intrupt method
		 * of thread class
		 * public void intrupt(){
		 *   //sleep
		 *   //join
		 * }
		 */
	}

	}


