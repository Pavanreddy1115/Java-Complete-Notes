package org;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) throws Exception{
		File f = new File("jspiders.txt");
		
		
			FileWriter fw = new FileWriter(f,true);
			fw.write(" in jspiders");
			fw.flush();
			fw.close();
			System.out.println("data Stored ss");
		
		
	}

}
