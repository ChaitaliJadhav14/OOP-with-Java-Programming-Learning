
public class DemoLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Printable f = () -> {return 8;};
		System.out.println(f.print());
		
		Taxable t = (double income) -> {return income * 0.20;};
		System.out.println(t.calculateTax(1000));
		
		StringJoiner sj = (String s1,String s2) -> {return s1+s2;};
		System.out.println(sj.join("chaitali","jadhav"));
		
		ReturnableLength rl = (String data) -> {return data.length();};
		System.out.println(rl.search("Chaitali"));
		
		Searchable sb = (String data) -> {return true;};
		System.out.println(sb.search("Chaitali"));
		
	}

}
