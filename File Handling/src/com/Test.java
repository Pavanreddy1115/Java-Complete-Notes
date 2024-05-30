package com;
import java.io.File;
import java.io.IOException;
public class Test {
	public static void main(String[] args) {
		//.docx,xlsx,pdf
		File f = new File("d:/bike.xlsx");
		try {
			System.out.println(f.createNewFile());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
