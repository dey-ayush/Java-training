import java.util.*;
import java.text.*;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dNow= new Date();
		SimpleDateFormat ft= new SimpleDateFormat("E yyyy.MM.dd 'at' hh.mm.ss a zzz");
		
		System.out.println("Current date: "+ ft.format(dNow));

	}

}
