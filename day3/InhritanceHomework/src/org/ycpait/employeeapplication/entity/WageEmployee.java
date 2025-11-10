package org.ycpait.employeeapplication.entity;
public class WageEmployee extends Employee{
	private int hours;
	private int rate ;
	private double basicSalary;
	
	public WageEmployee(String name, double basicSalary, int hours, int rate){
		super(name);
		this.basicSalary = basicSalary;
		this.hours = hours;
		this.rate = rate;
	}
	
	double wageEmpSal() {
		return basicSalary + hours*rate;
	}
	
	@Override
	public
	void showDetails() {
	    super.showDetails();
	    System.out.println("Hours: " + hours);
	    System.out.println("Rate: " + rate);
	    System.out.println("Salary: " + wageEmpSal());
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
}
