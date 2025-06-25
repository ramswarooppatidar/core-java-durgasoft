package com.multithreading;

 class MyIntrupt extends Thread{
//	 public void run() {
//		 for(int i=0; i<10; i++) {
//			 System.out.println("chhild thread");
//			 try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//			 System.out.println("im Itrupted ");
//			}
//		 }
//	 }
	 
//	 public void run() {
//		 try {	 
//			 for(int i=0; i<10; i++) {
//				 System.out.println("chhild thread");
//				Thread.sleep(2000);
//				}
//		 }catch(InterruptedException e) {
//			 System.out.println("im Itrupted ");
//			}
//		 
//	 }
	 
	 
	 public void run() {
		 for(int i=0; i<100; i++) {
			 System.out.println("i am lazy thread :"+i);
		 }
		 try {
			 Thread.sleep(2000);
			 System.out.println("thred is sleeping 2000 ");
		 }catch(InterruptedException e) {
			 System.out.println("im intrupted after 100000 ");
		 }
	 }
 }
public class PreventThread_Interupted_part_6_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyIntrupt t = new MyIntrupt();
		t.start();
//		t.interrupt(); //line 1
		for(int i=0; i<100;i++) {
			System.out.println("Main thread");
		}

	}
	/*
	  if we comment line 1 , then main thread won't intrupt child thread, in this case child
	  thread execute for loop 10 times,
	  if we mot commenting line, then main Thread intrup child thread, in this case ouput is
	  main threa.....child thread..im intrupted..main thread
	  
	  NOTE *****
	  whenever we are calling intrupt method if the target thread not in sleeping state or wating
	  state then there is no impect of intrupt call imediatly,
	  intrupt call will be waited until target thread entred into sleeping and waitng state(join),
	  
	  if target thread enterde into sleeping and wating state then imediate intrupt is call
	  and intrupt the thread
	  
	 
	  if the target thread never enterd into sleeping and wating state in its life time , then there is
	  no impect of intrupt call, this is the only case where intrupt call will be wasted
	  
	   //case 3
	  in this case intrupt call wating child thread to run 1000 times
	*/
}
