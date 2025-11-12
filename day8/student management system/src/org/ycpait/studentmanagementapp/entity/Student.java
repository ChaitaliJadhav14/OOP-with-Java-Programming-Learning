
package org.ycpait.studentmanagementapp.entity;

import java.io.Serializable;
import java.util.Comparator;

public class Student implements Serializable,Comparable<Student>{
	
	private static int count;
	
	//attributes or instance variable
	private int rollNumber;
	private String name;
	private float marks;
	
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
	private static void setCount(int count) {
		Student.count = count;
	}
	
	public void setMarks(float marks)
	{
		this.marks=marks;
	}
	//no argument constructor
//	public Student()
//	{
//		System.out.println("Inside Student()");
//		this.rollNumber=103;
//		this.name="Samiksha";
//		this.marks=56.18f;6
//	}
	public Student(String name, float marks)
	{
//		System.out.println("Parameterized Constructor");
		count++;
		this.rollNumber=count;
		this.name=name;
		this.marks=marks;
	}
	
	public static int getCount()
	{
		return count;
	}
//	void accept(int rollNumber,String name,float marks)
//	{
//		this.rollNumber=rollNumber;
//		this.name=name;
//		this.marks=marks;
//	}
	
	//method definition
	//instance method
//	void display()
//	{
//		System.out.println(this.rollNumber);
//		System.out.println(this.name);
//		System.out.println(this.marks);
//	}
	
	//method overloaded //after overriding the TOstring method we dont need to write this display method
	void display(String format)
	{
		System.out.println("==========================================");
		System.out.println("RollNo\tName\tMarks");
		for(int i=1;i<=50;i++)
			System.out.print(format);
		
		System.out.println(); //for new line
		System.out.println(this.rollNumber +"\t"+ this.name +"\t"+this.marks);
	}
	
	@Override
	//Overridden method
	//this method should return String which is useful information about this object
	public String toString() {
//		System.out.println("in toString");
		return this.rollNumber + " "+ this.name + " "+this.marks;
	}
	
	//day 7
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return(int)(marks - o.marks);
	}

	/*
	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return(int)(s1.name.compareTo(s2.name));
	}
	*/
	
	//day 8
	//hashcode method  
	@Override
	public int hashCode() { //memory address refer s1==s2 so that it give output 2
		System.out.println("in hashcode of Student");
		return this.name.length();  //return 0; here create only one bucket where all object store inside one bucket
	}
	
	//equals method  //s1 equals s2 //it refer to object value so it give only 1 output
	@Override
	//it is used to custom object because o  is from object class
	public boolean equals(Object o) { //it can avoid duplication and only give unique value
		Student s = (Student)o; //downCasting
		return this.name.equals(s.name);
	}
	
	
	

}