class NumberThread extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Number :" + i);
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
class LetterThread implements Runnable{
	public void run() {
		for(char ch='A';ch<='J';ch++) {
			System.out.println("Letter :"+ch);
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
public class MultiThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberThread nt = new NumberThread();
		
		LetterThread lt = new LetterThread();
		Thread t2 = new Thread(lt);
		
		nt.start();
		t2.start();

	}

}
