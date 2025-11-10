package studentmanagementpp;

public class StudentManagementApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.create a reference of Student type
		
//		
		System.out.println("Number of students registered are : "+ Student.getCount());
		
		//2.Cretae object and assign to reference variable
		Student s =new Student(2,"Vishal",67.98f);
		System.out.println(s);
		
//		System.out.println(s.rollNumber);
//		System.out.println(s.name);
//		System.out.println(s.marks);
		
		//s.rollNumber = -1;//to stop this we make sure rollNumber is NOT accessible outside the class in which it is declared
//		s.name = "Chaitali";
//		s.marks = 88.89f;
		
		
		s.display();
		s.accept(1, "Chaitali", 88.98f);
		s.display();//invoking display() method
		
		Student s2 = new Student(3,"prachi",78.87f);
		s2.accept(2, "Rita", 99.99f);
		s2.display();//invoking display() method
		
		Student s3 = new Student(4,"Sakshi",87.87f);
		s3.display("*");
		
		System.out.println("Number of students registered are : "+ Student.getCount());
		System.out.println("Number of students registered are : "+ s2.getCount());
		
		
		
		
		
		

	}

}
