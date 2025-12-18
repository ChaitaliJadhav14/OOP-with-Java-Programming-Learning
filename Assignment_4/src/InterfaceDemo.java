interface Printable{
	void print();
}
interface Showable{
	void show();
}

class Report implements Printable,Showable{
	@Override
	public void print() {
		System.out.println("Printing report");
	}
	@Override
	public void show() {
		System.out.println("Showing report");
	}
	void display() {
		System.out.println("Report is printed and shown successfully");
	}
} 
public class InterfaceDemo {
	public static void main(String[] args) {
		Report r = new Report();
		r.print();
		r.show();
		r.display();
		
	}

}
