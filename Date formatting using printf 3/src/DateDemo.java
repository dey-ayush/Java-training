import java.util.Date;
public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instantiate a Date object
		Date date= new Date();
		
		//display formatted date and time
		System.out.printf("%s %tB %<td, %<tY", "Due date:", date);

	}

}
