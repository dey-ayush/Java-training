
public class SwappingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=30;
		int b=45;
		System.out.println("Before swapping, a= "+a + " and b= "+b);
		
		//Invoking the swap method
		swapFunction(a, b);
		System.out.println("\nNow, Before and After swapping values will be same here: ");
		System.out.println("After swapping, a= "+a + " and b= "+b);

	}
	
	public static void swapFunction(int a, int b) {
		System.out.println("Before swapping (Inside), a= "+a + " and b= "+b);
		
		//Swap a and b:
		int c= a;
		a=b;
		b=c;
		System.out.println("After swapping(Inside), a= "+a + " and b= "+b);
	}

}
