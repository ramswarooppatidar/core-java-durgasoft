package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Part2<T> {
	 T ob;
	 public Part2(T ob) {
		// TODO Auto-generated constructor stub
		 this.ob = ob;
	}
	 public void show() {
		 System.out.println("the type of object is : "+ob.getClass().getName());
	 }
	 public T getOb() {
		 return ob;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * to ols only string type of objects we can create, generic version of arraylist object,
		 * for this arraylist we can add only string type objetc, if we add other type we will get
		 * compile time error
		 */
		ArrayList<String> list = new ArrayList<>();
		list.add("ram");
		list.add("shyam");
//		String sfgString = list.get(0); //with generic , no need type causting
		
		/*
		 * hence through generic we can solve type casting problems
		 */
		
		//conclion 1
		/*
		 * polymorphisum concept is applicable for base type not for permater type;
		 * (uses of parent refernce to hold child object is a concept of polymorphisum)
		 */
		ArrayList<String> list2 = new ArrayList<String>();
		List<String> list3 = new ArrayList<>();
		Collection<String> liStrings = new ArrayList<String>();
		
//		Collection<Object> lCollection = new ArrayList<String>(); //conclusion 1
		//
		//conclusion 2
		/*
		 * fir the type perameter we can provide any classandinterface name but not primitives 
		 * if we are tyring to provide premittive then we will get compile type error
		 * List<int> list3 = new ArrayList<>();
		 */
		
		//until 1.4 version an non generic vrsion of arraylist class as follow
		/*
		 * class al{
		 *  add(Object o)
		 *  Object get(int index)
		 * }
		 * 
		 * the argument to add methos is object, and hence we can add anytype of object to the arraylist
		 * due to this, we are missing type sefty, 
		 * 
		 * the retun type of get methos is object, hence at the time of retrive we have to perform 
		 * type casting
		 * 
		 *  in 1.5 version, T = type peramter
		 *  but in 1.5 version a generic version of arraylist class is declered as follows,
		 *  class al<T>{
		 *   add(T t)
		 *   T get(int index)
		 *  }
		 *  
		 *  based on runtype reuired t will be replace by over provide value, to hold only string type of 
		 *  objects, a generic version of arraylist object canbe createe as follows
		 *  al<tring> l = new AL<Strng>
		 *  )
		 *   l.get(0) type casting not required bcz l is strig type;
		 *   
		 *   in generic we are assositing a type peramte to the clss such type fo peramter riased class
		 *   are noting but generics classes, or temlate classes,
		 *   
		 *   based on over reqiremnt we can defined our ow generic classes also;
		 *   class Account<T>{
		 *   }
		 *   Account<Gold> g = new Account<Gold>();
		 *  
		 * 
		 */
		Part2<Integer> object = new Part2<Integer>(12);
		object.show();
		System.out.println(object.getOb());
		
		Part2<Double> object1 = new Part2<>(12.5);
		object1.show();
		System.out.println(object1.getOb());
		

	}

}
