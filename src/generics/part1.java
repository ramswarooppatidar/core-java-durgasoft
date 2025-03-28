package generics;

import java.util.ArrayList;

public class part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//the main objectives are generics are to provides type sefty and to resolve type casting problems
		/*caase 1 type sefty
		//arrays are type safe , we can give the guarenty for type of elements present inside array
		//fir example if over pr. requiremnt is to hold nly string type object we can choose string array
		 * if we adding to add other type of object we can get comple type error
		 * String []s = new String[1000]
		 * s[0] = "ravi"; s[1]=new Intger(10)  correct;
		 * hence string array can conatin only string type of object, due to this it is give gurenty,
		 * element is string type, hence array are safe to type safe
		 * */
		ArrayList list = new ArrayList<>();
		list.add("ram");
		list.add(10);
		list.add(12.5);
		list.add("shyam");
		System.out.println(list);
		String nameString1 = (String) list.get(0); //TYPE CASTING MENDATORY,
		System.out.println(nameString1);
    	String nameString = (String) list.get(1); //class cast exception
    	
    	//for type sefty intriduce generic concpt,
    	/*
    	 * but collection are not type safe that is not give guarenty for the type of elements present inside collection
    	 * for example if program requiremnt is to hold only string type of objects,
    	 * by mistak if try to add any other type object we wnot get any compile type error but
    	 * program may fail at run time,
    	 * hence we cant give gurat for type of element in side colloection, collection are not safe to type safet,
    	 * collection are not type safe
    	 */
    	
    	/*
    	 * CASE 2 TYPE CASTING
    	 * IN THE CASE of array at the time retrive its not require type causting bcz ther is guarty
    	 * for the tye of elem present i side array , string []s= new String[1000],
    	 * 
    	 * to overcome tye problems in collection, itroduce generic in 1.5 version, the main objective of 
    	 * generics are, 
    	 * 1. to provide type sfety 
    	 * 2. to resolve type casting problems
    	 */
		 
	}

}
