
public class MyRunnable implements Runnable{ //Runnable is a functional interface where only one abstract method

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("in run()" + Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
//		MyRunnable r = new MyRunnable();
//		Thread t = new Thread(r);
//		t.start();
		
		//or
		
		Thread t1 = new Thread(()-> System.out.println("in run()"));
		t1.start();
	}

}
