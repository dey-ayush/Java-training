import java.io.*;
public class Employee {
	
	//salary variable is private static variable
	private static double salary;
	
	//DEPARTMENT is constant
	public static final String DEPARTMENT="Development";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		salary=4000;
		System.out.println(DEPARTMENT+ " average salary: "+ salary);

	}

}
