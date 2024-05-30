package com;
import java.io.File;
import java.util.Date;
public class LastModified {
	public static void main(String[] args) {
		File f = new File("d:/bike.txt");
		long milliSeconds = f.lastModified();
		Date d = new Date(milliSeconds);
		System.out.println(d);
		System.out.println("-------------------");
		
		File f1 = new File("d:/bike.txt");
		Date d1 = new Date(f1.lastModified());
		System.out.println(d1);
		System.out.println("-----------------");
		
		File f3 = new File("d:/bike.txt");
		System.out.println(new Date(f1.lastModified()));
		
	}

}
