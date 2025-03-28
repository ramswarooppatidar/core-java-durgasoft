package com.enumerator;

//import javax.print.attribute.SupportedValuesAttribute;

interface x{
	
}
enum y implements x{
	//enum can implemetns any number of iterfcaes
}
enum Beerd{
	KF, RC, KO, fO;
	
}
public class EnumVsInheritance_part_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ENUM VS INHERITANCE
		 * evry enum is always direct chidl class of java.lang.Enum, and hence our enum can't 
		 * extend any other enum(bcz java won't support for multiple inheritance)
		 * 
		 * every enum is always final implicitley, and hence for our enum we cn't 
		 * create child enum
		 * 
		 * bcsz of above reson we can conclude inheritance concept not applicable for enum,
		 * explicitly, and we cant use extens keyword ofor enum
		 * 
		 * Inheritance concept, extends contect not applicble for eum,
		 * 
		 * enum can implements any number of interfaces
		 * */
		
		/*
		 * JAVA.LANG.ENUM
		 * this class is base class of all enum, this is direct child class of object,
		 * this is abstract class, implment serilizable and comparable
		 * 
		 * every enum in java is direct child class of java.lang.enum and hence this class as base clas
		 * for all java enums
		 * it is an abstract class and  it ias direct child class of object, its implement
		 * serilizable
		 * and coparable inrfaces
		 * 
		 * //VALUES METHOD
		 * every enum imcitly contains values methos to list out all value present inside enum
		 * NOTE : values method not present in java.lang.enum and object classes
		 * enum key word implicitly provides this method
		 * 
		 * //ORDINAL METHOD
		 * enum order of constant is important, and we reprent this order by using ordinal value
		 * we can find ordinal value of enum constat by using oridnal method
		 * 
		 * 
		 * // SPECILITY OF ENUM
		 * java enum is more powerfull then all language enum,
		 * in old language enum we can only take constants, but in java enum in addition to constant
		 * we can take method constructor , normal variable etc, hence java enum is more power full then
		 * old language enum
		 * even in sde java enum we can declerar  main method and we can direct run enum class
		 * */
		Beerd b[] = Beerd.values();
		for(Beerd br : b) {
			System.out.println(br+"....."+br.ordinal());
			System.out.println(b[0]);
		}

	}

}
