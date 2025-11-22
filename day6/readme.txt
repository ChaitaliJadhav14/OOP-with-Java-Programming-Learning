Exception Handling:- 
       Any abnormality that causes the program to terminate abruptly without informing the user or the system.
       if you don't want system crash abruptly, we must Handle the Exception.

    java offer keyword:

    try - it is block. 
          it is written inside a method
          It is used to enclose statements that might generate an exception.
    catch:-it is block. 
          it is written inside a method.
          it used to handle the Exception.
note:- exception flow:
       - as soon as exception is generate in try block control is transfer from try block to first matching catch block.
       - no statements in try block are excuted After the statement which generated the exception.
       - if exception is generate then  object of that type is created by JVM and it is thrown must we catch .
       - exception Handling in java is object oriented hence java offer class for each type of exception
              eg ArrayIndexOutOfBoundsException,NullPointerException,ArithmeticException etc
       - Generic exception- all type of exception of Generic(Exception e)
       - Generic catch must always be written as the last catch block otherwise campiler complains.
       - you must have specific catch block than have Generic block.

    finally:- it is block. 
          it is written inside a method.
          A statement that must be executed irrespective of whether an exception is generated or not should be placed inside a finally block.
          eg:- Closing Resources in Java.
          it is use to avoid Resource leakage issue.
           ex- database connection
           
    throw:- it used to throw an exception  programatically.
            useful in case for user-defined exception.
       

    throws:- it is used to declare that method might throw an exception.
             hence calling method must either handle or declare to be handle.
             throws keyword used propagating the exception.


 note-: each exception type in java is direct or indirect subclass of exception.
    -- every exception class is subclass of Exception.
     in java 2 type of exception
     1. unchecked exception : any exception which is sub type of RuntimeException is known as unchecked exception.
         such exception are not force to handle or declare by java campiler.
         eg:-NullPointerException
     2. checked exception: any exception which is not sub class of RuntimeException is checked exception.
        eg IOException, SqlException,classNotFoundException
         such exception are force to handle or declare by java campiler.

                    Exception
                      ↗️ ↖️
                    ↗️     ↖️
                  ↗️         ↖️
                ↗️             ↖️
              ↗️                 ↖️
        IOException            RuntimeException
                                      ⬇️
                                      ⬇️
                                      ⬇️
                                      ⬇️
                                      ⬇️ 
                               NullPointerException

User-define exception :-
     these are custom business exception basedon custom business logic 
     a developer need to create user define exception class
    STEP TO create:-
    1. create a class.
    2. extends from exception class for checked exception or extends its from RuntimeException for unchecked exception         

note:-
Invalid combination:-
  1. try{}
  2. try{} any statement catch{}. not statement allowed between try and catch.

eg:-    try {
		int result= num1/num2;
		System.out.println("result: "+ result );
		
		}
		//System.out.println("hello");
		catch(ArithmeticException e) {
			System.out.println("Connot divide by zero");
		}
   3.
IO file:- 
    Data stored in primary memory is deleted after the execution of the application.
     Almost all real-world applications need to store data permanently. 
     To achieve this, we store data in secondary storage in the form of files. 
     Example: Java allows us to work with files by providing many built-in classes, which are available in the java.io package.
java offer two differnt hierarchies.
1. for reading from the files
2. writing into the file

InputStream                  OutputStream 
   ⬆️                             ⬆️
   ⬆️                             ⬆️
   ⬆️                             ⬆️
FileInputStream              FileOutputStream     

step for :
1. identify the opeartion we want to perform, based on operation choose the appropriate class.
2. create the object of that class, while creating the object associate file with this object by passing name of the file in the constructor.
3. invoke either read method or write method.
4. close the Resource.
note:-  when we tring to read a file using InputStream java expects the file must be existance otherwise file not found exception will throw.
        when try to write in file using FileOutputStream and if file not existance, a blank new file is created.
        when we try to write in file using OutputStream and if file exist with data , a blank new file created.be clearful to opening file using OutputStream.

Serialization:-
         it is process in which state of object is converted to byte stream, 
         so that it can save into file system or it can be pass over the network,
         this is use in case of distributed application.
step for Serializable:
1. the object of a class which we want to Serialize that class must implement 
   Serializable interface.
2.  create a object of FileOutputStream and associate with the file.
3. create an onject of CbjectOutputStream associate with the FileOutputStream object.
4. invoke writeObject method of ObjectOutputStream class to that method pass an object of class which we want to Serialize.
5. close the Resources.

Deserialization this is process to convering byte stream to object form
step for Deserialization:
1. the object of a class which we want to Serialize that class must implement 
   Serializable interface.
2. create a object of FileInputStream and associate with the file. 
3. create an onject of CbjectInputStream associate with the FileInputStream object.
4. invoke readObject method of ObjectInputStream class  and cast appropriate ref type.
5. close the Resources.
Valid combination:-
  1. try{} catch{}
  2. one try{} can have multiple catch{}.
  3. try{} catch(Exception e){} finally{}.
  4. try{} without catch but with finally{} but not handle the exception.
  5. nesting is allowed.
   

