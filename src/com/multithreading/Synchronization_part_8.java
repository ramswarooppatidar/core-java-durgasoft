package com.multithreading;

class Display_1{
	public static synchronized void wishe(String name) {
		for(int i =0; i<10; i++) {
//			System.out.print("Good morning : ");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.print(name);
			}
//			System.out.println(name);
		}
	}
}
class MyThread_s extends Thread{
	Display_1 display;
	String string;
	X1 x;
	MyThread_s(Display_1 display, String string,X1 x){
		this.display = display;
		this.string = string;
		this.x =x;
	}
	public void run() {
//		display.wishe(string);
//		X1.m1();
//		X1.m2(string);
		X1.m3();
//		x.m4();
//		x.m5();
		
	}
}
class X1{
	static synchronized void m1(String name) {
		for(int i =0; i<10; i++) {
		System.out.println("m1 static sync. method is called : "+name);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("m1");
		}
	}
	static synchronized void m2(String name) {
		for(int i =0; i<10; i++) {
		System.out.println("m2 static sync. method is called : "+ name);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("m2");
		}
	}
	static void m3(String name) {
		for(int i =0; i<10; i++) {
		System.out.println("m3 static method is called : "+name);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("m3");
		}
	}
	synchronized void m4(String name) {
		for(int i =0; i<10; i++) {
		System.out.println("m4  sync. method is called : ");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("m4");
		}
	}
	void m5() {
		for(int i =0; i<10; i++) {
		System.out.println("m5 method is called : ");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("m5");
		}
	}
}
public class Synchronization_part_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display_1 d1 = new Display_1();
		Display_1 d2 = new Display_1();
		X1 x1 = new X1();
		X1 x2 = new X1();
		MyThread_s t1 = new MyThread_s(d1, "Dhoni",x1);
		MyThread_s t2 = new MyThread_s(d2, "Yuvraj", x2);
		t1.start();
		t2.start();
		
		/*
		 CASE STUDY : 
		 even though wish method is synchronized but we will get irregular output, bcz
		 threads are operating on different java objects,
		 
		 CONCLUSION : if multiple thread are operating on same java object then synchronization
		 is required , 
		 if multiple thread are operating on multiple java object(d1, d2) then synchronization
		 is not required
		 
		 STATIC SYNCHRONIZED :
		 CLASS LEVEL LOCK :
		 every class in java has a unique lock which is nothing but class level lock
		 
		 
		 
		 while a thread executing static syncronized method the remaining thread are not allowed
		 execute any static syn. method of that class simultaniously, but remaining thread are 
		 allowed to execute , the following method simultaniously
		 normal static methods
		 synchronised instance method
		 normal instance method
		 
		*/
//		X1 x = new X1();
//		Display_1 d1 = new Display_1();
//		Display_1 d2 = new Display_1();
//		MyThread_s t1 = new MyThread_s(d1, "Dhoni",x);
//		MyThread_s t2 = new MyThread_s(d2, "Yuvraj", x);
//		t1.start();
//		t2.start();
		
	}

}
