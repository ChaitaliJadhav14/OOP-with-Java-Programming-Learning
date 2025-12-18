import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> students = new ArrayList<>();
		
		students.add("Chaitali");
		students.add("Sakshi");
		students.add("Shilpa");
		students.add("Mayur");
		students.add("Vishal");
		
		System.out.println("Student List: ");
		Iterator<String> itr = students.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		students.remove("Sakshi");
		
		String searchName = "Shilpa";
		if(students.contains(searchName)) {
			System.out.println(searchName + "found in the list.");
		}
		else {
			System.out.println(searchName + "not found in the list.");
		}
		
		System.out.println("\nStudent list after removal: ");
		itr = students.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
