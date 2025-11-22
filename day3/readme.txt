Array:An array is a collection of homogeneous items stored in contiguous memory locations.
 - array in java are object hence created in heap memory.
 step to create:
    - declare any type with its reference.
    - create object assign it to object.
    - assign value to array
    - index start with 0
    - size of array once is declare its fixed means it cannot be grow or down
    -  
     int [] num;
      num = new int[3];

      num[0]=10;
      num[1]=10;
      num[2]=10;

JVM Memory
stack                      heap
                 
|         |
|         |             |----------------|
|_________|             |                |
|  main   |             |   0   1    2   |
|     num |-------------|   __________   |
|         |             |   |10|20|30|   |
|         |             |                |
|_________|             |________________|

2:- enhanced for loop:-
                     when we want iterate on array, collection sequencially from beginning to end use enhanced for loop.
                     added of jdk-5
                     syntax:-

                     for(data_type variable : array_name)

3:- final Keyword:

- If used with a variable, its value cannot be changed — it becomes a constant.
- If used with a method, that method cannot be overridden.
- If used with a class, the class cannot be inherited.


4:- Enum:-
       - when we want pick a value from enumerated list we use Enum
       - added in JDK-5 
       - enum constants are by default static and final
       - eg : gender
       - built- in enum Example:
            RetentionPolicy.SOURCE

2- Naming convention for constants:
    - first letter should be uppercase.
    - enum name should be noun sufix with the attributes 
         eg: GenderType, MessageType;
systax:-
    Enum enum_name{
    constant separate by  ,
}

5:- setter method:
       this method is used to change value of a speacial variable.
       name convention:
        - setter should public
        - return type should be void
        - method name start with set followed by name the attribute where 1   letter should be upperCase
        - method accept argument of same data_type of attribute

6:- getter method     
        it used to get aspecifice value
        name convention:
        - it should public
         - return type should having matching to attribute type
        - method name start with get followed by name the attribute where 1   letter should be upperCase
        - method should not argument
        - method should return value of attribute.
note : it is convention and best practice to write setter getter method for private attribute of class.
- these methods are used by framework or spring, hibernate

7:-Inheritance:- it is majar pilar of oops 
   - using inheritance we built is-a relationship
   - in other word when we have is-a relationship we use inheritance to implemented.
   - in java inheritance is implemented using extends keyword.
   - inheritance allows us to create new class by inheriting properties of existing class
   - existing class known as super/base/parent class
        base class - contain common properties and method.
   - new class  known as sub/derived/child

                       object class               object class
                                                      ↑  
 Generalised class  -->  Person                     shape
                            ↑                        ↗↖
                         Employee                  ↗    ↖
                            ↑                    ↗        ↖
specialized class -->   Programmer          circle        rectangle

                 🔗 IS-A Relationships:
           A Programmer is an Employee
           An Employee is a Person
note:-
- When we create an object of a subclass, constructors are executed from top to bottom in the hierarchy.
- in child class constructor is call to super().
- by  default it call to super is call to non parameter constructor of superclass.
- if non parameter constructor in superclass is not present compilation error occurs
- child inherit properties from parent. in addtion to that child can declare its own specific properties.
- superclass has no idea of child specific properties.
- inheritance allows hierarchy:
    top-most class- Generalised class
    bottom-most class - specialized class

    
8: method overriding: 
                  if we want to change implemention method of base class in child class we use method overriding
    Rules of Overriding:
    - The method name must be the same.
    - The method signature (name + parameters) must be the same.
    - The access specifier cannot be more restrictive than the one in the base class.
note: method overriding gives as dynamic polymorphism/ run-time polymorphism.
- in java by default selection of methods for execution at run time based on type of object created.

- @Override is built-in annotation to check if overriding is appropriate
	  // it is recommended to annotate for overriden methods
	 // not mandate
- in java every class  is extends object class if not explicit extending any other class.which means every class in java is directly or indirectly subclass of object.




You cannot add new, broader, or checked exceptions in the throws clause.
Benefits:
- code Reusability.
- inheritance give polymorphism
note:-
 class structure

 class{
    //attribute
    //Constructor
    //setter, getter
    //method
 }
 2. java does not support muiltiple inheritance using class extends.
 3. toString - each class should Override toString . it used to return useful imformation
     - toString method present in object superclass.


