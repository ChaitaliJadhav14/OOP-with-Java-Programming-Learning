package studentmanagementpp;

public class Student {
	//attributes OR instance variable
	
	private static int count;
	private int rollNumber;
	private String name;
	private float marks;
	
	/*
	 * public Student() { System.out.println("In side student constructor");
	 * this.rollNumber = 1; this.name = "Guest"; this.marks = 60.89f; }
	 */
	
	public Student(int rollNumber,String name,float marks) {
		System.out.println("parameterized constuctor");
		count++;
		this.rollNumber= count;
		this.name = name;
		this.marks = marks;
	}
	
	public static int getCount() {
		return count;
	}
	
	void accept(int rollNumber,String name,float marks){
		this.rollNumber= rollNumber;
		this.name = name;
		this.marks = marks;
		
	}
	
	void display(String format) {
		System.out.println("RollNumber \t Name \t Marks");
		for(int i = 1;i<=40;i++) {
			System.out.print(format);
		}
		System.out.println();//for new line
		System.out.println(this.rollNumber +"\t	"+this.name+"	\t"+this.marks);
	}
    //method definition
	//instance method
	void display() {
		System.out.println(this.rollNumber);
		System.out.println(this.name);
		System.out.println(this.marks);
	}

}
