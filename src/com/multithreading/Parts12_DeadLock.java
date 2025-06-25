package com.multithreading;

public class Parts12_DeadLock {

	public static void main(String[] args) {
		final String lock1 = "Resource-A";
        final String lock2 = "Resource-B";

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: locked " + lock1);

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (lock2) {
                    System.out.println("Thread 1: locked " + lock2);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: locked " + lock2);

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (lock1) {
                    System.out.println("Thread 2: locked " + lock1);
                }
            }
        });

        t1.start();
        t2.start();
	}
}
/*
  DEAD-LOCK :
  	if two threads are waitng for each other forever such type of infinite waitng is 
  	called dead lock
  	synchronized keyword is the only reason for dead lock situation hence while using synchronized
  	key word we have take special care,
  	there are no resoltuion technique for deadlock but sveral prevention thechnique are available
  	
 */
