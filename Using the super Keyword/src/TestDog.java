class Animal{
	public void move() {
		System.out.println("Animals can move");
	}
}

class Dog extends Animal{
	public void move() {
		super.move();  					//invokes super class method
		System.out.println("Dogs can walk ad run.");
	}
}

public class TestDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal b= new Dog();			//Animal reference Dog object	
		b.move(); 						//runs method in Dog class

	}

}
