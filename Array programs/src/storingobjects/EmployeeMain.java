package storingobjects;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e1 = new Employee(100,"Tom");
		Employee e2 = new Employee(200,"Alex");
		Employee e3 = new Employee(300,"Smith");
		
		Employee[] emp = {e1,e2,e3};
		for(int i = 0;i<emp.length;i++)
		{
			System.out.println("Emp Id of "+emp[i].name+" is "+emp[i].id);
		}
		
		
	}

}
