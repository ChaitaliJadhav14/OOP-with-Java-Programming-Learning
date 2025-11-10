package org.ycpait.wrapper;

public class DemoWrapper {
	public static void main(String[] args) {
		//primitive
		int i = 10;
		
		//primitive to wrapper
		//Integer iObj = new Integer(i);
		Integer iObj =i; //auto-boxing
		
		//wrapper to primitive
		int j = iObj.intValue();
		j=iObj; //auto-unboxing
		
		//String to wrapper
		Integer o = Integer.valueOf("77");
		
		//Wrapper to String
		String str = o.toString();
		
		//String to primitive
		int p = Integer.parseInt("78");
		
		//primitive to string
		String data = Integer.toString(p);  //toString is a static method of class Integer
	}
	
}
