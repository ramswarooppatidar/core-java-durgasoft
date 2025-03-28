package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class AccountCustomization2 implements Serializable{
	public static final int INT_VALUE=543678483;
	String userName;
	transient String password;
	transient int pin;
	
	//jvm call this method, internally, private method can't call programmer
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		//extra work
		String encryptedString = "123"+password;
		oos.writeObject(encryptedString);
		
		int epin = INT_VALUE + pin;
		oos.writeInt(epin);
	}
	
	//jvm call this method, internally
	private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException {
		is.defaultReadObject();
		//order should be maintain
		//extra work
		String decryptedString = (String) is.readObject();
		password = decryptedString.substring(3, decryptedString.length());
		
		int dpin = (int) is.readInt();
		pin = dpin - INT_VALUE;
		
	}
}
public class Customization_Part_4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		AccountCustomization2 a2 = new AccountCustomization2();
		a2.password="123Ram@123";
		a2.userName = "ramswaroop";
		a2.pin=10;
		
		FileOutputStream fos2 = new FileOutputStream("D:\\java\\Customization.txt");
		ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
		oos2.writeObject(a2);
		
		FileInputStream fis2 = new FileInputStream("D:\\java\\Customization.txt");
		ObjectInputStream ois2 = new ObjectInputStream(fis2);
		AccountCustomization2 account2 = (AccountCustomization2) ois2.readObject();
		System.out.println(account2.userName +" : "+account2.password+" : "+account2.pin);

	}

}
