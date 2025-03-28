package com.multithreading;

public class InterThreadComm_part_10 {

	public static void main(String[] args) {
		/*
		 * TWO THRAD can communication with each other using wait() notify() and notifyall(), 
		 * 
		 * the thread
		 * which is expecting updation is responsible to call wait method, then
		 * immedeatily the threda will intered into wating state
		 * 
		 * the thread which is responsible to perform updation ,
		 * after performing updation
		 * it is responsible to call notify method, then wating thrad will get that notification
		 * and continue its execution with those updated items
		 * 
		 * wait(). notify()....notifyall()*******
		 * present in object class but not in thread class because thread can call this methods
		 * an any java object
		 * 
		 * to call wait , notify , notifyAll, methods an any object , thread should be owner of
		 * that object, that is the tread should has, lock of that object, that is the thread should be
		 * inside the synchronized area
		 * hence we can call wait notify notifyall methods only from synchronized area, otherwise we 
		 * will get run time exception saying illegal monitors states exception
		 * 
		 * 
		 * if a thread calls wait method on any object it immediatly relases the lock of the particular object
		 * and intered into wating state
		 * 
		 * If athread calls notify method an any object, it releases the lock of the that object but may
		 * not immediately,
		 * except wait(), notify(), and notifyAll(), there is no other method where thread releases the lock
		 * 
		 */

	}

}
