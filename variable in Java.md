# VARIBLES
## Hint: there have something that will not appaer in AP exam; I will mark them using **

There have a array of data type in Java 
Let's see
```
public class varible {
    int val0 = 0;
    double val = 0.0;
    float val2 = 0.0f;
    boolean val3 = false;
    char val4 = 'a';
    String val5 = "Hello";
    byte val6 = 127;
    short val7 = 32767;
    long val8 = 9223372036854775807L;
}

```
Seems like it's difficult to understand these thing right？ Even this code just contain some of data type of Java! 
Don't worry most of data type will not apper in AP exam

### Firstly I will tell you the basic characterristics of some data type
```int``` means integer, int type such as 114, 514, 1919, 810 etc. The upper bound of ```int``` is 2147483647, lower bound is -2147483648
**```float```which menas floating-point type, in other words it can store fractional part of a number such as 3.1415f, 2.71f, 0,13567f etc range :  -3.403E38~3.403E38
```double```which menas double floa; it have bigger voulme and more precise fractional part of a number such as 0.0, 2,3, 3,1415, 2.71828 etc range : -1.798E308~1.798E308
```char``` represent characters in the normal sense (1 character =2 bytes). All characters in Java are encoded in Unicode, so a character can store a letter like "A" "c"
```boolean```only can store true and false
```string```Is a special data type called reference type. generally, it just strore a address of data(like a pointer in c/c++) ; string data looks like "hello" "Are you happay today?"
etc

### Then I will tell some rule of operation for data type
double can store the value int, but int can't store double varible
Example:
```
int a = 0;
double b= 9.7;
a = b //IS INVAILD !!!!!!!!!
b = a //yes!!!
b-=a //yes!!!
a-=b //NOOOOOOOOOOOOOOOO!!!!
```
Rules of String  sth like this : 1+1=11 
```
String s0 = new String("thanks for your watching!!!");
String s1 = "aaa";
String s2 = "bbb";
String s3 = s1+s2   // equals aaabbb
```

## reference type
We can use ```new``` keyword to create a reference type
reference type store a address for actuall value of varible 
somesting like this:
```
int a = new Integer(90);
double b = new Double(8.7);
```











