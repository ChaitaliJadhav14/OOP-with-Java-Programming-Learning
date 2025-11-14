package org.aitycp.StudentManagementApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import org.aitycp.StudentManagementApplication.entity.Student;
import org.aitycp.StudentManagementApplication.exception.StudentNotFoundException;
import org.aitycp.Studentmanagementapp.dao.impl.StudentDaoImpl;

public class StudentManagementApplication {

	public static void main(String[] args) {

		System.out.println("Number of students" + Student.getCount());

		//List<Student> students = new ArrayList<Student>();
		
		StudentDaoImpl dao = new StudentDaoImpl();
		

		Scanner sc = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println();
			System.out.println("========================");
			System.out.println("1.Create a Employee");
			System.out.println("2.Display Emplyees");
			System.out.println("3.Search Student by rollno");
			System.out.println("4.Delete Student by rollno");
			System.out.println("5.Sort Students by marks");
			System.out.println("6.Sort by names");
			System.out.println("7.Who scored > 90");
			System.out.println("8.only name who scored > 90");
			System.out.println("-1.Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();

			//to be able to find students who have scored more than 90
			
			switch (choice) {
			case 1:
				System.out.println("Enter your name");
				String name = sc.next();

				System.out.println("Enter your marks");
				float marks = sc.nextFloat();

				List<String> subjects = new ArrayList<String>();
				subjects.add("Java");
				subjects.add("Spring");
				Student s = new Student(name, marks,subjects);
				//students.add(s);
				dao.save(s);

				break;

			case 2:
				for (Student stu : dao.findAll()) {
					if (stu != null)
						System.out.println(stu);
				}

				// System.out.println(s);
				break;

			case 3:
				System.out.println("Enter the roll no");
				int r = sc.nextInt();
				
				try {
					Student searchedStudent = dao.findOne(r);
					System.out.println(searchedStudent);
				}catch(StudentNotFoundException e) {
					e.printStackTrace();
				}
				
				break;
			case 4:
				System.out.print("Enter roll number to delete: ");
				int deleteroll = sc.nextInt();
				try {
					Student deleteStudent = dao.deleteOne(deleteroll);
					System.out.println(deleteStudent);
				}catch(StudentNotFoundException e) {
					e.printStackTrace();
				}

				
				break;
			case 5:
				System.out.println("Sort students by marks");
				//dao.sortbyMarks();
				Collections.sort(dao.findAll());
				
				for (Student stu : dao.findAll()) {
			        System.out.println(stu);
			    }
				break;
			case 6:
				//dao.sortbynames();
				Collections.sort(dao.findAll(),
						(s1,s2) ->s1.getName().compareTo(s2.getName()));
				
				for (Student stu : dao.findAll()) {
			        System.out.println(stu);
			    }
				
			case 7:
				//dao.scoredgreaterthan90();
				Stream<Student> streamMarks = dao.findAll().stream();
				streamMarks = dao.findAll().stream();
				  Stream<Student> filteredStreamMarks = streamMarks.filter(c -> c.getMarks()>=90);
				  List<Student> li1 = filteredStreamMarks.toList();
				  System.out.println(li1);
				  break;
				
			case 8:
				//dao.scoredbyNames();
				Stream<Student> streamMarks1 = dao.findAll().stream();
				streamMarks1 = dao.findAll().stream();
				  Stream<String> filteredStreamMarks1 = streamMarks1.filter(c -> c.getMarks()>=90).map(c -> c.getName());
				  List<String> li2 = filteredStreamMarks1.toList();
				  System.out.println(li2);
				  
//				  List<String> topScoringStidentsNames = students.stream()
//						  .filter(c -> c.getMarks()>=90)
//						  .map(c -> c.getName())
//						  .toList();
//    topScoringStidentsNames.forEach(n -> System.out.println(n));
           break;

			case -1:
				System.out.println("Thank you");
			}
			System.out.println("Number of students" + Student.getCount());
		} while (choice > 0);

	}

}
