//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//
//import org.aitycp.StudentManagementApplication.entity.Student;
//
//public class DemoSerialization {
//
//	public static void main(String[] args) {
//		FileOutputStream fos;
//		ObjectOutputStream oos = null;
//		try {
//			
//		 fos = new FileOutputStream("students.txt");
//		 oos = new ObjectOutputStream(fos); //by passing fos in the constructor ofObjectOutputStream
//		 
//		 Student s = new Student("Rita",99);
//		 oos.writeObject(s);
//		 
//		} catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//}
//
//
