package storingobjects;

public class StudentMainClass {
	public static void main(String[] args) {
		Student s1 = new Student(21,"pavan");
		Student s2 = new Student(22,"pvan");
		Student s3 = new Student(23,"pdnfjnv");
		 Student[] std = {s1,s2,s3};
		 
		 for(int i=0;i<std.length;i++)
		 {
			 System.out.println("Age :"+std[i].age+" "+"Name :"+std[i].name);
		 }
		
		
		
	}

}
