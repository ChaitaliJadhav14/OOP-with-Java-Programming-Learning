
public class DemoFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("in try");
//			System.out.println(1/0); //in try ,in catch,	in finally
		
			System.out.println(1/1);  //in try
			//1
			//in finally
		}
//		catch(Exception e) {
//			System.out.println("in catch");
//		}
		finally {
			System.out.println("in finally");
			
		}

	}

}
