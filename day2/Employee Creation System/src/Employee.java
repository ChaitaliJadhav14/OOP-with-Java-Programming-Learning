
public class Employee {
	
	private static int count;
	
	private int id;
	private String name;
	private double basicSalary;
	
	Employee(int id,String name,double basicSalary) {
		count++;
		this.id=count;
		this.name=name;
		this.basicSalary=basicSalary;
		
	}
	
	public void showDetails() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.basicSalary);
	}
	public static int getCount() {
		return count;
	}
	public double calculateSalary() {
		return basicSalary;
		
	}

}
