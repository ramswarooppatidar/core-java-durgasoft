package com.interfaces;

public interface Part_3_markerInterface {
	//marker  }
	
	//adpter concept
	void m1();
	int m2();
	int m3();
	boolean m4();
}
abstract class Adapterx implements Part_3_markerInterface{

	@Override
	public void m1() {	}

	@Override
	public int m2() {
		return 0;
	}
	@Override
	public int m3() {
		return 0;
	}
	@Override
	public boolean m4() {
		// TODO Auto-generated method stub
		return false;
	}	
}
class Test34 extends Adapterx{
	public void m1() {
		System.out.println("Adapter concept first create abstract class and implements the interface, then");
	}
}
/*
 * if an interface dosnt conatin any methods and by implementing thet nterface, if our object
 * will get come ability such type of interfaces are called marker interfaces and ability interface or tag interface
 * ex.1 serializable,
 * 	 clonable,
 *   rendomAccess, singlThreadModel etc.
 * this is marked as some ability
 * 
 * ex => by implementing serilizable inerface our object can be saved to the file and can trevel accorss the netowrk
 * ex 2: by implementing clonable interface our object in a position to  produce exectly dublicate cloned objects
 * 
 * QUESTION : without having any methods how the object will get some ability in marker interfaces?
 * internally jvm is responsible to provide required ability,
 * 
 * question : why jvm is provide required ability in marker interfaces ?
 * to reduce complexity of the programming and make java language as simple
 * 
 * question : is it possible to create our own marker interface ?
 * yes, but customization of jvm is required
 * 
 */

/*
 * ADAPTER CLASSES :
 * adapter class is simple java class that implemets an interface with only empty implementation,
 * if we an interface for each and evry method of that inerface , compulasary we should provde implemention,
 * whether it is required or not required,  it increas the length of code anmd reduce the redability
 * 
 * we can solve this prblen by using adapter classes, instance implements  interfcae if extends adapter class
 * we have to provide implementation only for required methods, and we are not responsible to provide 
 * implementation, for each and every method of the interface so the length of the code will be reduce
 * 
 * we can devlop our servlet in the following 3 way, 
 * 1) by implementing servlat interface
 * 2) by extending gneric servlet 
 * 3) by extending httpservlate
 * 
 * if we implement servlate interface for ecah and evry method of that interface we should provide implementation
 * it increse length of the code and reduces readbility, 
 * 
 * instance of implementing servlate direcly if we extend generic servlate we have to provide implemanetion
 * nonly for service mathod and all remaining ethods we are not required to provide implemantion,
 * Henace, more or less generic servlate access adpter class for servlate interface
 * 
 * NOTE : marker interface and adpter class simplifies complexity of programing and this are best utility to the
 *  programmer  and programmer life bcm simple
 * 
 * 
 */

