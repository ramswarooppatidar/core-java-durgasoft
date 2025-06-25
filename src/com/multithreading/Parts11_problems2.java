package com.multithreading;

import java.util.LinkedList;
import java.util.Queue;

class SharedQueue2{
	Queue<Integer> queue = new LinkedList<Integer>();
}
class Consumer extends Thread{
	private SharedQueue2 sharedQueue;
	
	public Consumer(SharedQueue2 sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    public void consumer() throws InterruptedException {
        synchronized (sharedQueue.queue) {
            if (sharedQueue.queue.isEmpty()) {
                System.out.println("Queue is empty, consumer waiting...");
                sharedQueue.queue.wait();
            } else {
                int item = sharedQueue.queue.poll();
                System.out.println("Consumed: " + item);
                sharedQueue.queue.notifyAll(); // Notify producers
            }
        }
    }
    
    public void run() {
        try {
            while (true) {
                consumer();
                Thread.sleep(1000); // simulate processing
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Producer extends Thread{
	 SharedQueue2 sharedQueue;

	    public Producer(SharedQueue2 sharedQueue) {
	        this.sharedQueue = sharedQueue;
	    }

	    public void run() {
	        int item = 0;
	        try {
	            while (true) {
	                synchronized (sharedQueue.queue) {
	                    while (sharedQueue.queue.size() == 10) {
	                        System.out.println("Queue is full, producer waiting...");
	                        sharedQueue.queue.wait();
	                    }
	                    sharedQueue.queue.add(item);
	                    System.out.println("Produced: " + item);
	                    sharedQueue.queue.notifyAll();
	                    item++;
	                }
	                Thread.sleep(500); // Simulate delay in producing
	            }
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
}
public class Parts11_problems2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
