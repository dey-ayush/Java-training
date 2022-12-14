class Superclass{
	int age;
	
	Superclass(int age){
		this.age=age;
	}
	
	public void getAge() {
		System.out.println("Value of age in superclass: "+age);
	}
}

public class Subclass extends Superclass{

	Subclass(int age) {
		// TODO Auto-generated constructor stub
		super(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subclass s= new Subclass(24);
		s.getAge();

	}

}
