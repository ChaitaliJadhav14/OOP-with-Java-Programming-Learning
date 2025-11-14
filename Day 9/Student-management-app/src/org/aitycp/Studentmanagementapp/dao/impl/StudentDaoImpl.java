package org.aitycp.Studentmanagementapp.dao.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import org.aitycp.StudentManagementApplication.entity.Student;
import org.aitycp.StudentManagementApplication.exception.StudentNotFoundException;

public class StudentDaoImpl {
	
	private List<Student> students;
	
	public StudentDaoImpl() {
		this.students = new ArrayList<Student>();
	}
	
	public void save(Student s) {
		this.students.add(s);
	}
	
	public List<Student> findAll(){
		return students;
	}
	
	public Student findOne(int rollNumber) throws StudentNotFoundException {

		// searching student in an array
//		for (Student foundStudent : students) {
//			if (foundStudent != null) {
//				// if student roll from array is equal to accepted
//				if (foundStudent.getRollNumber() == rollNumber) {
//					System.out.println(foundStudent);
//					return foundStudent;
//				}
//			}
//		}
				// generate exception
		StudentNotFoundException e = new StudentNotFoundException("Student with " + rollNumber + " Not found");
		//throw e;
		
		return this.students.stream()
				   .filter(s -> s.getRollNumber() == rollNumber)
				   .findFirst()
				   .orElseThrow(() -> e);
		
	}
	public Student deleteOne(int deleteroll) {
		Iterator<Student> i = students.iterator();
		while (i.hasNext()) {
			Student student = i.next();
			if (student.getRollNumber() == deleteroll) {
				i.remove();
				return student;
			}
		}
		StudentNotFoundException e = new StudentNotFoundException("Student with " + deleteroll + " Not found");
		throw e;
	}
//	public List<Student> sortbyMarks()
//	{
//		Collections.sort(students);
//		
//		for (Student stu : students) {
//	        System.out.println(stu);
//	    }
//		return  students;
//	}
	
//	public List<Student> sortbynames(){
//		Collections.sort(students,
//				(s1,s2) ->s1.getName().compareTo(s2.getName()));
//		
//		for (Student stu : students) {
//	        System.out.println(stu);
//	    }
//		return students;
//	}
	
//	public List<Student> scoredgreaterthan90(){
//		Stream<Student> streamMarks = students.stream();
//		streamMarks = students.stream();
//		  Stream<Student> filteredStreamMarks = streamMarks.filter(c -> c.getMarks()>=90);
//		  List<Student> li1 = filteredStreamMarks.toList();
//		  System.out.println(li1);
//		  return students;
//	}
	
//	public List<Student> scoredbyNames(){
//		Stream<Student> streamMarks1 = students.stream();
//		streamMarks1 = students.stream();
//		  Stream<String> filteredStreamMarks1 = streamMarks1.filter(c -> c.getMarks()>=90).map(c -> c.getName());
//		  List<String> li2 = filteredStreamMarks1.toList();
//		  System.out.println(li2);
//		  
//		  return students;
//	}

}
