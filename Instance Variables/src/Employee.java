import java.io.*;
public class Employee {
	
	//This instance variable is visible to any child class
	public String name;

	//salary variable is visible to Employee class only
	private double salary;
	
	//name variable is assigned in constructor
	public Employee(String empName) {
		// TODO Auto-generated constructor stub
		name= empName;
	}
	
	//salary variable assigned a value
	public void setSalary(double empSal) {
		salary= empSal;
	}
	
	//This method prints the employee details
	public void printEmp() {
		System.out.println("name: "+name);
		System.out.println("salary: "+salary);
		
	}
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Employee empOne= new Employee("Rahul");
		empOne.setSalary(1962);
		empOne.printEmp();
	}
	
}
