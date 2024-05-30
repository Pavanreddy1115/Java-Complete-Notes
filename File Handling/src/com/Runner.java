package com;
import java.io.File;
public class Runner {
	public static void main(String[] args) {
		File f = new File("d:/bike.xlsx");
		if(f.exists()) {
			f.delete();
			System.out.println("File/Folder Deleted Succesfully");
		}
		else {
			System.out.println("File/Folder Not Found");
		}
	}

}
