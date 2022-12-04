class Outer_Demo{
	int num;
	
	//inner class
	private class Inner_Demo{
		public void print() {
			System.out.println("This is inner class");
		}
	}
	
	//Accessing inner class from the method within
	void display_Inner() {
		Inner_Demo inner= new Inner_Demo();
		inner.print();
	}
}

public class My_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instantiating the outer class
		Outer_Demo outer= new Outer_Demo();
		//Accessing display_Inner() method
		outer.display_Inner();

	}

}
