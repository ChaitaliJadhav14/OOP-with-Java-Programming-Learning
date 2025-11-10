import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Step 1: Open the source file for reading
            fis = new FileInputStream("readme.txt");
            System.out.println("File Found");
            // Step 2: Create destination file for writing
            fos = new FileOutputStream("creadme.txt");

            int data = fis.read();
            while (data != -1) { 
                fos.write(data); // write data byte-by-byte
                data = fis.read();
            }


        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        	e.printStackTrace();
        } finally {
            // Step 3: Close resources safely
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
//here we copy data from readme file to creadme file