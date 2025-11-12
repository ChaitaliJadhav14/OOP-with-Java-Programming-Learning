import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DemoProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Set<String> cities = new TreeSet<String>();
		//declare a list of string of 5 cities
		List<String> cities = new ArrayList<String>();
		
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Pune");
		cities.add("Mysore");
		cities.add("Bangalore");
		
		cities.forEach(str -> System.out.println(str)); //Declarative programming style
		
		System.out.println("All cities: " + cities);
		
		// Create a new list from this existing list with cities name starting with "M"
		
		List<String> citiesWithM = new ArrayList<String>();
		
		for (String city : cities) {        
			if (city.startsWith("M")) {
				citiesWithM.add(city);        
			}
		}
		
		System.out.println(citiesWithM);
		
		//Create a new list from cities list which stores length of each city
		
		List<Integer> cityNameLengths = new ArrayList<Integer>();

        for (String city : cities) {
            cityNameLengths.add(city.length());
        }

        System.out.println("Length of each city name: " + cityNameLengths);

	}

}
