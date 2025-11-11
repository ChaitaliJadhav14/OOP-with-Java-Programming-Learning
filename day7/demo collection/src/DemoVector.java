import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class DemoVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cities;
		cities = new Vector<String>();
		System.out.println(cities.size());
		cities.add("Mumbai");//adding element at last
		cities.add("Pune");
		cities.add("Mumbai"); //this line proves list allows duplicate elements
		cities.add("Delhi");
	//	cities.add(12); //boxing (primitive to wrapper)
		
		System.out.println("Before" + cities);
		Collections.sort(cities);  //Collections is class which has static method sort()
		System.out.println("After" + cities);
		
		
	
		System.out.println(cities.size());
		System.out.println(cities);
		cities.add(1,"Delhi"); 
		System.out.println(cities.size());
		System.out.println(cities);
		
		System.out.println(cities.get(0)); 
		cities.remove(1);
		System.out.println(cities.size());
		System.out.println(cities);
		
		cities.clear();  
		System.out.println(cities.size());//number of elements
		System.out.println(cities);
		
	}

}
