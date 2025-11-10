
public class DemoExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 =2;
		int num2=0;
		try {  //we can not write only try block ,if write only try then it give error
			int result=num1/num2;  //this is a doughtful statement   // exception occur here
			System.out.println("Result is: "+ result); //then this statement is not run .control goes into line 12 catch(ArithmeticException e)
		}
		//System.out.println("In between"); Error
		catch(ArithmeticException e) {
			System.out.println("cannot divide by zero");
			e.printStackTrace();//this prints complete stack trace on console needed for debugging
			
		}
	

	}

}
