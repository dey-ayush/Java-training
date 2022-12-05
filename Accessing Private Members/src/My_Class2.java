class Outer_Demo{
	
	//private member of outer class
	private int num= 175;
	
	//inner class
	public class Inner_Demo{
		public int getNum() {
			System.out.print("This is the getNum method of inner class ");
			return num;
		}
	}
}

public class My_Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instantiating the outer class
		Outer_Demo outer= new Outer_Demo();
		
		//Instantiating inner class
		Outer_Demo.Inner_Demo inner= outer.new Inner_Demo();
		System.out.println(inner.getNum());
		
	}

}
