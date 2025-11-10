package org.ycpait.geometryapp.entity;

public abstract class Shape { //abstract class
	protected String color;
	Shape(String color) {
		
		super();
		System.out.println("in shape (string color)");
		this.color=color;
	}
	
	public abstract float calculateArea(); //abstract method
	
	public abstract void getInfo();
	
	public void draw() {
		System.out.println("Shape drawn using color: "+ this.color);
	}
	
	public float calculatePerimeter() {
		return 0;
	}

}
