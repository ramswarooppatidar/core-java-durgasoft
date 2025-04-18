package com.collecton;

import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable{

	int id;
	String name;
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return this.name +"..."+this.id;
	}
	@Override
	public int compareTo(Object o) {
		int id1 = this.id;
		Employee employee = (Employee)o;
		int id2 = employee.id;
		if(id1 < id2) {
			return -1;
		}else if(id1 > id2) {
			return 1;
		}else return 0;
		
	}
	
}
public class Parts_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new MyComprator());
		t.add("ramswaroop");
		t.add("pawan");
		t.add("lalli");
		t.add("krishna");
		t.add("jatin");
		t.add("gori");
		t.add("prachi");
		t.add("bhumi");
		System.out.println(t);
		
		TreeSet t2 = new TreeSet(new MyComprator());
		t2.add(new StringBuffer("ramswaroop"));
		t2.add(new StringBuffer("pawan"));
		t2.add(new StringBuffer("lalli"));
		t2.add(new StringBuffer("shrishti"));
		t2.add(new StringBuffer("krishna"));
		t2.add(new StringBuffer("gori"));
		t2.add(new StringBuffer("prachi"));
		t2.add(new StringBuffer("bhumi"));
		System.out.println(t2);
		
		TreeSet t3 = new TreeSet(new MyComprator2());
		t3.add(new StringBuffer("ramswaroop"));
		t3.add(new StringBuffer("pawan"));
		t3.add("lalli");
		t3.add("shrishti");
		t3.add(new StringBuffer("krishna"));
		t3.add("gori");
		t3.add(new StringBuffer("prachi"));
		t3.add(new StringBuffer("bhumi"));
		t3.add(new StringBuffer("AA"));
		t3.add(new StringBuffer("ZZ"));
		System.out.println(t3);
		
		Employee e1 = new Employee(0, "ramswaroop");
		Employee e2 = new Employee(12, "radhe");
		Employee e3 = new Employee(7, "krishna");
		Employee e4 = new Employee(3, "neem karoli baba");
		TreeSet t4 = new TreeSet(new MyComprator3());
//		TreeSet t4 = new TreeSet();
		t4.add(e1);
		t4.add(e2);
		t4.add(e3);
		t4.add(e4);
		System.out.println(t4);
			
	}
}
class MyComprator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
//		String s1 = (String) o1;
		String s1 = o1.toString();
		String s2 = o2.toString();
//		return -s1.compareTo(s2);   //reverse default sorting
		return s2.compareTo(s1);     //reverse default sorting
	}
	
}

class MyComprator2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		int l1 = s1.length();
		int l2 = s2.length();
		if(l1 < l2) {
			return -1;
		}else if(l1 > l2) {
			return 1;
		}else {
			return s1.compareTo(s2);
		}

	}
	
}
class MyComprator3 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);

	}
	
}

/*
 * 1) WRITE PROGRAM TO INSERT STRING OBJECT TO THE TREE SET , IN REVERSE ORDER OF ALPHABETICAL
 * 2)  insert stringbuffer object in tree set,  according to alphbetical order
 * 
 * NOTE : if we are depending on default natural sorting order compulsary object should be homogenious and
 * comparable, otherwise we will get run time exception : CLAS_CAST_EXCEPTION
 * if we are define our own soring by comperator then object need not be comparable and homogenious,
 * we can add hetrogenious and non comparble object also
 * 
 * QUESTION : WRITE A PROGRAM TO INSERT STRING AND STRINGBUFFER OBJECT WHERE SORTING ORDER INCRESING LENGTH ORDER
 * IF TWO OBJECT HAVING SAME LENGTH THEN CONSIDER THERE APLPHABETICAL OREDR
 * 
 * COMPARABLE  VS COMPERATOR
 * 1) for pre defined comparable classes default natural sorting order is already avaiable if we are not setiesfied
 * with then default sorting order then we can defined our own sorting by compaerator(String)
 * 
 * 2) for pre defined non comparble classes (stringbuffer) default natural sorting order not already availbe, we can
 * defined ore own sorting by using comparator
 * 
 * 3)for our own classes like a employee , the person who is writing that class is responsible to defined default 
 * natural sorting order by implementing comparable intreface,
 * the person who is using our class , if is not setiesfied with default natural sorting order then he can define
 * his own sorting by comparetor (employee class....)... 
 * 
 */
