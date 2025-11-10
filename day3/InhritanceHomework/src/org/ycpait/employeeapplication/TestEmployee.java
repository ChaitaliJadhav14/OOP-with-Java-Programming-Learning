
package org.ycpait.employeeapplication;
import java.util.Scanner;

import org.ycpait.employeeapplication.entity.*;



public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WageEmployee Wemp1 = null;
		Manager man = null;
		//buil-in class used to accept I/p from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to employee management system");
		
		int ch;		
		do {
			System.out.println("1. Create WageEmployee");
			System.out.println("2. Create Manager");
			System.out.println("3. Display Details");
			System.out.println("-1. Exits");
			System.out.println("Enter your Choice..");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				//create new employee
				Wemp1 = new WageEmployee("Nisarga", 544387, 6, 8);			
				break;
				
			case 2:
				man = new Manager("Pragati",78998900, 8976);
				break;
			
			case 3:
				//Display Details
				 if (Wemp1 != null) 
					 Wemp1.showDetails();
				 else
					 System.out.println("No WageEmployee created yet!");
				 
				 if (man != null)
					 man.showDetails();
				 else
					 System.out.println("No Manager created yet!");
				 break;
			
			case -1:
				System.out.println("Thank You...");
				break;
				
			default:
				System.out.println("plzz Enter correct number");
			}
		}while(ch != -1);

	}

}
