character hierarchy: 
                   Character Stream Hierarchy in Java
                   Character streams are used for reading and writing text data 
                   (i.e., characters), making them ideal for handling documents and 
                    other human-readable files.
Reader                   Writer
  ⬆️                      ⬆️
  ⬆️                      ⬆️
  ⬆️                      ⬆️
FileReader              FileWriter
                           ⬆️
                           ⬆️
                           ⬆️
                        PrintWriter
Reader: Abstract class for reading character streams.
Writer: Abstract class for writing character streams.
FileReader: Reads character files.
FileWriter: Writes character files.
PrintWriter: Adds convenience methods for formatted text output (like println()).


📦 java.io Package
-  All classes in the java.io package are blocking I/O.
-  They are suitable for single-threaded or simple I/O operations.
-  These classes are not ideal for high-performance or concurrent I/O, as they block the thread during read/write operations.

⚡ Why java.nio?
To overcome the limitations of blocking I/O, Java introduced a
 new package:
      java.nio (New I/O):
      Supports non-blocking I/O.
      Designed for scalable, high-performance I/O.
      Useful in multi-threaded or asynchronous environments.
Includes channels, buffers, and selectors for more efficient data handling.

collection framework:-

dropback of Array:
1. size of Array is fixed or not grow dynmically.
2. to insert new element or remove exist element in Array it is difficult to implement.
3. array can hold singler type of element.
4. java offer implement of data structure using collection framework.
5. all the class and interface present in java.util

(I) → Interface

(C) → Concrete class
                          
## 📦 Java Collection Framework (Text Diagram)

                             Collection (I)
                                  ⬇
        ┌────────────────────┬────────────────────┬────────────────────┐
        │                    │                    │                    │
     Queue (I)           List (I)             Set (I)           (Other types)
        ⬇                    ⬇                    ⬇
 ┌────────────────┐    ┌────────────────┐     ┌────────────────────────────┐
 │PriorityQueue(C)│    │ArrayList (C)   │     │HashSet (C)                 │
 │LinkedList   (C)│    │LinkedList (C)  │     │LinkedHashSet (C)           │
 └────────────────┘    │Vector     (C)  │     │SortedSet (I) → TreeSet (C) │
                       │Stack      (C)  │     └────────────────────────────┘
                       └────────────────┘
```

> **Legend:**  
> - `(I)` → Interface  
> - `(C)` → Concrete class  

---

## 🧠 Key Concepts & Notes

### 🔹 Queue
- **FIFO** (First-In-First-Out) structure.
- Common implementations: `PriorityQueue`, `LinkedList`.

### 🔹 List
- **Index-based** access.
- **Allows duplicates**.
- Implementations:
  - `ArrayList`: Fast access, not thread-safe.
  - `LinkedList`: Good for insert/delete operations.
  - `Vector`: Legacy, **thread-safe**, but slower in performance.
  - `Stack`: LIFO structure, subclass of `Vector`.

### 🔹 Set
- **No index**, **no duplicates**.
- Implementations:
  - `HashSet`: Unordered, unsorted.
  - `LinkedHashSet`: Ordered by insertion, unsorted.
  - `TreeSet`: Sorted by natural order, ordered by sorting logic.

---
note:- 
- Collections is class in java and collection is interface.

Generics:-  introduced in JDK-5
          - strongly recommended to use collection class with Generic.
            to make collection Type-safe
          - collection without Generic is known as raw-type, thought it is allow not recommended to used.
          - collection with Generic can create run-time issue we must avoided by resolve these error 
            during campile time, to do so we use Generic.
Iterator:-
     its interface present in java.util.package.
     this interface implemented by respective collection class 
 step to use Iterator:-
 1. obtain the Iterator object by invoking iterator method of respective collection object.
 2. write a loop to check if collection object has next element is present in it,
    by invoking hasNext() method of Iterator object. 
 3. get the next element from collection by invoking next() method of Iterator object.
 4. optionaly we can remove aspeacific element from collection object 
    by invoking remove() method of Iterator objetc.
 5. Iterator is inner class of all TreeSet, HashSet, ArrayList,Vector etc.
 
Comparable interface:-
               It is an interface.
               It belongs to the java.lang package.
               It has one abstract method: public int compareTo(T o) — which accepts one argument of the same type.
               This interface is used to define the natural sorting order for a class.
note:-
 using Comparable we can provide only one sorting algorithum for any specific class.
 but in real world we might want to sort object of specific of class multiple different criteria .
 to do so java offer built-in interface-- Comparator

 Comparator:- It is an interface.
               It belongs to the java.util. package.
               It has one abstract method: public int compare(o o) — which accepts two argument of the same type.
               This interface is used to define the additional sorting  part from natural sorting order for a class.
               it is also functional Interface.
                           Map (I)
                             ⬇
                ┌──────────────────────────────┐
                │HashMap           (C)         │
                │LinkedHashMap     (C)         │
                │TreeMap           (C)         │
                │Hashtable         (C)         │
                │SortedMap (I) → TreeMap (C)   │
                │ConcurrentHashMap (C)         │
                └──────────────────────────────┘

 Map: store element as Key , value where key is unique, value can be duplicate.
 HashMap: Legacy, thread-safe,slower in performance
 Hashtable  : Unordered, unsorted.
 LinkedHashMap: ordered by insertion, unsorted.
 TreeMap: sorted by natural sorting on key, ordered.

 java.util.date class:-
java.util.Date is a class in Java used to represent date and time (up to milliseconds precision).
It stores both date (day, month, year) and time (hours, minutes, seconds, milliseconds).

Key Points:

Belongs to the java.util package.

Represents a specific instant in time (a timestamp).
Internally stores time as the number of milliseconds since January 1, 1970, 00:00:00 GMT (known as the Epoch time).
Many of its methods (like getYear(), getMonth()) are deprecated — modern Java uses java.time API (LocalDate, LocalTime, LocalDateTime).

Common Constructors:
Date d1 = new Date();               // current date and time
Date d2 = new Date(long millis);    // specific time in milliseconds since 1970

Common Methods:
Method	Description

getTime()->	Returns time in milliseconds since Jan 1, 1970
setTime(long millis)->	Sets time using milliseconds
before(Date d)->	Checks if this date is before the given date
after(Date d)->	Checks if this date is after the given date
compareTo(Date d)->	Compares two dates
toString()->	Returns date and time as a readable string
Example:
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current Date and Time: " + date);
    }
}


Output:

Current Date and Time: Wed Nov 12 13:45:30 IST 2025

Note:

Use classes from java.time package (like LocalDate, LocalDateTime) in modern Java instead of java.util.Date for better accuracy and clarity.
