import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoFileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("readme.txt");
			System.out.println("File Found");
			int data = fis.read();//this exception throw by read
//			System.out.println((char)data);  //if here we write only this without while the it return the outout "file found and T"
			while(data != -1) {
				System.out.print((char)data);
				data = fis.read();
			}
			fis.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
