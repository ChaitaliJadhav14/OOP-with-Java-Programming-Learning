import java.util.Scanner;

class InvalidAgeException extends Exception{
	InvalidAgeException(String message){
		super(message);
		
	}
}
public class AgeValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter age :");
			int age = sc.nextInt();
			
			if(age<18) {
				throw new InvalidAgeException("Invalid Age! age must be 18 or above");
			}
			System.out.println("Valid age.you are eligible");
		}catch (InvalidAgeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Invalid input! Please enter a number.");
		}finally {
			 System.out.println("Age validation completed.");
	         sc.close();
		}

	}

}
