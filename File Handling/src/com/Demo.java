package com;
import java.io.File;
public class Demo {
	public static void main(String[] args) {
		//Folder gets created within the project
	//	File f = new File("Student");
		
		//Folder gets created with the d drive
		File f = new File("d:/Car");
		 boolean result = f.mkdir();
		 System.out.println(result);
		
	}

}
