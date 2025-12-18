package pack2;
import pack1.A;
public class B extends A{
	public void callDisplay() {
		display();
	}
	public static void main(String[] args) {
		B obj = new B();
		obj.display();
		
	}

}
