
public class Puppy {
	int puppyAge;
	
	public Puppy(String name) {
		//This constructor has one parameter; name
		System.out.println("Name chose is: "+ name);
		
	}
	
	public void setAge(int age) {
		puppyAge=age;
	}
	
	public int getAge() {
		System.out.println("Puppy's age is: "+ puppyAge);
		return puppyAge;
	}
	
	public static void main(String []args) {
		//Object creation
		Puppy myPuppy= new Puppy("tommy");
		
		//Calls class method to set puppy's age
		myPuppy.setAge(2);
		
		//Calls another class method to get puppy's age
		myPuppy.getAge();
		
		//You can access instance variables as follows as well:
		System.out.println("Variable value: "+ myPuppy.puppyAge);
		
	}
}
