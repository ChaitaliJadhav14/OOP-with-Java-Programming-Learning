Hashcode and equal method:
                  Any object which need to be added in any collection class which
uses hashing technique,must appropriatly implements (override) hashcode and equal
methods these two methods are object superclass.
signature of hashcode
                   public int hashCode(){

                   }
HashCode give us right bucket where can be found,appropriatly hashCode implement 
is necessary to reduce number of comparison so that performance will be inproved.

syntax for equals:
           public boolean equals(object o){
                 return 0;
           }
For object used in collection with hashing must appropriatly override hashCode 
and equals methods of Superclass. 
note- String and Integer class appropriatly hasCode   


multi-threading
Abiliy to multiple tasks simultaneously with in process,

thread: small execution path with in a process.
        it also called as indepandent path of execution with in process.
        It is used to improve performance by minimizing idle time of the CPU.
        for better user experience.
        gaming apps.
        java support multi-threading by following two ways

      1 by extends Thread class.
      2 by implementing Runnable inferface.
      both are from java.lang package.

      step to used to thread
    1. create a class 
    2. extends its Thread class or implement Runnable interface 
    3. override run() method.
    4. create a objec of thread and invoke start() method.
    5. you should never ever call run method call directly instead we should call 
      start method which create separate thread of execution. 
    note:-  
    - by default each thread assign a name which we can retrieve by invoking
    getName() method.
    - each thread also assign priority , priority range to 0 to 10 where 1 means-
      min priority or 10- max priority ,
      priority is way to performance for execution .
      we get the priority by invoking getPriority method.
    - execution of  thread is completely under the control of JVM which thread
      will execute and for how long is decide by JVM but every thread is 
      start will be eaxcuted for sure.
    - JVM is decide to switch one thread to another
    - each thread remember own context and resume accordingly.
    thread life cycle:

        +----------------+
        |    NEW         |  --> Thread object created
        |  (Born State)  |
        +----------------+
               |
               | .start()
               v
        +----------------+
        |   READY        |  --> Thread is ready to run
        | (Runnable)     |
        +----------------+
              ^ |
              | | Scheduler picks thread
              | v
        +----------------+
        |   RUNNING      |  --> Thread is executing
        +----------------+
               |
               | run() completes or stop() called
               v
        +----------------+
        |    DEAD        |  --> Thread has finished execution
        +----------------+

in java by default 2 thread created 
main and garbage collector
In web application multiple request will be given by multiple client for each request
a new thread is created by web container

Race Condition:
     when muiltiple thread are trying to access same resource at same time 
     it lead to race comdition, which lead to data inconsistency.
to avoid race condition we used the concept of synchronous

Synchronous:
       Each object in Java has an associated lock, also known as a monitor.When
        a thread accesses a resource by invoking any synchronized method of an
       object, that thread acquires the object’s lock and becomes the owner of
        the monitor.
---The lock is mutually exclusive, meaning no other thread can access the same 
    resource at the same time.
---The lock mechanism is activated only when the method is declared as synchronized.
---We can apply a lock to a resource by synchronizing a method using the synchronized keyword.

InterThread communication:
            thread communicate each other following three method
            - wait()
            - notify()
            - notifyAll()
            -  present in object super class.
            -  make sure call the method on the object by thread  which owner of monitor
               otherwise exception is genrated.
            -  invoking wait() method moves thread from running state to wating state
               invoking notify() method notify() all method loose the thread from watting state to ready to run state.


               +----------------+
               |     NEW        |   --> Thread object created
               |  (Born State)  |
               +----------------+
                       |
                       | .start()
                       v
               +----------------+
               |    READY       |   --> Thread is ready to run
               |  (Runnable)    |
               +----------------+
                      ^  |
     Scheduler picks  |  | Thread yields or becomes ready again
                      |  v
               +----------------+
               |   RUNNING      |   --> Thread is executing
               +----------------+
                  |        |
                  |        | .sleep(), .wait(), or blocked on I/O
                  |        v
         +----------------+     +----------------+
         |   SLEEPING     |     |    WAITING     |
         | (Timed Wait)   |     | (Indefinite)   |
         +----------------+     +----------------+
                  |                     |
                  | After sleep time    | notify() / notifyAll() called
                  +----------+----------+
                             |
                             v
               +----------------+
               |    READY       |   --> Back to runnable state
               +----------------+
                       |
                       | run() completes or stop() called
                       v
               +----------------+
               |     DEAD       |   --> Thread has finished execution
               +----------------+
 
 
- invoking wait method moves the thread from running thread to waiting state invoking notify, notifyAll() method moves the thread from waiting state to ready to run state.
- wait method releases the lock and goes to wait state unless some other thread notifies the waiting thread the by invoking notify, notify all method
- if notification not send thread is waiting state will remaining waiting state forever
hence make sure that invoke notify or notifyAll() appropriately-invoking wait method moves the thread from running thread to waiting state invoking notify, notifyAll() method moves the thread from waiting state to ready to run state.

- sleep method does not releases the lock but wait method releases the lock.

thread starvation:
         a thread with lower priority might never get chance to execute as developer make sure to avoid this.
to avoid this use yield() method    ->> static method which present thread class.
    sleep yield()->> static method 
    getPriority, setPriority->> non static method 
    default- non-priority

note : 
A call to the start() method of a thread creates a separate call stack for that thread.
At the bottom of this stack is the run() method.
When the execution of the run() method is completed, the call stack is destroyed, which means the thread has terminated (Dead state).

Thread.start()  --->  Creates a new call stack
                          |
                          v
   |    |         +--------------------+
   |    |         |     run() method    |  <-- Entry point of the thread
   |    |         +--------------------+
   |    |         |     other methods   |
   |main|         |   called by run()   |
   |____|         +--------------------+
                          |
                          v
        run() completes --> Call stack destroyed --> Thread DEAD


Functional interfaces added in jdk 8
these are present in java.util.function
================================================

name              Argument             retrun                method

Predicate<T>        Y                 boolean                test()
Function<I,O>       Y                   Y                    apply()
Supplier<T>         N                   Y                    get()
Consumer<T>         Y                   N                    accept()

Predicate(filter)

Imperative programming :
            in which developer need to implement step by step process to get result in other words developer focus on what he want and how its to be done. 

declarative programming :
             in which developer only declare what he want and does not implement how. to implement we use lambda expression in java.











































