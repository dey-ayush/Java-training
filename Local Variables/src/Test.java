
public class Test {
	public void pupAge() {
		
		//age is a local variable and its scope is limited to this method only.
		
		int age=0;
		age=age+7;
		System.out.println("Pup age is: "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test= new Test();
		test.pupAge();

	}

}
