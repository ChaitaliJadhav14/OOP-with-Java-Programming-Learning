package org.ycpait.geometryapp.entity;

public class Circle extends Shape {
	private float radius;
	//private String color;
	
	public Circle(float radius,String color){
		super(color);
		this.radius=radius;
//		this.color=color;
		
	}
	public float calculateArea() {
		return 3.14f*radius*radius;
	}
	
	public float getPi() {
		return 3.14f;
	}
	
	
//	public void draw() {
//		System.out.println("Shape drawn using color :" + this.color);
//	}
	
	
	@Override //built-in annotation to check if overriding is appropriate,it is recommended to annotate for overriden methods,NOT Mandatory
	//overridden method if it blank then it cant draw anything for circle class
	public void draw() {
		super.draw();
		System.out.println("With radius "+ this.radius);
	}
	
	@Override
	public void getInfo() {};
	

}
