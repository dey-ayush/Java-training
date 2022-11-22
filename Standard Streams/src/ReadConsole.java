import java.io.*;
public class ReadConsole {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		InputStreamReader cin= null;
		
		try {
			cin= new InputStreamReader(System.in);
			System.out.println("Enter characetrs, 'q' for quit.");
			char c;
			do {
				c= (char) cin.read();
				System.out.print(c);
			}while(c != 'q');
		}finally {
			if(cin != null)
				cin.close();
		}
	}

}
