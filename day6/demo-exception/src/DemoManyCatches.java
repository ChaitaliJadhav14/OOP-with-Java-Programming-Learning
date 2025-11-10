
public class DemoManyCatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s = null;
			System.out.println(s.length());
			System.out.println(args[0]); //after writing this program is terminate and throws exception java.lang.ArrayIndexOutOfBoundsException,not run System.out.println("After") this line  
			System.out.println(1/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero"); //first run this then run after
		}
		catch(NullPointerException e) {
			System.out.println("Can not invoke method on null reference"); 
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of range"); 
		}
		catch(Exception e) {
			System.out.println("Generic"); //this can be handle any type of exception
		}
		System.out.println("After"); 
	}

}
