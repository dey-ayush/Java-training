class Super_class{
	int num= 20;
	
	//display method of superclass
	public void display() {
		System.out.println("This is the display method od Superclass.");
	}
}

public class Sub_class extends Super_class{
	int num= 10;
	
	//display method of subclass
	public void display() {
		System.out.println("This is the display method od Subclass.");
	}
	
	public void my_method() {
		//Instantiating subclass
		Sub_class sub= new Sub_class();
		
		//Invoking display() method of subclass
		sub.display();
		
		//Invoking display() method of superclass
		super.display();
		
		//Printing num of subclass
		System.out.println("Value of num in sublass: " +sub.num);
		
		//Printing num of superclass
		System.out.println("Value of num in superclass: " +super.num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sub_class obj= new Sub_class();
		obj.my_method();
	}

}
