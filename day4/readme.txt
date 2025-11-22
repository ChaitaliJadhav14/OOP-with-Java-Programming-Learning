1. String Class:
- The String class is frequently used in Java.
- It is present in the java.lang package.
- A String is immutable, meaning once a String object is created, its content cannot be changed.
- Any attempt to modify the string results in the creation of a new String object, while the original object remains unchanged.
- string object will be create with or without new keyword.
     String s3 ="a";
     String s4 = "a";

String city = new String("Mumbai");
String newcity = city.replace('M','P');
         System.out.println(newcity);
		 System.out.println(city);
JVM Memory
stack                      heap
                 
|         |
|         |             |----------------|
|_________|             |                |
|  main   |             |                |
|    city |-------------| mumbai         |
|         |             |                |
|  newcity|-------------| pumbai         |
|_________|             |________________|

Two different objects are created in the heap.
   s1.equals(s2) → true (same content)
   s1 == s2 → false (different references)
stack                      heap
                 
|         |
|         |             |----------------|
|_________|             |                |
|  main   |             |                |
|   s2    |-------------| a              |
|         |             |                |
|   s1    |-------------| a              |
|_________|             |________________|


String s3 ="a";
String s4 = "a";
String s5 = "b"

String Constant Pool: 
  -: objects created using double quotes ("") are stored in a special  area of the heap called the String Constant Pool. This pool is reserved specifically for string literals.
   
  -:  Caching and Immutability: String objects in the constant pool are cached and immutable, meaning once created, their content cannot be changed. Any modification results in the creation of a new string object.

  -: Performance Consideration: If your application requires frequent changes to string content, using String is not ideal. Instead, consider using StringBuilder or StringBuffer for better performance.
stack                      heap
                 
|         |
|         |             |-------------------|
|_________|             |StringConstantPool |
|  main   |             |                   |
|   s5    |-------------|b                  |
|   s4    |             |                   |
|   s3    |-------------| a                 |
|_________|             |___________________|
s3 and s4 both point to the same "a" object in the pool.
s5 points to a separate "b" object in the pool.


StringBuffer:- 
     - it class.
     - It is present in the java.lang package.
     - it is mutable.
     - it is thread-safe class , HENCE it is slow in performance.

String-bulider:-
     - it class.
     - It is present in the java.lang package.
     - it is mutable.
     - it not thread-safe class
     - better in performance
     - it add JDK- 5

Inheritance:
    - There is special relationship between reference of superClass and object of subclass that allow reference of superClass refer to object of any class.
    Shape s = new Circle(2.3f,"red");

Abstract Method:-
     method is declare but defined.
     syntax:-
      -  method ends with ; without {}
      -  abstract modify used in method
      -  in java abstract method can be declare only inside abstract class 
      -  reference of abstract class can be created but object of abstract class connot be created.
      -  abstract class can cantain instance variable, method, constructor, static method, static variable etc.
      -  abstract class constructor executed when object of child class created.
      -  the most generic class in hierarchy is marked as abstract class .
      -  if class extending abstract class it most Override all the abstract .method of abstract class otherwise subclass has to be declare as abstract class.
      -  class which object can be created known as concrete class
      -  class can be declare Abstract without any abstract method.
      
Reference variable casting:

2 type:
  1: upcasting - tring to assign sub type (ref) to super type(ref)
                  implicitly and safe
  2: downcating - tring to assign super type(ref) to sub type(ref)
                  explicitly done 
                  -  it can risky

Package:-
    it is name collection of related class , enum, interface.
    Package is directory.
    relation can be by purpose, is-a relation, has-a relation.
    Java is  set to be package centric language, meaning each and every class is define in package.
  name convention:
    Each letter of package name should be in smallcase.
    Package name should be reversed order of domain.

    eg:
 domain name:    ycpait.org 
 package name:   org.ycpait.studentmanagementapp
  package name  is mapped to physical directory structure.

step to create package:
   first line java code must be Package space name of package;.

note:
1- A class which need outside of package we must be imported .
2- by default each java file has one import statement avilable.
    eg: import java.lang.*; that is why String,System has not to be import .
3- package used:
       1. Packages in Java
       2. Packages are used to organize code logically.
       3. They help avoid naming conflicts between classes.
        For example, Java has two different Date classes:
           java.sql.Date
           java.util.Date
       4.each package should cantain class , interface which are related to each other.
Using packages allows developers to use both classes in the same program without confusion by fully qualifying their names.

packageName:
  domain name:    domain.projectname.roleofclass 
 package name:    org.ycpait.studentmanagementapp.entity;
                 org.ycpait.studentmanagementapp.dao; dao(data access object: reponsible for interaction with data storge)

wrapper class:
    - each primitive type java offers asociates class known as wrapper class.
    - A wrapper class in Java is an object that wraps or contains a primitive data type. Each primitive type has a corresponding wrapper class in the java.lang package.  
    - these classes are use following convertion
       1. primitive to wrapper:- Integer iObj= i;//auto-boxing
       2. wrapper to primitive:- int j = iObj.intValue();
       3. String to primitive:-  int p = Integer.parseInt(str);
       4. primitive to String:- String data = Integer.toString(p);
       5. string to wrapper:-  Integer o = Integer.valueOf("77");
       6. wrapper to string:-   String str = o.toString();

 note:-   all these wrapper classes present in lang package.

    primitive                 wrapper-class   
     byte                      Byte
     short                     Short
     int                       Integer
     long                      Long
     float                     Float
     double                    Double
     char                      Charrater
     boolean                   Boolean

     // when deal with collection in java , collecttion only store object we have change primitive to string
     //	            String to primitive	
		    int p = Integer.parseInt(str);

    auto-boxing:-
               it implicit conversion from primitive to wrapper.
    auto-unboxing:-
                the process of implicit conversion from wrapper to primitive.


Garbage object:-
       any object that has no live reference from  stack is Garbage object.
       such object are removed by Garbage collector.(GC)
       it is deamon thread.
       Garbage collection (GC) is managed by the Java Virtual Machine (JVM).
       The execution and duration of GC are completely controlled by the JVM.
       We cannot force garbage collection to run, but we can request it using:System.gc();
       However, calling System.gc() does not guarantee immediate execution. The JVM decides when and if garbage collection should run.

Circle c1 = new Circle(12,"blue");
c1= new new Circle(34, "red");
c1=null;
System.out.println("pop");
GC will run automatically when needed, such as when memory is low or objects become unreachable.
reason- 
   when object loose their reference
 - re-assigning reference to new object.
 - assign null value to reference.
 - reference goes out of block: - execution of method over.


finalize method:
      it automatically executed just before GC collect the garbage object.
      it present in  object's superClass which we must appropriately override
