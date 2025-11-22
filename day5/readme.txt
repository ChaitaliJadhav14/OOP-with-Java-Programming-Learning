has-a relationship :
          when we declare reference of one type as member or attribute of other class its has relationship.
+----------------+           +----------------+
|    Student     |           |    Address     |
+----------------+           +----------------+
| - name         |           | - street       |
| - rollNumber   |           | - city         |
| - address      | --------> | - zipCode      |
+----------------+           +----------------+
 here are two types of "has-a" relationships in object-oriented programming:

1. Containment
            Also known as composition, this occurs when two objects are tightly associated.
            If the container object is deleted, the contained object also ceases to exist.
   Example: A Student object contains an Address object. If the Student is deleted, the Address is also deleted.

2. Aggregation
       This is a weaker association between objects.
       If the container object is deleted, the contained object should not be deleted.
       The contained object can exist independently of the container object.

Example: A Team object may aggregate Player objects. Even if the Team is deleted, the Players still exist.
         student associated with trainer,
         student associated with multiple courses.
in class Scanner has-a input-stram which has-a relationship


Static import:
   -  this feature added in JDK-5 , used to import Static method , static variable outside package or outside class
   -  this should be use only if one specific static member is being frequently use in class.
   -  unnecessary import static reduce readible of the application.
   syntax:-
   import static fully qualified class name.static_member_name.

used case:
  - Junit  

Array of references:  
            when we declare Array of class type we actual Array of reference of type not actual object.
         stack                        heap
                                0         1
+----------------+           +----------------+
|    Student     |---------- | null | null |  |
+----------------+           +----------------+

Inner class:
    a class which is defined inside other class  is known as Inner class.
    there are following types of inner classes:
         Regular inner class:- 
                - when a class define inside other class but outside method, without static modifer is known as Regular inner class.
                - it can access all the fields or method of outter clsss directly.
                - it can declare its own fields and  method also.

         method local inner class:
                - if class is define inside outter class method,without static modifer is known as method local inner class.         
         
         static inner class :
                - it can access all the fields or method of otter clsss directly.
                - it can declare its own fields and  method also.
                - Defined inside another class, but outside any method, and with the static modifier.
                - Can access only static members of the outer class.
                - Can be instantiated without an instance of the outer class.
       used case:
          - used to create classes with highly cohesion and hiding innernal details: 
          eg: java collection uses innernaly uses inner class.
       inner .class created following:
        otterclassname_$_innerclass.class
        with one change of method local inner class
        syntax of method local inner .class:   
         otterclassname_$_digit_innerclass.class

Interface in Java
   - An interface is used to create a loosely coupled application.
   - It is used to define a contract that classes must follow.
        implemention multiple inheritance
    syntax  
     interface name{

     }    

 name convention:
    - first letter of each word uppercase
    -  interface name should be end with "able"
     eg: Runnable, Callable, Serializable, Printable etc in-bulit interface Example 
     > 1st letter of each word should be in Upper case 
    -   interface name should end with 'able'.
    - by default every interface is abstract.
> writing abstract keyword is optional
> it is not recommended to write abstract keyword
> object of interface cannot be created in other words interface cannot be instantiated 
> but reference of an interface can be created 
> since JDK 1.7 (7) , methods in a interface are by default abstract and public, writing 'abstract' keyword is optional
> interface can contain variables which are by default public, static, final
> class can implement 1 or more interface 
> class is implementing an interface , it must override all the methods of that interface otherwise class has to be describe as abstract
> an interface can extend another interface
> Basic valid combinations
class extends class
class implements interface/s
interface extends interface/s
class extends class implements interface/s
> JDK 8 features
 1. we can write implemented methods in interface which are known default methods
 2. it is not mandatory for the class to override default method
 3. an interface can define static methods
> there is a special relationship between reference of an interface and object of a class implementing that interface that allows reference of an interface to refer to object of implementing class 

Marker Interface
> Interface having no methods declared is known as marker interface. It is also known as tagging interface. AKA Empty interface. e.g. Sirealizable
> These interfaces are used as meta data provider which can be used by JVM, frameworks to perform some operation on classes implementing these interfaces 
> e.g. Sirealizable - it is to save the object state in the file system

Functional Interface
> an interface containing exact 1 abstract method is known as functional interface 
> this was introduced since JDK 8
> such interface is used to declare lambda expression
> lambda expression is introduced in JDK 8
> lambda expression is an anonymous function 
> it is strongly recommended to annotate any functional interface with @FunctionalInterdace
> Syntax
 FunctionalInterfaceName f = () -> {}

interface Taxable{
	double tax(double income){}
}

Taxable t = (double income) -> {return income*45.6;};

public interface StringJoiner{
	String join(String s1, String s2);
}

StringJoiner sj = (String s1, String s2) -> {return s1+s2;};

> lambda expressions function signature must match with signature of functional interface method which is used to create lambda expression 
NOTE: it is strongly recommended to write lambda expression in the most shorthand way possible using following rules.
 1. writing datatype to argument of lambda expression is optional
 2. If there is only 1 argument to lambda expression writing parenthesis is optional
 3. If there is only 1 statement in the body of lambda then writing curly brace is optional
 4. If lambda expression contains only 1 statement and we don't want to write curly braces and if that statement is return statement, then writing return keyword is NOT allowed.
