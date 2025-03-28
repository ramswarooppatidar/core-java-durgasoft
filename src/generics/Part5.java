package generics;

import java.util.ArrayList;

import javax.print.attribute.standard.Media;

public class Part5<T> {
	//generic object in non generic area
	public static void g1(ArrayList l) {
		l.add("rahul");
		l.add(10);
		l.add(10.5);
		l.add(true);
	}
	
	//compile code normally with generic setense
	//2. remove generic
	//3. compile again resultent code,  methos signature is same, err : name clash
	//	public void ms(ArrayList<String> l) {
	//		
	//	}
	//	public int ms(ArrayList<Integer> l) {
	//		
	//	}
	
	public <T> void M1(T ob) {
		
	}
	public <T extends Number> void M2(T ob) {
			
		}
	public <T extends Number & Runnable> void M3(T ob) {
		
	}
	public <T extends Comparable<T> & Runnable> void M4(T ob) {
			
		}
	public <T extends Number & Runnable & Comparable> void M5(T ob) {}
			
//		}
//	public <T extends Runnable & Number> void M6(T ob) {
//		
//	}
//	public <T extends Runnable & Thread> void M6(T ob) {
//			
//		}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we can declear type perameter either class lavel or method level
		/*
		 * declering type peramter at class level
		 * we have to declear type peramter just before return type
		 * 
		 * if we send generic object to non generic area then ita behavies like non generic idea, if we send
		 * non generic object to generic idea then its behaving like, generic object that is location in which
		 * object present based on that behaviour will be defined
		 * 
		 * 
		 */
		ArrayList<String> list = new ArrayList<String>();
		list.add("ram");
		list.add("pawan");
		g1(list);
		System.out.println(list);
//		list.add(10);
		
		/*
		 * the main purpose of generic is, to provie a type sefty and to resolve type causting problem 
		 * type sfty and type casting both are aplivcble at compile time, hence generic concept also
		 * applicable at compile time but not at run time
		 * 
		 * at the time of compation as last step generic setence will be removed, hence for the jvm 
		 * generic setense wnt to be available
		 */
		ArrayList list2 = new ArrayList<String>();
		list2.add("ram");
		list2.add(10);
		list2.add(10.5);
		list2.add(true);
		System.out.println(list2);
		
		/*
		 * hence the following declartion is equal
		 */
		ArrayList list3 = new ArrayList<String>();
		ArrayList list4 = new ArrayList<Integer>();
		ArrayList list5 = new ArrayList<Double>();
		
		/*
		 * the following declartion are equal, for this al object we can add only string type of object,
		 * 
		 * return type is not allowed with method segnature
		 */
		ArrayList<String> list6 = new ArrayList<String>();
		ArrayList<String> list7 = new ArrayList<>();

	}

}
