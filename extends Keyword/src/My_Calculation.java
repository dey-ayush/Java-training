class Calculation{
	int z;
	
	public void addition(int x, int y) {
		z= x+y;
		System.out.println("Sum= "+z);
	}
	
	public void Subtraction(int x, int y) {
		z= x-y;
		System.out.println("Difference= "+z);
	}
}

public class My_Calculation extends Calculation {
	public void multiplication(int x, int y) {
		z=x*y;
		System.out.println("Product= "+z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20, b= 10;
		My_Calculation demo= new My_Calculation();
		demo.addition(a, b);
		demo.Subtraction(a, b);
		demo.multiplication(a, b);

	}

}
