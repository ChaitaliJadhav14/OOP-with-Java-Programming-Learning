import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "employee.txt";
		try {
			FileWriter fw = new FileWriter(filename);
			
			fw.write("1,Chaitali,Developer\n");
			fw.write("2,Sakshi,Tester\n");
			fw.write("3,Shradha,Manager\n");
			fw.write("4,Rita,HR\n");
			fw.write("5,Hritik,Support\n");
			
			fw.close();
			System.out.println("Employee Records written to file.");
			
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			System.out.println("\nEmployee Records from file:");
			while((line=br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			fr.close();
		}catch(IOException e) {
			System.out.println("File error occurred :" + e.getMessage());
		}

	}

}
