import java.io.File;
public class ReadDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file= null;
		String[] paths;
		
		try {
			//Create new file object
			file= new File("/tmp");
			
			//array of files and directories
			paths= file.list();
			
			//for each name in the path array
			for(String path: paths) {
				//prints filename and directory name
				System.out.println(path);
			}
		}catch(Exception e) {
			//if any error occurs
			e.printStackTrace();
		}

	}

}
