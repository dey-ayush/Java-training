
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char grade='B';
		
		switch(grade) {
			case 'A':
				System.out.println("Excellent");
				break;
			case 'B':
			case 'C':
				System.out.println("Well Done"); break;
			case 'D':
				System.out.println("You Passed");
			case 'F':
				System.out.println("Better try again");
				break;
			default:
				System.out.println("Invalid grade");
				
		}
		
		System.out.println("Your grade is: "+ grade);
		
	}

}
