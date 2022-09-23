import java.io.*;
public class EmployeeTest {
	
	public static void main(String args[]) {
		//Create two objects using constructor
		Employee empOne= new Employee("Kapoor Kall");
		Employee empTwo= new Employee("Paul Singh");
		
		//Invoking methods for each object created
		empOne.empAge(23);
		empOne.empDesignation("Assistant Proff.");
		empOne.empSalary(12000);
		empOne.printEmployee();
		
		empTwo.empAge(21);
		empTwo.empDesignation("Lab Incharge");
		empTwo.empSalary(8000);
		empTwo.printEmployee();
	}

}
