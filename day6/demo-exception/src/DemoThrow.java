
public class DemoThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullPointerException e = new NullPointerException();
		throw e; //compiler does not force to handle or declared the exception because it is runtime exception which is a unchecked exception type

	}

}
