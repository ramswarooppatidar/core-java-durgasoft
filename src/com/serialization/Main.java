package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setId(0);
		employee.setName("ramswaroop");
		employee.setIgnoreSerializString("transient");
		employee.setNotBelongsToObjectString("static ");
		
		
			FileOutputStream fileOutputStream = new FileOutputStream("D:\\java\\serilizable3.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
			objectOutputStream.writeObject(employee);
			objectOutputStream.close();
			fileOutputStream.close();
			
			//deserilized
			FileInputStream fileInputStream = new FileInputStream("D:\\\\java\\\\serilizable3.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Employee readEmployee = null;
			try {
				readEmployee = (Employee) objectInputStream.readObject();
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(readEmployee);
			fileInputStream.close();
			objectInputStream.close();
		

	}

}
