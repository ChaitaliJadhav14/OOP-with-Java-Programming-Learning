package org.ycpait.geometryapp;

interface Printable {
	void Print();
	
	static void of() {}
	
	default void printFormat() {
		System.out.println("default printFormat");
	}

}
public interface Drawable {
	//public static final int PX=1;
	int PX = 1; //most preferable and recommended and 4 are valid 
	//static final int PX = 1;
	//public final int PX = 1;
	void draw();

}
class Circle implements Drawable,Printable{

	@Override
	public void Print() {
		// TODO Auto-generated method stub
		System.out.println(PX);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	public void printFormat() {}
	
}
class Main{
	public static void main(String[] args) {
		Drawable d;
		//d=new Drawable(); //Error
	}
}
