package org.ycpait.studentmanagementapp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.ycpait.studentmanagementapp.entity.Student;
import org.ycpait.studentmanagementapp.exception.StudentNotFoundException;
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
		
		
//		Student[] students = new Student[2];
//		System.out.println(students[0]);
//		System.out.println(students[1]);
		
		List<Student> students = new ArrayList<Student>(); //day 7
		
		//built in class used to accept input from user
		Scanner sc = new Scanner(System.in);
		int choice=0;
		int indexCount = 0;
		do {
			System.out.println("Welcome to Student Management System");
			System.out.println("========================================");
			System.out.println("1.Register new Student");
			System.out.println("2.Display Details");
			System.out.println("3.Search Student by Roll Number");
			
			//day 7
			
			System.out.println("4.Delete Student by Roll Number");
			System.out.println("5.Sort Students by marks");
			System.out.println("6.Sort Students by name");
			//day7 end
			System.out.println("-1.Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				
				
//				students[indexCount]= new Student("Rita",68758); using hardcode and only single value take
//				indexCount++;

		     /* if(indexCount <= students.length) {
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
				
			*/
				
				//day 7
				System.out.println("Enter your name: ");
				String name = sc.next();
				
				System.out.println("Enter your marks: ");
				float marks = sc.nextFloat();
				
				Student s = new Student(name,marks);
				students.add(s);
				break;
				
			case 2:
				for(Student stu : students)
				{
					if(stu != null)
//						s3.display(); //to display all information without display method we can override the tostring method from Object class
						System.out.println(stu);   
				}
				break;
			
			case 3:
				System.out.println("Enter Roll Number");
				int r = sc.nextInt();
				
				boolean isFound = false;
				//searching student in array
				for(Student foundStudent : students) {
					if(foundStudent != null) {
						//if student roll from array is eq to accepted
						if(foundStudent.getRollNumber() == r) { //if getRollnumber method is not present then it need to create and generate getter
							System.out.println(foundStudent);
							isFound = true;
							break;
						}
						
					}
				}
			    try {
			    	if (!isFound) {
			        //generate exception
			    		StudentNotFoundException e =new StudentNotFoundException("Student with " + r + "Not found");
			    		throw e;
			    	}
			    }catch(StudentNotFoundException ex) {
					ex.printStackTrace();
				}
			    break;
			case 4:
				System.out.println("Enter roll number to delete");
				int rollNumberToDelete = sc.nextInt();
				Iterator<Student> i = students.iterator();
				
				while(i.hasNext()) {
					Student studentTobeDeleted = i.next();
			if(studentTobeDeleted.getRollNumber() == rollNumberToDelete)
				i.remove();
				}
				break;
			case 5:
				System.out.println("Sort students by marks");
				Collections.sort(students);
				
				for(Student stu : students) {
					System.out.println(stu);
				}
				break;
				
			case 6:
//				System.out.println("Sort Students by name");
//				Collections.sort(students,new Student("",0));  //if use this to line then need to add in student.java file "Comparator<Student>" and implement method or override compare method
				
				Collections.sort(students,(s1,s2)->s1.getName().compareTo(s2.getName()));  //if we use this then dont need change in student.java file
				for(Student stu : students) {
					if(stu != null)
						System.out.println(stu);
				}
				break;
				
			case -1:
					System.out.println("Thank you visit again....");
			
				}
			}while(choice!=-1);		
		
		}
	

}


