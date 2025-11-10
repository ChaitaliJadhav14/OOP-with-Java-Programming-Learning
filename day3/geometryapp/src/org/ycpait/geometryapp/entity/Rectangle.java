package org.ycpait.geometryapp.entity;

public class Rectangle extends Shape{
	private float length;
	private float breadth;
	//private String color;
	
	Rectangle(float length,float breadth,String color){
		super(color); //to inherit properties of shape which is parent class
		this.length=length;
		this.breadth=breadth;
//		this.color=color;
		
	}
	
	public float calculateArea() {
		return length*breadth;
	}
	
//	public void draw() {
//		System.out.println("Shape drawn using color: "+ this.color);
//	}

	//overridden method if it blank then it cant draw anything for circle class
		public void draw() {
			super.draw();
			System.out.println("With length and breadth "+ this.length + this.breadth);
		}

		@Override
		public void getInfo() {
			// TODO Auto-generated method stub
			
		}

		
}
