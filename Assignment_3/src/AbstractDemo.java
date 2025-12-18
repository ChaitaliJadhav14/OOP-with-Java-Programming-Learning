import java.util.Scanner;

abstract class Shape{
	public abstract double area();
	public abstract double perimeter();
}

class Circle extends Shape{
	private double radius;
	
	Circle(double radius){
		this.radius=radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*3.14*radius;
	}
}

class Rectangle extends Shape{
	private double length;
	private double breadth;
	
	Rectangle(double length,double breadth){
		this.length=length;
		this.breadth=breadth;	
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(length+breadth);
	}
	
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		double r = sc.nextDouble();
		Shape c = new Circle(r);
		System.out.println("Area of circle :" +c.area());
		System.out.println("Perimeter of circle: " +c.perimeter());
		
		System.out.println("Enter the length of Rectangle :");
		double l = sc.nextDouble();
		
		System.out.println("Enter the breadth of Rectangle: ");
		double w = sc.nextDouble();
		Shape rect = new Rectangle(l,w);
		System.out.println("Area of Rectangle: "+rect.area());
		System.out.println("Perimeter of Rectangle: "+rect.perimeter());
		sc.close();  //close the Scanner object and release system resources.

	}

}
