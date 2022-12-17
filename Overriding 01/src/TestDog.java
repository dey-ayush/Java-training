class Animal{
	public void move() {
		System.out.println("Animals can move");
	}
}

class Dog extends Animal{
	public void move() {
		System.out.println("Dogs can walk and run");
	}
}

public class TestDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a= new Animal();		//Animal reference and object
		Animal b= new Dog();
		
		a.move();		//runs method in Animal class
		b.move();		//runs method in Dog class
	}

}
