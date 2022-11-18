
public class This_Example {
	//Instance variable
	int num=10;
	
	This_Example(){
		System.out.println("This is and example of keyword this.");
	}

	This_Example(int num){
		//Invoking the default constructor
		this();
		
		//Assigning local variable num to instance variable num
		this.num=num;
	}
	
	public void greet() {
		System.out.println("Hello! Welcome.");
	}
	
	public void print() {
		//Local variable num
		int num=20;
		
		//Printing the local variable
		System.out.println("Value of local var num:"+ num);
		
		//Printing the instance variable
		System.out.println("Value of instance var num: "+ this.num);
		
		//Invoking the greet method of a class
		this.greet();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instantiating the class
		This_Example obj1= new This_Example();
		
		//Invoking the print method
		obj1.print();
		
		//Passing a new value to the num variable through parameterized constructor
		This_Example obj2= new This_Example(30);
		
		//Invoking the print method again
		obj2.print();

	}

}
