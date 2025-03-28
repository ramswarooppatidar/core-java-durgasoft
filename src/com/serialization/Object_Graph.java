package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//import org.jcp.xml.dsig.internal.dom.DOMPGPData;

class Dog1 implements Serializable{
	Cat1 cat = new Cat1();
}
class Cat1 implements Serializable{
	Rat1 rat = new Rat1();
}
class Rat1 implements Serializable{
	int j = 20;
}
public class Object_Graph {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		/*whener we serilzing object , the set of all object which are, rechable from that object
		 * we be serialized automatically, this group of object is nothing but object graph
		 * in object grph every object should be , serilizable , effectly is not seriazble then
		 * we will get run time exception saying not serializane
		 * */
		Dog1 d1 = new Dog1();
		FileOutputStream fos = new FileOutputStream("D:\\java\\objectGraph.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis = new FileInputStream("D:\\java\\objectGraph.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog1 dog = (Dog1) ois.readObject();
		
		System.out.println(dog.cat.rat.j);

	}

}
