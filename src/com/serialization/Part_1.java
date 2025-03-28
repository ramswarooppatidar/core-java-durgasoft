package com.serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	String nameString;
	int id;
}
class Cat implements Serializable{
	String nameString;
	int id;
}
class Rat implements Serializable{
	String nameString;
	int id;
}
public class Part_1 {
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		/*
		 * serilization : the process of writing, set of state of object to an file, is called serilization
		 * but strictly speking it is a process of converting an object from java suported form into eithr file 
		 * supported form or network supported form
		 * 
		 * 
		 * FILE-OUTPUT-STREM / OBJECT OUTPUT-STREAM
		 * with the help of this clasess we can implement serilization
		 * file.txt, file.ser  any extension is applicable
		 * 
		 * FOS fos
		 * OOS oos = new OOS(fos)
		 * oos.writeObject()
		 * 
		 * 
		 * /DESERILIZATION
		 *  /FILE-INPUT-STREAM // OBJECT-INPUT -STEREM.READoBJECT()
		 * the process of reading object from the file is called dserilizartion, 
		 * but strictly spealing , it is proceess of converting a object from eithrt file supoorted form or
		 * network supported form into java suported form
		 * 
		 * FIS ios
		 * OIS ois = new OIS()
		 * ois.readObject()
		 * 
		 * 
		 * /SERILIZATIO//DESRILIZTION
		 * CLASS MUST IMPLEMETS SERILIZABLE, IF NOT THEN RUNTIMEEXCEPTIOM
		 * MARKER INTERFACE
		 *
		 */
		Dog dog = new Dog();
		dog.nameString = "dog";
		dog.id=100;
		
		Cat cat = new Cat();
		cat.id = 200;
		cat.nameString="Cat";
		
		Rat rat = new Rat();
		rat.id=300;
		rat.nameString = "Rat";
		
		FileOutputStream fos = new FileOutputStream("D:\\\\java\\\\serilizable3.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(dog);
		oos.writeObject(cat);
		oos.writeObject(rat);
		
		FileInputStream fis = new FileInputStream("D:\\\\java\\\\serilizable3.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try {
		    Object object;
		    while (true) { // Read until EOFException occurs
		        object = ois.readObject(); // Read object from the stream
		        if (object instanceof Dog) {
		            Dog d = (Dog) object;
		            System.out.println("dog: " + d.nameString + " " + d.id);
		        } else if (object instanceof Cat) {
		            Cat c = (Cat) object;
		            System.out.println("cat: " + c.nameString + " " + c.id);
		        } else if (object instanceof Rat) {
		            Rat r = (Rat) object;
		            System.out.println("rat: " + r.nameString + " " + r.id);
		        } else {
		            System.out.println("Unknown object type");
		        }
		    }
		} catch (EOFException e) {
		    System.out.println("End of file reached.");
		} catch (ClassNotFoundException | IOException e) {
		    e.printStackTrace();
		}

		
		
		
		
		
		
		Object object = null; // Initialize outside the loop

//		while ((object = ois.readObject()) != null) { // Read until end of stream
//		    if (object instanceof Dog) {
//		        Dog d = (Dog) object;
//		        System.out.println("dog :" + d.nameString + " " + d.id);
//		    } else if (object instanceof Cat) {
//		        Cat c = (Cat) object;
//		        System.out.println("cat :" + c.nameString + " " + c.id); // Add properties if Cat has them
//		    } else if (object instanceof Rat) {
//		        Rat r = (Rat) object;
//		        System.out.println("rat :" + r.nameString + " " + r.id); // Add properties if Rat has them
//		    } else {
//		        System.out.println("Unknown object type");
//		    }
//		}
//		// Handle EOFException (optional)
//		try {
//		    ois.close(); // Always close streams to release resources
//		} catch (IOException e) {
//		    e.printStackTrace(); // Log or handle the closing exception if needed
//		}

		
		
//		Object object = ois.readObject();
//		while(object != null) {
//			if(object instanceof Dog) {
//				Dog d = (Dog) object;
//				System.out.println("dog :"+d.nameString+" "+d.id);
//			}
//			else if(object instanceof Cat) {
//				System.out.println("cat :");
//			}
//			else if(object instanceof Rat) {
//				System.out.println("rat :");
//			}else {
//				System.out.println("noting");
//			}
//		}
		

	}

}
