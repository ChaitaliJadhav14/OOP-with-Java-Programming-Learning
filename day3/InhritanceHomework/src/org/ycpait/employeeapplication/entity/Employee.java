package org.ycpait.employeeapplication.entity;

public abstract class Employee {
private static int count;
	
	private int id;
	private String name;
	
	public static int countEmp() {
		return count;
	}
	
	Employee(String name){
		count++;
		this.id = count;
		this.name = name;
	}
	
	void showDetails() {
	    System.out.println("Employee ID: " + id);
	    System.out.println("Name: " + name);
	}
	
	public abstract double calculateSalary();

}
