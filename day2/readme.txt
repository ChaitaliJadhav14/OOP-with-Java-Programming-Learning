1:-Local variable : variable which are declared inside method or block are known as local variable.
                 eg: if{}, for{}, or {} etc.
-in life time and scope of such variable is limited to the block or method in which they are declared.
-it can be any type.
-local variable must be inislized before accessing 
-any argument in method is local variable eg: args

in JVM there two section 
JVM Memory
stack                  heap

|       |             
|_______|
|       |
|main   |
| age=18|
|       |
|_______|


2:-Instance variable: 
                variable declared inside class but outside of method or block without static modifer is known as Instance variable.
note:- default value to Instance variable is assign, based on data_type

3:-object:
 -object in java always create on heap memory.
              Student s= new Student()
 - EACH object has its own copy of instance variable
 JVM Memory
stack                      heap
                 
|         |
|display()|             |----------------|
|_________|             |                |
|  main   |             |   rollNumber   |
|      s  |-------------|    name        |
|         |             |    marks       |
|         |             |                |
|_________|             |________________|

4:-this Keyword in Java
    - It refers to the currently invoking object.
    - The this reference is implicitly passed to each instance method of a class.
    - The this keyword is automatically available in instance methods, even if not explicitly written.
That’s why it’s recommended to use the implicit this reference inside instance methods — it makes the code cleaner and more readable.

5:-access_specifer: 
                 Java offers four access control levels, implemented through three explicit access specifiers and one default level:
 
 - public: Accessible from anywhere — across all packages and classes.
 - private: Accessible only within the same class in which it is declared.
 - protected: Accessible within the same package and, outside the package, only by subclasses through inheritance.
 - default (no specifier): Accessible only within the same package.


6:- Constructor:-
        - it is speacial method automatically excuted when object is created.
        - it has no return type.
        - it is used to inislized to instance variable.
        - it has same name as class name.
        - it can be define with any access_specifer.
        - Constructor with no argument is known as no-argument Constructor.
        - Constructor with no argument is known as parameter Constructor.
        - A class with non parameter Constructor and with parameter Constructor its called Constructor overloading
              overloading is possible
              - if number of argument different
              - and/or data_type of argument
              -and/or sequence of argument different eg: Scanner

7:-method orverloading: -
               Method overloading occurs when we define more than one method in the same class with different signatures.
A method signature consists of:
-Number of arguments
-Data types of arguments
-Sequence (order) of arguments. eg: println(...)


8-Static variable:
    - a variable declared inside class but outside any method or block with static modifer is known as static variable
    - only one copy of static variable is create with respect of no of class 
    - we can apply any of access_specifer.
    - static variable assign default value based on data_type
    - method should be marks using static modifer .
    - static variable, method are independent of object. hence they can be directly access using class name. eg  System.out.println(); public static void main(String[] args) 
    
note:-
1- When a problem statement is given to you as an object-oriented (OO) developer, you must identify important business entities.
2- An entity is a real-world object that has a well-defined structure and behavior.
3- Represent these entities in Java by defining classes and creating their objects.
4- in java object are created using new keyword.
5- instance method excuted after invoked it.
6- The main method is declared as static because the Java Virtual Machine (JVM) calls it without creating an object of the class.
Since no object exists at the start of program execution, making main static allows the JVM to invoke it directly.
7- in java we declared muiltiple variable with same name provide their scopes are different.
