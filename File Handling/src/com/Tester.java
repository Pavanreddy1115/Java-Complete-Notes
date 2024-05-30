package com;

import java.io.File;

public class Tester {
      public static void main(String[] args) {
		File f = new File("Student");
		File f1 = new File("Employee");
		System.out.println(f.renameTo(f1));
		
	}

}
