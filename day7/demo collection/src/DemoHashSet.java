import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> cities;
		cities = new HashSet<String>();
		cities.add("Mumbai");
		cities.add("Pune");
		System.out.println(cities);
		System.out.println(cities.size());
		
		cities.add("Mumbai"); 
		System.out.println(cities);
		System.out.println(cities.contains("Mumbai"));// it return result in true and false
		//no index methods
		//System.out.println(cities.get(0)); 
		//cities.add(1,"Delhi");
		
		cities.clear();

	}

}
