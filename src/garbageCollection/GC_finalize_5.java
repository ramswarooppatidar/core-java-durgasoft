package garbageCollection;

public class GC_finalize_5 {

	static GC_finalize_5 s;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//even thouh object eligible for gc multiple time but gc calll finalize method only once
		
		 GC_finalize_5 f = new 	GC_finalize_5();
		 System.out.println(f.hashCode());
		 f=null;
		 System.gc();
		 Thread.sleep(5000);
		 System.out.println(s.hashCode());
		 
		 s= null;
		 System.gc();
		 Thread.sleep(4000);
//		 System.out.println(s.hashCode());  // java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "garbageCollection.GC_
		 System.out.println("End of main method");

	}
	public void finalize() {
		System.out.println("finalize called");
		s = this;
	}

}
