
public class MammalInt {
	
	public void eat() {
		System.out.println("Mammal eats");
	}
	
	public void travel() {
		System.out.println("Mammal travels");
	}
	
	public int noOfLegs() {
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MammalInt m= new MammalInt();
		m.eat();
		m.travel();

	}

}
