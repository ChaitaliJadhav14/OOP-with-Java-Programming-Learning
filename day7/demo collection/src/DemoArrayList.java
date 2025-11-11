import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cities;
		cities = new ArrayList<String>();
		System.out.println(cities.size());
		cities.add("Mumbai");//adding element at last
		cities.add("Pune");
		cities.add("Mumbai"); //this line proves list allows duplicate elements
		cities.add("Delhi");
	//	cities.add(12); //boxing (primitive to wrapper)
		
		System.out.println("Before" + cities);
		Collections.sort(cities);  //Collections is class which has static method sort()
		System.out.println("After" + cities);
		
		
	
		System.out.println(cities.size());//number of elements
		System.out.println(cities);
		cities.add(1,"Delhi"); //adding at given index
		System.out.println(cities.size());//number of elements
		System.out.println(cities);
		
		System.out.println(cities.get(0)); //it give element from the given index
		cities.remove(1); //removes element form given index
		System.out.println(cities.size());//number of elements
		System.out.println(cities);
		
		cities.clear();  //clear the array
		System.out.println(cities.size());//number of elements
		System.out.println(cities);
		
	
		
		
	}

}
