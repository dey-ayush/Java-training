import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadData_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fr= null;
		try {
			File file= new File("text.txt");
			fr= new FileReader(file);
			char[] a= new char[50];
			fr.read(a);					//reads content to array
			for(char c: a)
				System.out.print(c);	//prints character one by one
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
