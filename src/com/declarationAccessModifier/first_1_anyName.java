package com.declarationAccessModifier;

class first_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("class a is execute");
	}
}
class B{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("class b is execute");

	}
}
class C{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("class c is execute");

	}
}
public class first_1_anyName{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("public class main method is execute");

	}
}
	/*
	 * a java program can conatin any number of classes but at most class can be decler as public if there is
	 * a public class then name of the program and name of the public class must be matched, otherwise we will
	 * get complie time error
	 * class A{}, class B{}, class C{}
	 * 
	 * case 1) 
	 * if there is no public class, the we can use any name and there is no restrictions 
	 * case 2)
	 * 
	 * if class b is public then ,then name of the program should be b.java other wise we will get compile time
	 * error : class b is public , should be declre in a file named B.java
	 * 
	 * case 3)
	 * if class b and c declered as public and name of the program is B.java, then we will get compile time error
	 * saying : class c is public , should be declre in your file named C.java
	 * 
	 */


