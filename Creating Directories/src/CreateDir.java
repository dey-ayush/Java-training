import java.io.File;
public class CreateDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dirname= "/tmp/user/java/bin";
		File d= new File(dirname);
		
		//Create directory now
		d.mkdirs();

	}

}
