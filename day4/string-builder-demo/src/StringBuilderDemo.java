
public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("abcd");
		System.out.println(sb.length());
		sb.insert(2, "jkl");  //abjklcd
		System.out.println(sb);
	}

}
