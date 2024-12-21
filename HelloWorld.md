That is the first Java program you will write
Hint: there have something that will not appaer in AP exam; I will mark them using **

**Firsety, I wnat to tell you something about how a Java program run.
  When you click the run buttom, your source code will be compiled by java compiler( JAVC )
  Then, a xxx.class file will be created that is the program will run.
  Next, the class file will send into JVM( Java Virtual Mechine ), it will deal all rest of thing.
  


```
public class HelloWorld{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Now I will explain each sentence in detail.
```
public class HelloWorld
```
public is a keyword in Java, which means that this program cna be access in other pack/program/file....
class is also a keyword in Java which menas to create a class (you don't have to konw what is that right now, it will be intoduced in other moudle.)
HelloWorld is the name of the public class 
REMEMBER!!! One file can only contain one public class, and the name of the public class must equals to the file name!!!!!!!!!
```
public static void main(String[] args)
```
This is a special method in Java called main method, (you also don't have to konw what is the method yet, 
if you have the background of other programm laguage like C++ you can condider that as a function) 
A program can not run without this method.
In AP exam you don't have to write this method by own.  
**String[] args also can write as String args[] like c/c++ ;these kinds of data called parameter, the input valuse of a method.
**Someone may be familiar with this parameter, it allow as type the input in cmd/consle which make the debug more convenient.
void is a data type in Java directing meaning is "nothing"; you have to konw that each function must retun a value, void data type
means return "nothing".
```
System.out.print("Hello, World!");
```
This means print Hello， World！on the screen
