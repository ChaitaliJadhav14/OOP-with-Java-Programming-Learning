java
- java is case-sensitive language.

identifer: user define name give to variable, class, package, constant etc,which are meaning full.
rules for identifer :
 1- keyword connot be identfier.
 2- identfier name con't contain space, speacial character.
 3- identfier connot start with digit.
 4- identfier can be alphabet, digit,underscore.
 5- it can be any length.

Name Convention

1:- class:
  - first letter of class should be uppercase, if class contain more then 1 word first letter of 2 word should upperCase.

2- Naming convention for constants:

- Every letter should be uppercase.
- If it consists of more than one word, separate each word with an underscore. Example: MAX_HEIGHT      
        

1. JVM (Java Virtual Machine)
   It is the engine that actually runs Java bytecode (the .class files).
   It provides:
   Memory management (heap, stack)
   Garbage collection
   Platform independence — same bytecode runs on Windows, Linux, etc.
💡 You can think of the JVM as the interpreter/executor that reads .class files and executes them.

2. JRE (Java Runtime Environment)-JRE-JRE use JVM  to run .class file
   JRE = JVM + Libraries + Supporting Files
   It provides everything you need to run Java programs — not to compile them.
📦 JRE includes:
    The JVM
    Core Java class libraries (like java.lang, java.io)
    Other files needed for execution
💡 If you only want to run Java programs (not write or compile them), JRE is enough.

3. JDK (Java Development Kit)
   JDK = JRE + Development Tools
   It is used by developers to write, compile, and run Java programs.
📦 JDK includes:
    JRE
    Compiler (javac)
    Debugger, profiler, documentation tools, etc.
💡 If you’re coding in Java (like HelloWorld.java), you need the JDK.

The process is:

JDK (using javac) → compiles .java → creates .class file (bytecode).
JRE (via JVM) → reads .class file → executes it line by line.

Your Code (.java)
   ↓  [javac]
Bytecode (.class)
   ↓  [JVM runs]
Program Output



variable:- 
-variable is named container which can store a value and the value changed(vary)
syntax:
  // data_type name of variable

Convention for variable:
- variable name should be small and meaning full.
- first letter of first word short in smallcase if variable cantain muiltiple word except first word should upperCase.

java offers following 8 Primitive data types :

Number store-whole number
-byte
-short
-int
-long

store decimal
-float
-double

Any character in single '' it could be  digit , alphabet etc
-char

true & false
-boolean


type casting

long b= 20;         boolean b =true;
int a=10;            int a= 10;
b=a;    ✔️              b= a;❌
a=(int)b;  ✔️           a=b❌


long l= 20;        
int a=10;            
l=a;     //widening    : it automatic done   
a=(int)l; //narrowing: it explicity done by type casting

Method:
// syntax of Method declaration:
 access_specifer return type name_of_method(argument/s if any){//access_specifer optional

}

Method Convention:
- Method should start from verb - display, play, calculate etc
- Method name can also consist of verb followed by noun  eg- getName(), setId(), calculateSalary()
- in java a method connot be define inside the another method.
- first letter of first word short in smallcase if variable cantain muiltiple word except first word should upperCase.
- method is only excuted only when invoked.


constum Method:
void print(){};
void printName(String name);


operators: which perform operation on operand

1- Assignment operator: use to assign value to variable.
 age= 20;

2- Relational operator:>,<,>=, <= etc (it return Output true or false)
  age> 18;

3- Arithmetic operator:+,-,*,/,% 

4- logical operator:&& ,||, !


switch: it use in mene driven code
it is not mandatory after every case. but excution case will happen till the first break is encounterred. this ptocessis known as fall through as excution.


IDE : it offer following feature:
- indentation
- autocompeletion - the movement to save source auto compilation happen
- {} matching
- color highlighting
these feature help developers to write code quickly with less efforts and time hence will working on real project . use preferred IDE
ECLIPSE
STS 
INTELLIJ
NETBEAN

note:- 
1- if you make change in source you must recompile the source code
2- dotclsss is created only if there no syntactical error in source. 
3- System and String are inbulit class.
4- java statically type language. it means compile must known type of variable.
5- name Convention
6- indentation
7- comments if needed
    single comments---//
    muilti comments---/*     */
    document comments---/**    */
8- in java any condition experince result has to boolean  type if not then compilation error occure.
9- if we have one statement in if block, else if block, else writing {} is optional.
10- for, while loops known for entry control loop.
11- do-while loop for exist control loop.
12- main method no need to compilation. 
13- in java class name should be noun.
14- Cohesion refers to the degree to which a class has a single, well-defined focus or responsibility.
  --->Highly cohesive classes 
  Benefits of highly cohesive classes include:
     - Reusability
     - Maintainability

      
