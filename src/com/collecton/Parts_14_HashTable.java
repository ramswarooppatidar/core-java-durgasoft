package com.collecton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Properties;

class Temp1{
	int i;
	public Temp1(int i) {
		this.i = i;
	}
	public int hashCode() {
//		return i;
		return i % 9;
	}
	public String toString() {
		return i+" ";
	}
}
public class Parts_14_HashTable {

	public static void main(String[] args) throws IOException {
		Hashtable table = new Hashtable();
		table.put(new Temp1(5), "A");
		table.put(new Temp1(2), "B");
		table.put(new Temp1(6), "C");
		table.put(new Temp1(15), "D");
		table.put(new Temp1(23), "E");
		table.put(new Temp1(16), "F");
//		table.put(new Temp1(16), null);
//		table.put(null, "F");
		System.out.println(table);
		
		//order of insertion top to bottom 10 to 0 index , right to left is multiple entry at same index
		
		
		
		//PROPERTIES
		Properties p1 = new Properties();
//		FileInputStream fis = new FileInputStream("D:\eclips\Java_\src\com\collecton/Parts_14.properties");  // \src\com\collecton\Parts_14.properties
//		FileInputStream fis = new FileInputStream("D:\\eclips\\Java_\\src\\com\\collecton\\Parts_14.properties");
		FileInputStream fis = new FileInputStream("D:\\eclips\\Java_\\src\\com\\collecton\\Parts_14.properties");

		p1.load(fis);  //dump file into p1
		System.out.println(p1);
		String string = p1.getProperty("ram");
		System.out.println(string);
		p1.setProperty("port", "123456");
		
		System.out.println(p1.getProperty("port"));
		
		FileOutputStream fos = new FileOutputStream("D:\\eclips\\Java_\\src\\com\\collecton\\Parts_14.properties");
		p1.store(fos, "Ramswaroop Patidar change update the files");
		
		//example 2
		Properties p2 = new Properties();
		FileInputStream fis1 = new FileInputStream("D:\\eclips\\Java_\\src\\com\\collecton\\Parts_14.properties");
		p2.load(fis1);
		String urlString = p2.getProperty("Url");
		String passwordString = p2.getProperty("password");
		String userNameString = p2.getProperty("username");
		try {
			Connection connection = DriverManager.getConnection(urlString, passwordString, userNameString);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
/*
   HASH-TABLE :
  
   1) the underline data structure for hashtable is hashtable
   2) insertion order is not preserved and it is based on hashcode of key
   3) dublicats key are not allowed and value can be dublicated
   4) hetrogenious object are allowed for both keys and value
   5) nulll is not allowed for both key and value otherwise we get runtime excepton saying: NULPOINER EXCEPTION
   6) it implement serilizable and clonable insterface but not rendomacess
   7) every method present in has table is synchronized and hence hash table object is thread safe
   8) it is best choice if our freqent operation is serach opertion
   
   CONSTRUCTION :
   
   Hashtable hashtable = new Hashtable();  
   Capacity 11 and fill factor 0.75
   
   Hashtable hashtable = new Hashtable(int initialCapacity);
    
   Hashtable hashtable = new Hashtable(int initialCapacity, float fillRation);
    
   Hashtable hashtable = new Hashtable(Map map);
   
   
   if we change hashcode method of temp class , and initial capacity 25, out put and insrtion orde change
   
   
   PROPERTIES :
   
   IN our peogram if any thing which changes frequently( like username, password, emailid, mobilenumber etc)
   are not recommented to hard code in java program because if there is any change , to reflect that change
   recomepilaton, rebuild, and redeploy application is required, even sometime server restart also required,
   which create big bussiness impact to the client,
   
   we can overcome this problem by using properties file, such type of variable things we have to configure
   in the properties files from that properties file we have to read those properties, the main advantage 
   of this approch is, if there is change in priperties fiel, to reflect that change just redeployment is
   enough which want create any bussiness impact to the client
   
   we can use java properties object to hold properties which are comming from properties file,
   i\
   in noram map hashmap, hashtable key and value can be any type but in tha case of properties key and value
   should be string type
   
   CONSTRUCTOR :
   Properties p = new Properties()
   
   METHODS :
   String setProperties(String propertyName, String vale);
   if specified properties already available then old value replaced with new value and returns old value
   
   String getPropeties(String propName);
   
   Enumeration PropertyNames();
   return all properties name present in properties objet
   
   void load(); 
   to load properties from properties file into java class
   
   void store();
   to stored propeties from properties object to pro  file
   
   
 */
