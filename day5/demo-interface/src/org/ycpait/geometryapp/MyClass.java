package org.ycpait.geometryapp;

public class MyClass implements I1,I2{
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("my class display");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		I1 m = new MyClass();
		m.display();//runtime polymorphism
		
	}

	

}
