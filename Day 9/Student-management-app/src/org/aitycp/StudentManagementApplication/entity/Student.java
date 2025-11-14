package org.aitycp.StudentManagementApplication.entity;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

public class Student implements Serializable,Comparable<Student>{
	
	private static int count;
	
	//attributes or instance variable
	private int rollNumber;
	private String name;
	private float marks;
	private List<String> subjects;
	

	public Student(String name, float marks, List<String> subjects)
	{
		System.out.println("Parameterized Constructor");
		count++;
		this.rollNumber=count;
		this.name=name;
		this.marks=marks;
		this.subjects = subjects;
	}
	
	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	private static void setCount(int count) {
		Student.count = count;
	}

	public static int getCount()
	{

		return count;
	}
	void accept(int rollNumber,String name,float marks)
	{
		this.rollNumber=rollNumber;
		this.name=name;
		this.marks=marks;
	}
	//method definition
	//instance method
	public void display()
	{
		System.out.println(this.rollNumber);
		System.out.println(this.name);
		System.out.println(this.marks);
	}
	public void display(String format)
	{
		System.out.println("==========================================");
		System.out.println("RollNo\tName\tMarks\tSubjects");
		for(int i=1;i<=50;i++)
			System.out.print(format);
		
		System.out.println();
		System.out.println(this.rollNumber +"\t"+ this.name +"\t"+this.marks+"\t"+this.subjects);
	}
	@Override
	public String toString()
	{
		//System.out.println("in toString");
		return this.rollNumber +" "+ this.name +" "+ this.marks;
	}

	@Override
	public int compareTo(Student o) {
		return (int)(marks - o.marks);
	}
//	
//	public int compare(Student s1,Student s2)
//	{
//		return (int)(s1.getName().compareTo(s2.getName()));
//	}
	@Override
	public int hashCode()
	{
		return this.name.length();
	}
	
	@Override
	public boolean equals(Object o)
	{
		Student s = (Student)o; //down-casting
		return this.name.equals(s.name);
	}

}
