package com.oops;

class encapsulation{
	private int number = 12;
}
public class Part1_DataHiding {
	private double balance;
	public double getBalnce() {
		//validation;
		return balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is all are work for security data hiding, abstarcton, encapsulation 
		
		//DATA HIDING
		/*
		 * out side person cant access our data directly, or our internally data should not go
		 * directly,
		 * this oop feature is nothing but data hiding, after validation or identification out
		 * side person can access outr inernal data
		 * ex. 1 after provideing proper username and password, we can able to access our gamil
		 * inbox information,
		 * ex 2. even though we are valid customer of the bank we can able to access our account
		 * information and we cant access, others account information;
		 * 
		 * by declaring data member(varaibe) as private we can achieve data hiding,
		 * the main advatage of data hiding is security,
		 * NOTE : it is hight recommended to declear data member (Variable) as private
		 * 
		 */
		
		//ABSTRACTION
		
		/*
		 * HIDING INTERNAL implemenation and just highlight the steup services we are ffering is a 
		 * concept of abstraction
		 * ex. atm gui service, withrow bank atm gui screen bank peolpe highleting the setup service what they are offering
		 * without highlating internal implementaion
		 * 
		 * with the help of ABSTRACT CLASS and INTERFACE WE are achiving Abstarcction
		 */
		
		//ENCAPSULATION
		/*
		 * the process of binding data, and corrosponding methods into a single unit, is nothing but
		 * encapsultion,
		 * 
		 * ex. class student, data memebers + methods (behaviour)
		 * if any component follows data hinding and abstraction such tpe of componets is said
		 * to be encapsulated component
		 * Encapsulation = data hiding + abstarction
		 * the main advantage of encapsultion are, 1) we can achieve security, 2) enhancement bcm easy
		 * 3) its maintain maintanability of the application
		 * 
		 * the main advtage of encapsultion we can achieve security, but main disadvantage of encapsultion
		 * is it increases length of the code , and slow shutdown execution,
		 */
		
		//tightly ENCAPSULATED CLASS
		/*
		 * a class is said to be tightly encapsulated id and ony if each and every variable member declered as private 
		 * wheter class conatins corrosponding getter or setter method or not,
		 * and whether this methods are declered as public are or not, this thing we not require to check 
		 * 
		 * NOTE : if the parent class is not tightly encapsulated then no child class is tightly encapsulation
		 */
		/*
		 * 
		 */
		encapsulation object = new encapsulation();
		int num = object.number;
		

	}

}
