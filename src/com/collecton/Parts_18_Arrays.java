package com.collecton;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
class Employee123{
	int id;
	String nameString;
	int salary;
	
	public Employee123(int id, String nameString, int salary) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
public class Parts_18_Arrays {

	public static void main(String[] args) {
		Integer[] arr = {1,2,6,3,8,9,7};
		Arrays.sort(arr);
		for(Integer integer : arr) {
			System.out.print(integer+" ");
		}
		
		Arrays.binarySearch(arr, 7);
		
		//conversion
		String[] strings= {"a","g","f","d"};
		List list = Arrays.asList(strings);
		System.out.println(list);
		strings[0]="changes";
		System.out.println(list);
		//exception
		list.add("new eleemnt");
	}
}
class employeeComperator implements Comparator<Employee123>{

	public int compare(Employee123 o1, Employee123 o2) {
		if(o1.getId() != o2.getId()) {
			return Integer.compare(o1.getId(), o2.getId());
		}else if(o1.salary != o2.salary) {
			return Integer.compare(o1.getSalary(), o2.getSalary());
		}else {
			return o1.getNameString().compareTo(o2.getNameString());
		}
	}
	
}
/*
 ARRAYS : 
  array class is an utility class to defined several utility methods for arrays
  
  SORTING ELEMNTS OF ARRAY :
   1) public static voint sort(premitive[] a);
   1) public static voint sort(object[] a);   //default natural sorting
   3)  public static voint sort(object[] a, Comperator c);  //customized
   
   NOTE : DNSORTING FOR premitive types
   and customized sorting for object type arrya
   
   SEARCHING ELEMNTS :
   array class defined following binary serch algorithums
   1) public static int binraySearch(premitive[], premitive target )
   2) public static int binraySearch(object[], object target )
   3) public static int binraySearch(premitive[], object target, comperator c );
   
   CONVERSION OF ARRAY TO LIST :
   Object[] arr = collection.toArray();
   
   public static List asList(Object[] a)
	   strict speaking this method wont create an idepend list object , for existing array we are geting
	   list view
	   
	   by using aray refernce if we perform any change automatically the change will reflected to list,
	   by using list reference if we perfprm any change automiacally the change will reflected to the array
 */

