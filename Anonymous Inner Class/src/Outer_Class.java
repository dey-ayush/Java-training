abstract class Anonymous_Inner{
	public abstract void myMethod();
}

public class Outer_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Anonymous_Inner inner= new Anonymous_Inner() {
			public void myMethod() {
				System.out.println("This is an example of anonymous inner class");
			}
		};
		inner.myMethod();

	}

}
