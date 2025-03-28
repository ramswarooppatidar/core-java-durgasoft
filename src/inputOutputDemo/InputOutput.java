package inputOutputDemo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
//import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import  java.util.Map.*;
//import java.sql.Time;

public class InputOutput {

	public static  void writeToFile(File writeToFile) throws FileNotFoundException {
		long start = System.currentTimeMillis();
		PrintWriter printWriter = null;
		try {
		    printWriter = new PrintWriter(writeToFile);
			printWriter.println("Table 1 to 10");
			
			for(int i = 1; i<=5; i++) {
				for(int j = 1; j<=10; j++) {
					printWriter.print(j*i+"       ");
				}
				printWriter.println();
				printWriter.println();
				
			}
		
			
			System.out.println("this is executed");
		}catch(FileNotFoundException e) {
			System.out.println("file is not availble");
			throw new RuntimeException(e);
		}finally{
			long end = System.currentTimeMillis();
			
			System.out.println("total time taken to execute the code "+ (end - start));
//			printWriter.close();
			printWriter.flush();

		}
	}
	public static void readFile(File readFile) throws FileNotFoundException {
		Scanner input = new Scanner(readFile);
		while(input.hasNext()) {
			System.out.println(input.nextLine());
		}
		
	}
	
	
	
	
	
	
	public static  HashMap<Character, Integer> lastIndex(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i =0; i<str.length(); i++) {
//
			if(map.containsKey(str.charAt(i))) {
				int val = map.get(str.charAt(i));
				map.put(str.charAt(i), val+1);
			}else {
				map.put(str.charAt(i), 1);
			}		
		}
		return map;
		
	}

	public static void main(String[] args) throws FileNotFoundException {
	
		
		HashMap<Character, Integer> map = lastIndex("abcbcd");
		for(Character entry : map.keySet()) {
			System.out.println("key "+entry+" value :"+map.get(entry));
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println("key entry "+ entry.getKey()+" value entry :"+entry.getValue());
		}
		System.out.println(map);
		for(java.util.Map.Entry<Character, Integer> res : map.entrySet()) {
			if(res.getValue()>1) {
				System.out.println("key :"+res.getKey()+" value "+res.getValue());
			}
			
		}

	}

}
