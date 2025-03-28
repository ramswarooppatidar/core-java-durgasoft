package com.wrapperclass;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Byte, Sort, Integer, Long, Float, Double, Character, Boolean
		 premitive data wrapped into object 
			 al l = new al()
			 l.add(10) cerrorr 1.4 v
			 Integer i = new Integer(10)
			 l.add(i)
			 
		to defined several utility method which are required for premitives
		String str = Integer.toString(10)
		
		CONSTRUCTOR : 
		almost all wrapper classes contains two constuctors, 1 can take
		  corrosponding premitive as arg, and other can take string as argument
		  Integer I = new Integer()
		  Integer I = new Integer("10")
		  
		  Double I = new Double(5.7)
		  Double I = new Double("10.7")
		  
		  3 constructor, float double satring as argument
		  
		  character class contain only one constructor, which can take only car argument
		 
		   
		    
		    
		 */
		String string = Integer.toString(10);
		
		@SuppressWarnings("removal")
		Integer I = new Integer(10);
		Integer I1 = new Integer("10");
				  
		Double d = new Double(5.7);
		Double d1 = new Double("10.7");
		
		Float f = new Float(4.5f);  
		Float f1 = new Float(4.5);
		Float f2 = new Float("4.5");
		
		Character ch = new Character('c');
//		Character ch = new Character("c");
		
		Boolean b1 = new Boolean(false);
		Boolean b2 = new Boolean("false");
		
		//if case , true, True, TRUE, then true
		Boolean x = new Boolean("yes");
		Boolean y = new Boolean("no");  //Boolean("true") then only true otherwise false
		System.out.println(x.equals(y));  //true, false, re, reexcption
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
				  
		

	}

}
