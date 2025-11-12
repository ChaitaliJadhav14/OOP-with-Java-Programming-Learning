
public class MyThread extends Thread{
	
	@Override
	public void run() {
		Thread c = Thread.currentThread();  //currentThread() static method of Thread class so thats why we get current thread name
		for(int i=1;i<=5;i++) {
			System.out.println(i + c.getName());
		}
		
//		System.out.println("In run()" + c.getName());
//		System.out.println(c.getPriority());
	}
	
	public static void main(String[] args) {
		MyThread t = new MyThread(); 
		t.setName("hello");
		t.setPriority(8);
		
//		t.setPriority(Thread.MAX_PRIORITY); //10
//		t.setPriority(Thread.MIN_PRIORITY); //1 it run first
		
		t.start();
		
		MyThread t1 = new MyThread();
		t1.setName("hi");
		t1.start();
		
		
//		System.out.println("in main()");
		System.out.println(Thread.currentThread().getName()); //this line proves that this is part of main Thread and name of main thread is "main"
		
		
	}

}

//which thread run first is not our hand is completely in JVM hand 
