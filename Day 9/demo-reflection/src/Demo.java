import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Demo {

	public static void main(String[] args) {
//		Project p = new Project();
//		Class c = p.getClass();
		
		Class c;
		try {
			c = Class.forName("Project");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
//		String name = c.getName();
//		System.out.println(name);
//		
//		Method[] m = c.getMethods();
//		for(Method m1 :m) {
//			System.out.println(m1.getName());
//		}
		
		String name = "Mumbai";
		
		Class cstr = name.getClass();
		
		Field[] f =  cstr.getDeclaredFields();
		for(Field f1 : f)
			System.out.println(f1.getName() + " \t \t \t" + Modifier.toString(f1.getModifiers()));
		
		Method[] ms = cstr.getDeclaredMethods();
		for(Method m : ms)
			System.out.println( Modifier.toString(m.getModifiers())+"  "+m.getReturnType()+"  "+m.getName());

	}

}
