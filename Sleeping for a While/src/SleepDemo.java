import java.util.*;

public class SleepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(new Date() + "\n");
			Thread.sleep(5*60*10);
		}
		catch(Exception e) {
			System.out.println("Got Exception");
		}

	}

}
