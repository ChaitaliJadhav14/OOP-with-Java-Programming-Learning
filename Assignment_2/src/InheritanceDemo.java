class Employee{

	private String name;
	private int id;
	private double salary;
	
	Employee(String name,int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	public double getSalary() {
		return salary;
	}
		
	double calculateSalary() {
		return salary;
	}
	
}
class Manager extends Employee{
	private double incentive;
	
	Manager(String name,int id,double salary,double incentive){
		super(name,id,salary);
		this.incentive=incentive;
	}

	@Override
	double calculateSalary() {
		return getSalary() + incentive;	
	}
}
public class InheritanceDemo
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee("Chaitali",101,300000);
		System.out.println("Employee Salary: " + emp.calculateSalary());
		
		Employee emp2 = new Manager("Sakshi",102,30000,5000);  //prove overriding + runtime polymorphism, use parent reference + child object:
		System.out.println("Manager Salary: "+ emp2.calculateSalary());
		
		Manager mgr = new Manager("Chaitu",103,40000,5000);
		System.out.println("Manager Salary: "+ mgr.calculateSalary());
	

	}
	
}


/*
class Employee{
	protected String name;
	protected int id;
	protected double salary;
	
	Employee(String name,int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}	
	
	double calculateSalary() {
		return salary;
	}
	
}
class Manager extends Employee{
	private double incentive;
	
	Manager(String name,int id,double salary,double incentive){
		super(name,id,salary);
		this.incentive=incentive;
	}
	@Override
	double calculateSalary() {
		return salary + incentive;	
	}
	
}
public class InheritanceDemo
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee("Chaitali",101,300000);
		Manager mgr = new Manager("Sakshi",102,40000,5000);
		
		System.out.println("Employee Salary: " + emp.calculateSalary());
		System.out.println("Manager Salary: "+ mgr.calculateSalary());

	}
	
}
*/

//private + getters
