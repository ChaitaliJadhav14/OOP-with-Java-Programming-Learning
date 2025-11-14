import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DemoProcessing {

	public static void main(String[] args) {

		List<String> cities = new ArrayList<String>();
		
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Pune");
		cities.add("Mysore");
		cities.add("Bangalore");
		
		cities.forEach(str->
		          System.out.println(str));
		
		System.out.println("All cities: " + cities);
		
		// Create a new list from existing set with cities starting with "M"
		
		List<String> citieswithM = new ArrayList<>();
		
		for (String city : cities) {        
			if (city.startsWith("M")) {
				citieswithM.add(city);        
			}
		}
		
		System.out.println(citieswithM);
		
		//or
		
		Stream<String> streamCities = cities.stream();
		Stream<String> filteredStream = streamCities.filter(c -> c.startsWith("M"));
		List<String> li = filteredStream.toList();
		System.out.println("With the traditional approach: "+li);
		
		li = cities.stream()
	               .filter(c -> c.startsWith("M"))
				   .toList();
		System.out.println("With the modern approach: "+li);
		
		
		//create a list from cities list which store length of each cities
		List<Integer> citiesLength = new ArrayList<>();
		
		for(String city:cities) {
			citiesLength.add(city.length());
				
			}
		  System.out.println(citiesLength);	
		  
		  //or
		  
		  streamCities = cities.stream(); //1
		  Stream<Integer> lengthStream = streamCities.map(s -> s.length());
		  citiesLength = lengthStream.toList();
		  System.out.println("With Traditional Approach: "+citiesLength);
		  
		  citiesLength = cities.stream()
				                .map(s -> s.length())
				                .toList();
		  System.out.println("With Modern Approach: "+citiesLength);
		  
		  
		  streamCities = cities.stream();
		  Stream<String> filteredStreamLength = streamCities.filter(c -> c.length()>=5);
		  List<String> li1 = filteredStreamLength.toList();
		  
		  System.out.println("Length= "+li1);
			
		
		}
	  	
	

	
	
	
	
	

	

}
