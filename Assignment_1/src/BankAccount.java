
class BankAccount {
	private int accountNo;
	private String name;
	private double balance;
	
	BankAccount(int accountNo,String name,double balance){
		this.accountNo=accountNo;
		this.name=name;
		this.balance=balance;
	}
	public void deposit(double amount) {
		balance += amount;
		System.out.println(amount+"deposited successfully");	
	}
	
	public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient Balance!");
		}
		else {
		balance -= amount;
		System.out.println(amount+"withdraw successfully");
		}
		
	}
	public void display() {
		System.out.println("Account Number: " + accountNo); //accountNo -instance variable/class
		System.out.println("Name :"+ name);
		System.out.println("Balance : "+balance);
		System.out.println("------------------------------------------------");
	}

public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BankAccount b1 =new BankAccount (101,"Chaitali",5000);
		BankAccount b2 =new BankAccount (102,"Sakshi",8000);
		
		b1.deposit(1000);
		b1.withdraw(2000);
		b1.display();
		
		b2.deposit(500);
		b2.withdraw(9000);
		b2.display();
		

	}

}

