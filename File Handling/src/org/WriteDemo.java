package org;
import java.io.*;
public class WriteDemo {
	public static void main(String[] args) {
		File f = new File("Student.java");
		
		try {
			FileWriter fw = new FileWriter(f);
			fw.write("Jspiders!");
			fw.flush();
			fw.close();
			System.out.println("Data Stored");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
