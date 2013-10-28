# Java Lesson 2

Date: 7/18/13
Duration: 1.5 Hours

## Goals/Objectives
1. Introduction to higher level logic                                                                                            
    a. Sorting
    b. Searching
2. Introduction to Strings
3. Introduction to Data Management
    a. Arrays
    b. Lists
4. More Variable Types 
    a. Doubles
    b. Chars   

**Teacher 1**: variable types 
**Teacher 2**: strings, random variables  
**Teacher 3**: ArrayLists, Searching  
**Teacher 4**: Arrays, Sorting

## Topics

### Variables: Doubles, Chars and Casting
 - Explain there are 2 more variable types: doubles and chars 
 - **Doubles**: numbers with decimal points
     - Demo: `double cost= 5.20;`
     - Quick activity: 

```java
int num=10; 
int stuff=2;
double cost=4.20;
int answer = num + stuff - cost; 
```

     - Answer: 8
     - **CHALLENGE**: Create a tip calculator when user inputs total amount spent 
     - **CHALLENGE**: Create a calculator that will take into account of each person’s orders and calculate how much each person has to pay with tax and tip. Also, have the calculator automatically take into account of when there are parties of 6+, tips increase 18%.  
 - **Casting**: converting one variable type to another 
     - Demo: 
	 
```java
int num=5; 
double dub= 5.3; 
double stuff = (double)num+dub;
```

 - **Chars**: single characters
     - **ASCII**: Explain that a bunch of old dudes got together and standardized char values to certain numbers because ultimately, a computer is a device made up of numerous switches of 1 and 0’s. By assigning regular base ten numbers to all the different char’s, and then converting them to binary, we are able to translate our code into a series of on and off switches.  
     - **CHALLENGE**: Create a program that will translate a string into a char into ASCII and display the ASCII. Make it do it the otherway around: ASCII to string


### Strings
 - They are “strings” of text, a combination of chars (e.i. Hello World!) 
 - You can do several things with a string:
     - Find its length 

```java
String name= new String(“Daniel”); 
System.out.println(name.length); 
```

     - Create shorter strings with the long string 
     - `name.substring(beginIndex, endIndex);`
     - NOTE: the place value for each char starts with 0 
         - Daniel 
         - D=0, a=1, n=2, i=3, e=4, l=5
     - Trimming a string takes off first and last letters of the string
         - `System.out.println(name.trim());` returns: anie 
     - and more…
 - **CHALLENGE**: Make a program that identifies if a string is a palindrome or not
     - Give this to students for more reference/ the other things that strings can do <http://docs.oracle.com/javase/tutorial/java/data/manipstrings.html>

### Random Variables

### ArrayLists
 - They are essentially “lists” that contain information that you put in it

## Evaluation and Closing (10 minutes)

