import java.util.*;
public class GregorianCalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String months []= {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
							"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		
		int year;
		/* Create a Gregorian Calendar initialized with
		 * current date and time in the default locale
		 * and time zone.
		 */
		
		GregorianCalendar gcalendar= new GregorianCalendar();
		
		//Display current date and time information.
		System.out.print("Date: ");
		System.out.print(months[gcalendar.get(Calendar.MONTH)]);
		System.out.print(" "+ gcalendar.get(Calendar.DATE)+ " ");
		System.out.println(year= gcalendar.get(Calendar.YEAR));
		System.out.print("Time: ");
		System.out.print(gcalendar.get(Calendar.HOUR)+ " ");
		System.out.print(gcalendar.get(Calendar.MINUTE)+ " ");
		System.out.println(gcalendar.get(Calendar.SECOND)+ " ");
		
		//Test if the current year is a leap year
		if(gcalendar.isLeapYear(year)) {
			System.out.println("Leap Year");	
		}
		else {
			System.out.println("Not a Leap Year");
		}

	}

}
