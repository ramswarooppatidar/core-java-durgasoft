package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable{
	int i =10;
}
class Dog3 extends Animal{
	int j = 20;
}
public class InheritanceInSerilization {

	/* parent class implement serilizable than automatically child class also serilizable,
	 * serilizable nature is inheritance from parent to child, hence
	 * if parent is serilizable then by default every child is serilizable
	 * */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Dog3 dog = new Dog3();
		System.out.println(dog.i +" ......."+dog.j);
		FileOutputStream fos = new FileOutputStream("D:\\java\\inheritance.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(dog);
		
		FileInputStream fis = new FileInputStream("D:\\java\\inheritance.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog3 dog2 = (Dog3) ois.readObject();
		System.out.println(dog2.i +" ......."+dog2.j);
		
		/*
		 * in above example dog class doent implement seriliza 
		 * 
		 * object class dosent implement serilizable interface
		 * 
		 * even though parent class doent implement serilizable, we can serilize chuld class object
		 * if child class implment seriazable intrege to serialize child class , parent class need not be serilizable*/

	}

}
