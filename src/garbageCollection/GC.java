package garbageCollection;

import java.lang.classfile.Superclass;
import java.util.Date;

//import javax.management.RuntimeErrorException;

public class GC {
//once we made object eligible for bc may not be destroy immediately by gc ,
//	when jvm runs gc then only object is destroyed
	
	//following two ways to gc buy jvm
	//1 system class, contain a static method System.gc(),  request jvm to run jvm
	
	//2 by using Runtime class
	/*
	 * java application can communicate using Runtime object
	 * runtime class present in java.lang package and it is a singletone class,
	 * we can create run time object by using runtime.getRuntimeMethod
	 * */
	
	
//	Runtime r = Runtime.getRuntime();
	 /*
	  * WE CAN CALL FOLLOWING METHOS ON THAT OBJECT 
	  * totalmemory(), it return number f byte  of total memory present in heap, heap size
	  * freememory(), it reyurn nu. of bytes free memmory present in hesp
	  * gc(), for requesting jvm to run gabage collector
	  * 
	  * */
	 public static void main(String arg[]) {
		 Runtime r = Runtime.getRuntime();
		 System.out.println( r.totalMemory());
		 System.out.println(r.freeMemory());
		 for(int i =0; i<10000; i++) {
			 Date d = new Date();
			 d = null;
		 }
		 System.out.println(r.freeMemory());
		 //in run time class instabce method
//		 r.gc();
		 System.out.println(r.freeMemory());
		 System.out.println(r.freeMemory());
		 System.out.println(r.freeMemory());
		 //static method, convinents, recommanded
		 System.gc();
		 System.out.println(r.freeMemory());
		 
		 
		 //cant create with object refernce, singletone class
//		  (new Runtime()).gc();
		 
		 //recoomed always static method, but System.gc() , method internally called , 
//		  Runtime().getRuntime().gc(), so in this case recomment , to use instance method
		 

		 
		
	 }

	 
}
