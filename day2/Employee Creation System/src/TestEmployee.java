import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nmuber of employee"+Employee.getCount());
		Employee e = new Employee(1,"prachi",78678);
		e.showDetails();
		
		Employee e2 = new Employee(0,"prachi",78798799);
		e2.showDetails();
		
		System.out.println("Nmuber of employee :"+Employee.getCount());
		
		
		
		Employee e3 = null;
		Scanner sc = new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("Welcome to Employee Management System");
			System.out.println("========================================");
			System.out.println("1.Register new Employee");
			System.out.println("2.Display Employee Details");
			System.out.println("-1.Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				e3 = new Employee(3,"Rita",68758);
			
				break;
			case 2:
				if(e3 != null)
					e3.showDetails();
				break;
			case -1:
				System.out.println("Thank you visit again....");
			}
		}while(choice!=-1);
		
		
			

	}

}
