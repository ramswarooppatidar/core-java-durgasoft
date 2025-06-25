package com.multithreading;

import java.util.LinkedList;
import java.util.Queue;

class ConsumerThread extends Thread{
	private SharedQueue queue;
	public ConsumerThread(SharedQueue queue) {
		this.queue = queue;
	}
	
	public void run() {
		while(true) {
			try {
				queue.consume();
				 Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class ProducerThread extends Thread{
	private SharedQueue queue;

	public ProducerThread(SharedQueue queue) {
		this.queue = queue;
	}
	
	public void run() {
		int item =0;
		while(true) {
			try {
				queue.producer(item++);
				 Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class SharedQueue{
	private Queue<Integer> queue = new LinkedList<Integer>();
	
	public synchronized void producer(int item) throws InterruptedException {
		while(queue.size() == 10) {
//			wait();
			this.wait();
		}
		queue.add(item);
		System.out.println("Produced: " + item);
//		notify();
		this.notify();
	}
	public synchronized int consume() throws InterruptedException {
		while(queue.isEmpty()) {
			System.out.println("queue is empty consumer in waiting");
			wait();
		}
		int item = queue.remove();
		System.out.println("consume :"+item);
		return item;
	}
}
public class Parts11_problems {
	static Queue<Integer> q = new LinkedList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedQueue queue = new SharedQueue();
		ProducerThread producer = new ProducerThread(queue);
		ConsumerThread consumer = new ConsumerThread(queue);
		
		producer.start();
		consumer.start();

	}
}
/*
  class consumerThread{
    consumer(){
     	synchronized(queue){
     	  if(queue.isEmpty()){
     	    wait();
     	  }else{
     	  	consume item
     	  	}
     }
  }
  
  class ProduverThread{
     producer(){
      synchronized(q){
        produce item to the queue
        and add item
       }
      }
    }
*/