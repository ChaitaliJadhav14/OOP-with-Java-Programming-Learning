Stream Api:
      - introduced JdK-8
      - Stream it is used to process collection of data 
      - Stream donot change existing collection
      - Stream present in jana.util.Stream package
      - Stream are evaluvate lazily
    - once Stream used consume and connot be reused again any attempt to do so generate exception.


 step to use Stream
1. Create a stream from the source by invoking Stream.of(source).
   The source can be a collection, an array, or a string.
2. Invoke one or more intermediate operations based on business requirements.
3. Invoke a terminal operation and get the result.

source
  ^   stream
  |
  |    intermediate      intermediate     terminal
stream --------->stream--------->stream--=--->result 

        source
           |
           v
        ┌────────┐
        │ Stream │
        └────────┘
           |
           v
   ┌───────────────────┐     ┌───────────────────┐     ┌────────────────────┐
   │ Intermediate Op 1 │ --> │ Intermediate Op 2 │ --> │   Terminal Op      │
   └───────────────────┘     └───────────────────┘     └────────────────────┘
                                                        |
                                                        v
                                                     ┌────────┐
                                                     │ Result │
                                                     └────────┘


Intermediate Op:
           any operation return stream is known as intermediate operation.
           eg.,filter, map, terminal
 Terminal Op:   any operation retrun final stream other than stream is known as
           terminal operation
           eg., tolist() ,forEach()

reflector:-
it is process insepecting , finding information About class, method, fields
it is typically done in following use case.
1. tool provider eg:- ecliples
2. frameworks eg:-String hybranate
3. Annotation processing eg:- 

--there is special class offered by java known as Class which is in java.lang package which offer different method to find information about class eg:- class, method, fields 
-- invoke getClass() method on object of any class whose information we want to find.

Annotation processing:-
   reflection Api present in jana.lang.reflect in java
   use reflection only when needed un unnecessary usage of reflection must be strickly avoided

DAO- data access object
   - it is used design pattern used to intreact with data storage
   - data storage can be file system, memory,database
   - we implement this writing by java class resposible for CRUD operation .
    each entity we write separate DAO class.

    Naming convention for DAO class 
1. entity name+Dao+Impl+java
      eg:   StudentDaoImpl.java
2. Dao class should be in its Own package. 


intermediate operation    |       Terminal operation
      filter()            |           toList()
      map()               |           findFirst()
                          |            foreach()


constructor chaning:- constructor calling another constructor.

rules for java file
1. it can contain 0 or 1 package statement, if present must be first statement 
2. after package there 0 or many import statement.
3. class-> Enum-> interface -> 
4. A java file cantain only one public class , interface,Enum can be present.
5. any number of non public class, interface , enum can be present.
6. comments can appear anywhere.
7. non static element of another connot directly in static method.
8. deep coping must be explicitly done by developer of class.
9. hightly cohesion --> Reusabile 

note:-
object class method :- clone()  it allow as copy or clone of existing object
the object need to be clone must implement Cloneable interface .
Cloneable are from lang package.  it is Marker interface Serializable also merker interface .Cloneable help to create shallow copy.
