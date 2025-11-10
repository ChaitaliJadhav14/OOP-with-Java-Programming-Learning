import java.util.Scanner;
public class studentmanagementapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Number of students"+Student.getCount());
		
		//1.create a reference of student type
//		Student s;
		//Student s1;
//		Scanner sc;
//		sc=new Scanner();
		//System.out.println("Before");
		//2.create object and assign to reference variable
		//s = new Student(105,"Chaitali",99.99f);
		//s1=new Student();
		
//		System.out.println(s);
//		System.out.println(s.rollNumber);
//		System.out.println(s.name);
//		System.out.println(s.marks);
		//s.display();
		//s.accept(101, "Rita", 88.98f);
		//s.display();
		//System.out.println();
		//s1.accept(102, "Neha", 99.78f);
		//s1.display();
		
		
//		s.rollNumber=-1; //to stop this we make sure rollnumber is not accessible outside the class
//		                 //in which it is declared
//		s.name="Rita";
//		s.marks=99.98f;
//		Student s2 = new Student(104,"Raksha",78.99f);
//		s2.display();
		
//		Student s1 =  new Student(1001,"Herat",98.89f);
//		s1.display();
//		s1.display("*");
		
		Student s3 = null;
		
		Student[] students = new Student[2];
		System.out.println(students[0]);
		System.out.println(students[1]);
		
		
		//built in class used to accept input from user
		Scanner sc = new Scanner(System.in);
		int choice=0;
		int indexCount = 0;
		do {
			System.out.println("Welcome to Student Management System");
			System.out.println("========================================");
			System.out.println("1.Register new Student");
			System.out.println("2.Display Student Details");
			System.out.println("-1.Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				
				if(indexCount <= students.length) {
//				students[indexCount]= new Student("Rita",68758);
//				indexCount++;
					System.out.println("Enter your name: ");
					String name = sc.next();
					
					System.out.println("Enter your marks: ");
					float marks = sc.nextFloat();
					
					students[indexCount]= new Student(name,marks);
   				    indexCount++;
				}
				else
				{
					System.err.println("Limit exceeded");
				}
				break;
			case 2:
				for(Student stu : students)
				{
					if(stu != null)
//						s3.display(); //to display all information without display method we can override the tostring method from Object class
						System.out.println(stu);   
				}
				
				break;
			case -1:
				System.out.println("Thank you visit again....");
			}
		}while(choice!=-1);
		
		
		
		
	}

}
