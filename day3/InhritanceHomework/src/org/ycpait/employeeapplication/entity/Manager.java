package org.ycpait.employeeapplication.entity;
public class Manager extends Employee{
	private int incentives ;
	private double basicSalary;
	
	public Manager(String name, double basicSalary, int incentives){
		super(name);
		this.basicSalary = basicSalary;
		this.incentives = incentives;
	}
	
	double manSal(){
		return basicSalary + incentives ;
	}
	
	@Override
	public
	void showDetails() {
	    super.showDetails();
	    System.out.println("Incentives: " + incentives);
	    System.out.println("Salary: " + manSal());
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

}
