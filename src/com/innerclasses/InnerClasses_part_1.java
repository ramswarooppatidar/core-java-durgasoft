package com.innerclasses;

class Unviersity{
	
	//normal or regular inner class
	class Department{
		
	}
}
public class InnerClasses_part_1 {
	class inner{
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * declear a class inside another class such types are called inner classes,
		 * 
		 * inner classes introduced in 1.1v  to fixe gui bugs as a part of event handling
		 * but bcz of power full features and benifits of inner classes , slowly prog. 
		 * are alos started in coding 
		 * 
		 * without exeting one type og object if there is no chance of another type of object
		 * then we should go for inner classes
		 * 
		 * example 1: University consist of several department without existing university there
		 * is no chance to existing depatment , hence we have to declear department class inside 
		 * university class
		 * 
		 * Map is a group of key value pear and each key value paire is ENtry without existing map
		 * object there is no chance of existing entry object, hence Interface Entry is defined
		 * nside Map Interfece
		 * 		Interface Map{
		 * 			interface Entry{
		 * 			}
		 * 		}
		 * 
		 * NOTE : WITHOUT EXISTING OUTER CLASS OBJECT THERE IS NO CHANCE OF EXISTING INNER CLASS
		 * OBJECT
		 * THE RELATION BETWEEN BETWEEN INEER CLASS AND OUTER CLASS :  IS HAS A RELATION(composition
		 * aggrigation)
		 * 
		 * based on postion and decleration all inner classes divide into 4 types 
		 * 1 normal or regular inner classes
		 * 2 method local inner classes
		 * 3 anonymous inner classes
		 * 4 static nested classes
		 * 
		 * NORMAL AND REGULAR INNER CLASSES
		 * if we are declear any named class, directly inside a class without a ststic modifier
		 * such type of inner class is called normal or regular inner class
		 * 
		 * class outer{
		 *  calss inner{
		 *  }
		 * }, normal or regular inner class
		 * outer.class, outer$inner.class
		 * 
		 */
		System.out.println("outer class");

	}

}
