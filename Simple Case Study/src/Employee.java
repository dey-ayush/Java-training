import java.io.*;
public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	
	//This is constructor of class Employee
	public Employee(String name) {
		this.name=name;
	}
	
	//Assign age of employee to the variable 'age'
	public void empAge(int empAge) {
		age=empAge;
	}
	
	//Assign designation to variable 'designation'
	public void empDesignation(String empDesig) {
		designation = empDesig;
		
	}
	
	//Assign salary to variable "salary"
	public void empSalary(double empSalary) {
		salary= empSalary;
	}
	
	//Print Employee details
	public void printEmployee() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Designation: "+designation);
		System.out.println("Salary: "+salary);
	}
}
