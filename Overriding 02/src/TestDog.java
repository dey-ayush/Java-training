class Animal{
	public void move() {
		System.out.println("Animals can move");
	}
}

class Dog extends Animal{
	public void move() {
		System.out.println("Dogs can walk ad run.");
	}
	
	public void bark() {
		System.out.println("Dogs can bark");
	}
}

public class TestDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a= new Animal();			//Animal reference and object
		Animal b= new Dog();			//Animal reference Dog object
		
		a.move(); 						//runs method in Animal class
		b.move();						//runs method in Dog class
		b.bark();

	}

}
