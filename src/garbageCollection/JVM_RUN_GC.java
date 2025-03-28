package garbageCollection;


public class JVM_RUN_GC {
	 static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for(int i =0; i<10000000; i++) {
			JVM_RUN_GC t = new JVM_RUN_GC();
			t = null;
		}
	}
	public void finalize() {
		count++;
		System.out.println("jvm call finalize methos :"+count);
	}
	
	//we cant expect excet behaviour of gc, it  very from jv to jvm
	//we cn't provide excced answers
	//1 when exectly jvm runs gc
	//2 in which order gc identify, eligible object
	//which order gc 
	//whether gc destroy all eligible object or not
	// what is algorithum followed by gc etc
	
	
	//mark and sweap most of gc are followed algorithum
	//1 whernver the progrma runs with low memory, rrthen jvm run garbage collect , but we a
	
	
	
	//THE OBJECT IS NO LONGER REQUIRED , THEN BECOME OBJECT TO ELIGIBLE FOR GC
	//IF NO OBJECT IS ELIGIBLE FOR GC, THEN MEMPRY LEAK PROBLEMS
	
	//memory leaks : the object which are not using in our program and which are not eligible for
//	gc such type of useless object are called memory leaks
	//in our program memoryleak present then program will be termunated, by outofmemory error
	//hence  an objcet no longer require, heighrt recomannded to make object eligible for gc
	
	//following various memory managment toolks , to identify memoryleak tool
	//HP VOV
	//HP J METER
	//Jprobe
	//patrol
	//ibm tivoli

}
