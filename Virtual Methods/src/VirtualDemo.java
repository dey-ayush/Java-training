
public class VirtualDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salary s= new Salary("Rahul", "Noida, UP", 3, 4300.00);
		Employee e= new Salary("Anjali", "Chennai, TN", 2, 2600.00);
		
		System.out.println("Call mailCheck using Salary reference...");
		s.mailCheck();
		
		System.out.println("\nCall mailCheck using Employee reference...");
		e.mailCheck();

	}

}
