package garbageCollection;

import java.security.PublicKey;

public class GC_Finalization {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JUST BEFORE DESTORY OBJECT GC CALL FINALIZED METHOD, TO PERFORM CLEAN UP ACTIVITY
		//resource delocation activity
		//finalized Method inside object class
		
		//just before destroy method, gc call finalized method to perform cleanup activites
		//once finalized method completes, automatically gc destores that object
		
		//finalized method present in object class with folllowing declartion
		// protected void finalize throws thrwable(){
		//we can overide method in over class to define over own , cleanup activity
		
		
		
//		String s = new String("Ramswaroop");
		GC_Finalization s = new GC_Finalization();
		s.finalize();
		s.finalize();
		s = null;
		// string object is eligible for gc then string class finalize method called
//		but string class no finalized method so called is object class finalized method, that is empty
		
		
		// test object is eligible for gc then ,  finalize methos is called ,
		
		System.gc();
		System.out.println("call main thread");	

	}
	
	//not call in string case because gc call, string class finalize(); method is called,
	//to execute this we need to call, gc of this call
	//explicity execulty ,  but it is normal call, object not destroyed
	public void finalize() {
		System.out.println("clean up activity perform here");
	}
	//in the abov eproblem finalizemethod excecuted three time 2 time explacitly by the programmer and 1 time , 
//	by the garbage collector
	
	//init, service, destroyed  consider as life cycle method of servlate , destroye is used to clean up activity
	//if we call explicityly destroye method from intit or service then it is a normal call, and servlate object not destroyed
	

}
