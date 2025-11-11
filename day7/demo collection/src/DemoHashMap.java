import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> cities;
		cities = new HashMap<Integer,String>();
		cities.put(22, "Mumbai");
		cities.put(11, "Delhi");
		cities.put(33, "kolkatta");
		System.out.println(cities); // output - {22=Mumbai, 11=Delhi}
		System.out.println(cities.size());
		System.out.println(cities.get(22));
		System.out.println(cities.containsKey(11));
		System.out.println(cities.containsValue("Mumbai"));
		
		//duplicate key is not allowed  //if we try to add duplicate key then it override the value
		cities.put(11, "Banglore"); 
		System.out.println(cities);
		
		//duplicate value is allowed
		cities.put(20, "Mumbai");
		System.out.println(cities);
		
		cities.remove(33);  //it will remove key value pair
		System.out.println(cities);
		
		cities.clear();

	}

}
