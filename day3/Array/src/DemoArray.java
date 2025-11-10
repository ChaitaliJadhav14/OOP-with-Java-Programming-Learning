
public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);  //if we don't pass values to args array an exception is generated
		
		int[] numbers;
		numbers = new int[3];
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		//numbers[3] = 40; Exception
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		//way- 2
		float[] marks = new float[2];
		marks[0] = 89.89f;
		marks[1]=78.78f;
		
		//way-3
		String[] subjects = {"Java","Spring"};
		
		//basic for loop
		for(int i=0;i<subjects.length;i++) {
			System.out.println(subjects[i]);
		}
		
		//enhanced for loop OR for-in loop
		for(String s : subjects) {
			System.out.println(s);
		}
	}

}
