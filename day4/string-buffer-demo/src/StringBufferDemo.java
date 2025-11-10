
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("abcd");
		System.out.println(sb.length());
		sb.insert(2, "jkl");  //abjklcd
		System.out.println(sb);
	}

}
