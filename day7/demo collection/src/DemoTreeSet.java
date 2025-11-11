import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> cities = new TreeSet<String>();
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Delhi");
		
		//iterate using advanced for loop - this for loop is used only for read only operation ,using advanced for loop we can iterate over a collection from beginning to end sequestionally,we can not modify the collection
		//if we want to iteraate over a collection object and while iterating we want to remove a specfic element from the collection we should use Iterator object
		for(String city: cities) {
			System.out.println(city);
		}
		
		//steps to use iterator 
		//step -1
		Iterator<String>i;
		i=cities.iterator();
		
		//step-2
		while(i.hasNext()) {
			
			//step-3
			String city = i.next();
			System.out.println(city);
			
			//step-4
			if(city.equals("Pune"))
				i.remove();
		}
			
//		System.out.println(cities);
//		System.out.println(cities.size());

	}

}
