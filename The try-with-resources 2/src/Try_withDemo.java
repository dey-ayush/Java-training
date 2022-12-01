import java.io.FileReader;
import java.io.IOException;

public class Try_withDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileReader fr= new FileReader("text.txt")){
			char[] a= new char[50];
			fr.read(a);					//reads content to array
			for(char c: a)
				System.out.print(c);	//prints character one by one
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
