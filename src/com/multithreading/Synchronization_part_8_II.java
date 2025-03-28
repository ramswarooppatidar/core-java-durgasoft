package com.multithreading;

class DisplayNumChar{
	public synchronized void displayn() {
		for(int i =0; i<10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(400);
			}catch(InterruptedException e) {
			
			}
//			System.out.println(name);
		}
	}
	public synchronized void displayc() {
		for(int i =65; i<75; i++) {
			System.out.print((char)i);
			try {
				Thread.sleep(400);
			}catch(InterruptedException e) {
				
			}
//			System.out.println(name);
		}
	}
}

class ThreadMy1 extends Thread{
	DisplayNumChar displayNumChar;
	ThreadMy1(DisplayNumChar displayNumChar){
		this.displayNumChar = displayNumChar;
	}
	public void run() {
		displayNumChar.displayc();
	}
}
class ThreadMy2 extends Thread{
	DisplayNumChar displayNumChar;
	ThreadMy2(DisplayNumChar displayNumChar){
		this.displayNumChar = displayNumChar;
	}
	public void run() {
		displayNumChar.displayn();
	}
}
public class Synchronization_part_8_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayNumChar d = new DisplayNumChar();
		ThreadMy1 t1=new ThreadMy1(d);
		ThreadMy2 t2=new ThreadMy2(d);
		t1.start();
		t2.start();

	}

}
