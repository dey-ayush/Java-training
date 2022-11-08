import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String to be scanned to find pattern.
		String line= "This order was places for QT3000! OK?";
		String pattern= "(.*)(\\d+)(.*)";
		
		//Create a pattern object
		Pattern r= Pattern.compile(pattern);
		
		//Now create matcher object.
		Matcher m= r.matcher(line);
		if(m.find()) {
			System.out.println("Found value "+ m.group(0));
			System.out.println("Found value "+ m.group(1));
			System.out.println("Found value "+ m.group(2));
		}else {
			System.out.println("NO MATCH");
		}

	}

}
