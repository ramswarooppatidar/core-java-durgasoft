package com.interfaces;

interface Part_2_If {
	  void m1();
	  int x=10;
//	  int y ;
	  
	}
/*
 * Every method in interface is always public and abstrct, whetere we are declred or not
 * Public : to make this method is availbe to evry implementaion clss
 * abstract : implement clas is respnsibe to provide implementation
 * Hence insid e interfcae the following method declartion is eqaul
 * void m1()
 * public void m1()
 * abstract void m1()
 * public abstarct void m1()
 * as evry interfce method always pu and ab we cant declear  method with the following modifiers
 * private, protected, static , final, synchronize,native
 * 
 * which of the foloowing method declartion allowed inside interface
 */


/*
 *  INTERFACE VARIABLE
 *  an interface can conatin varibles the main purpose of intrface varible is to define requirment level constants
 *  
 *  every interface is always, public static final PUBLIC STATIC FINAL, whether we are decalring or not
 *  public : to make this variable is availbe to implement class
 *  static : without existing object, also implementation class can access the varible
 *  final : if one implement class change the value then remaing imp class other class is affected
 *  
 *  hence within the interface following varivble declartion is equal
 *  int x=10;
 *  public int x =10
 *  static int x = 10;
 *  public static x =10;
 *  public final x = 10;
 *  public static final x=10;
 *  
 *  as evry if varible is always public static final we cant declear with the fo;;owing modifiers
 *  private
 *  protected,
 *  volatile,
 *  transient -->  for object serilization and static is class level
 *  
 *  for if varibale compulsary we should perform initilization at the time declartion , other wise 
 *  we will get , compile time error
 *     
 */

// INTERFACE NAMING CONFLICT

/* 
 * CASE 1:
 * if two interface conatin a method with same signature and same retun type, then in the iplementation class
 * we have to provide impletaion for only one method
 * ex 1
 *  If1{ 
 *  void m1()
 *   }
 *   
 *   if2{
 *   void m1()
 *   }
 *   class a impl if1, if2{
 *    void m()
 *    }
 *    
 *  Case 2 : if two interfaces conatin a method with same name, but diffrent arg types then in the implemention class
 *  we have to provide implemention, for both methods and this method access overloaded methods,
 *  ex :
 *  ex 1
 *  If1{ 
 *   void m1()
 *   }
 *   
 *   if2{
 *   void m1(int i)
 *   }
 *   class a impl if1, if2{
 *    public void m()
 *    }
 *    public void m1(int i){}
 *    
 *   case 3 : 
 *   if two inteface conatins a method with same signature but different return types, then
 *   it is impossible to implements both interface simulatanitionly, 
 *   If return type are NOT covarient,
 *   we cant write any java class which implements both interface simulataniuosly
 *    Interface left{
 *     void m1();
 *    
 *    }
 *    Interface right{
 *      int m1();
 *     }
 *      class test implemnts left, right{
 *        public void m1(){}
 *        public int m1(){}  // error  method with same signature cannot overloading
 *      }
 *     abstarct class test implemnts left, right{
 *        public void m1(){}
 *       // public int m1(){}  // error  method with same signature cannot overloading
 *      }
 *      
 *      class test2 extends test{
 *        public int m1(){   // wrong bcz  void and int not coverient return type
 *         return 0;
 *         }
 *    
 *    is a java class can implemets anay number of interface simulatatiously?
 *    yes except a perticular case , 
 *    if two interface conatins a method with same signature but different return types,
 *    then it is impossible to implemts both interface simulatniously
 */


/*
 *   INTERFACE  VARIABLE CONFLICT
 *   Two interfaces can conatin a varible with the same name and there may be a chance of variable naming conflicts
 *   but we can solve this problems, by using interface names
 *   Interface left{
 *     int x = 10;
 *    
 *    }
 *    Interface right{
 *      int x = 20
 *     }
 *     class test implements left, right{
 *       p s v m(String srg[]){
 *         sysout(x)  // ambigutie proble,
 *         syspur(left.x)
 *         syout(right.x)
 *       }
 *   	}
 */
