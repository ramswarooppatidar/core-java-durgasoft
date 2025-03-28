package com.enumerator;

enum Beer{
	KF,RC,KO,FO
}
public class Enum_part_1 {
	enum Day{
		MONDAY,TUESDAY, WEDNESDAY
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* Enum is group of name constant
		 *  enum concept is introduce in 1.5 version, when comparied with . old language enum
		 *  java enum is more powerfull,
		 *  
		 *  Internal implementaion of enum,
		 *  every enum is internally implementd by using class concept 
		 *  
		 *  every enum  constant is always public static final 
		 *  
		 *  evry constant is represnts an object of type enum
		 *  public static final RC = new Beer();
		 *   public static final kf = new Beer();
		 *  
		 *  eNUM DECLARTION UNDER uses,
		 *  every enum constant is always , public static final and hence we can access enum constant
		 *  by usinf enum name
		 *  Beer b = Beer.FO;
			System.out.println(b);

		 *  Inside enum toString method is internally implemented to retun, name of the constant
		 *  
		 *  we can declear enum either the within the class or outside the class but not inside a method,
		 *  if we trying to declear inside a method, then we will get compile time error
		 *  ENUM TYPES MUST NOT BE LOCAL
		 *  
		 *  //MODIFIERS
		 *  if we declear ENUM outside of the class, the applicable modifier are
		 *  public default strictfp
		 *  if we declear inside a class , the applicabe modifiers are
		 *  public,
		 *  default
		 *  strictfy, 
		 *  private , protected, static
		 *  
		 *  ENUM VS SWITCH (CASE)
		 *  until 1.4 version allowed argument type for switch stetment are
		 *  byte
		 *  char
		 *  int
		 *  short
		 *  
		 *  But for 1.5 v onwords corrosponding wrapper classe and enum types are allowed
		 *  from 1.7 v onwords string type laso allowed
		 *  byte - Byte
		 *  char-Character
		 *  int -Integer
		 *  short-Short
		 *  enum
		 *  String
		 *  
		 *  hence 1.5 version onwrods, we can pass enum type, as argument to switch stetment,
		 *  LOOPHOL
		 *  if we pass enum as arg to a switch stetemnt , then every case level should be valid enum constant
		 *  otherwise we will get compile time error
		 *  
		 * */
		Beer b = Beer.FO;
		System.out.println(b);
		
		switch (b) {
		case FO: {
			System.out.println("case fo");
			break;
		}
		case KF : {
			System.out.println("case kf");
			break;
		}
		case RC: {
			System.out.println("case fo");
			break;
		}
		case KO : {
			System.out.println("case kf");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " );
		}
	
		Day d = Day.MONDAY;
		System.out.println(d);

	}

}
