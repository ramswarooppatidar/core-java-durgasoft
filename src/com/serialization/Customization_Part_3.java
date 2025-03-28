package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{
	String userName;
	transient String password;
}
class AccountCustomization implements Serializable{
	String userName;
	transient String password;
	
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		//extra work
		String encryptedString = "123"+password;
		oos.writeObject(encryptedString);
	}
	
	private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException {
		is.defaultReadObject();
		//extra work
		String decryptedString = (String) is.readObject();
		password = decryptedString.substring(3, decryptedString.length());
		
	}
}
public class Customization_Part_3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*
		 * during default seri therre may be chance of loss of information bcz of trnsienet key word
		 *
		 * 
		 * , in the below example before serilization account can providde proper username and password
		 * but after deserilization account object can provi=de only username but not password, this is due to ransient key word
		 * (password variable transient)
		 * hence during during defualt serilization there may be a chance of loss of information, bcz of transient key word
		 * to recover this loss of information we shold so for custmized serilazation
		 * */
		Account a1 = new Account();
		a1.password="123Ram@123";
		a1.userName = "ramswaroop";
		
		FileOutputStream fos = new FileOutputStream("D:\\java\\Customization.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		FileInputStream fis = new FileInputStream("D:\\java\\Customization.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account account = (Account) ois.readObject();
		System.out.println(account.userName +" : "+account.password);
		
		//THOSE METHOD EXECUTED BY JVM AUTOMATICALLY IS CALLED CALL BACK METHOD
		
		
		/*we can implement customization serilization by using following twi methods
		 * 1  private void writeObject(ObjectWriteStream ows) throws exception{
		 * this method will be executed automatically at the time of serilization, hence 
		 * at the time of serilaization if we want to perfom any activity, we have to defined that
		 * in this method only,
		 * 
		 * 
		 * 2 private void readObject(ObjectInputSteam is) throws excption{
		 * this method will be executed automatically at the time of deseilization, hence 
		 * at the time of deseilization if we want to perfom any activity, we have to defined that
		 * in this method only,
		 * 
		 * 
		 * THE ABOVE METHODS ARE CALLBACK METHDS BCZ, THIS ARE EXECUTED AUTOMATICALLY BY JVM
		 * WHILE PERFOMR WHICH OBJECT SERILIZATION WE HAVE TO DO, EXTRA WORK IN THE CORROSPONDING CLASS
		 * WE HAVE TO DEFINED THE ABOVE METHODS
		 * EX : WHILE PERFORM ACCOUNT OBJECT SERLIZATION IF WE REQUIRED TO DO EXTRA WORK IN THE ACCOUNT 
		 * ACLASS WE HAVE TO DEFINED ABOVE METHODS
		 * */
		
		AccountCustomization a2 = new AccountCustomization();
		a2.password="123Ram@123";
		a2.userName = "ramswaroop";
		
		FileOutputStream fos2 = new FileOutputStream("D:\\java\\Customization.txt");
		ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
		oos2.writeObject(a2);
		
		FileInputStream fis2 = new FileInputStream("D:\\java\\Customization.txt");
		ObjectInputStream ois2 = new ObjectInputStream(fis2);
		AccountCustomization account2 = (AccountCustomization) ois2.readObject();
		System.out.println(account2.userName +" : "+account2.password);
		
		/*In the above problem before serilization and after serilization an account object can provide 
		 * proper username and passowrd
		 * NOTE : PROGRAMMER CAN'T CALL PRIVATE METHOD OUT SIDE FROM THE CLASS, JVM CALL PRIVATE METHOD ALSO
		 * PRIVATES METHOD DIRECTLY FROM OUT SIDE OF THE CLASS
		 * */
		
	}

}
