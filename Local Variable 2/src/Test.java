
public class Test {
	public void pupAge() {
		
		//This program will show error as we're using age without initializing it.
		int age;
		age=age+7;
		System.out.println("Pup age is: "+age );
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test= new Test();
		test.pupAge();

	}

}
