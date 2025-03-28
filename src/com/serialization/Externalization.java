package com.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class ExternalizationDemo implements Externalizable{
	String string;
	int i ;
	int j;
	public ExternalizationDemo(String s, int i, int j) {
		this.string = s;
		this.i = i; 
		this.j = 8696;
	}
	//compulsory
	public ExternalizationDemo() {
		System.out.println("no arg constructor");
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(string);
		out.writeInt(i);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		this.string =	(String) in.readObject();
		this.i = in.readInt();
		
		
	}
	
}
public class Externalization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ExternalizationDemo obj = new ExternalizationDemo("ram", 10, 34562);
		
		FileOutputStream fos = new FileOutputStream("D:\\java\\externalizable.txt"); //externalizable
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
		FileInputStream fis = new FileInputStream("D:\\java\\externalizable.txt");//externalizable
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizationDemo obj2=	(ExternalizationDemo) ois.readObject();
		
		System.out.println(obj2.i+"  :"+obj2.j+"  :"+obj2.string);

	}
	/*if class implement serilizable then total object save to final, if class implement externalizable then only 
	 * required v
	 * varible save to file, in this case out is , public no arg constructor 
	 * 
	 * 
	 * Transient key word no required, no effect the externilization,
	 * */

}
