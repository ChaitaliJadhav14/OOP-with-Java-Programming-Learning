package org.ycpait.geometryapp;

import org.ycpait.geometryapp.entity.Circle;
import org.ycpait.geometryapp.entity.Shape;

public class GeometryApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s ;
		Circle c= new Circle(5,"red");
		s=c; //upcasting
		
		
		System.out.println("Area of circle :"+s.calculateArea());
		s.draw();
		
		Circle c1 = (Circle)s; //downcasting
		
		c1.getPi();
		
		//s.getInfo();
	
//		Rectangle r = new Rectangle(3.4f,7.9f,"blue");
//		System.out.println("Area of Rectangle: "+r.calculateArea());
//		r.draw();
//		

		
		
		s=new Circle(4,"red");
		
		//invoking generalized methods
		s.calculateArea();
		s.calculatePerimeter();
		s.draw();
		
		//invoking specialized methods
		Circle c3 = (Circle)s;
		c3.getPi();
	}

}
