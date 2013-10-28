# Java Lesson 3

Date: 7/26/13
Duration: 1.5 Hours

## Goals/Objectives: 

1. Get familiar with Java
2. Review commenting, variables, and methods.
3. Keep working on last project.
4. Possibly introduce IF statements.

## Ice Breakers + Introduction (15 minutes)
Go through the group: state your name and say something you like that starts with the first letter of your name (e.g. I am Christine, and I like cats). `// This may be omitted`.

### Introduction
 - If you were here for the last few lessons (which would have been preferable), you should already have Eclipse and a basic understanding of Java. One of us will help you privately if you haven’t.
 - Today, we will be going more in depth. 
 - Commenting: examples of why it would be useful (writing your name/what program it is, leaving notes for other programmers, leaving reminders for yourself)
 - Variables: what’s a variable? Ask about variables in math. How is that different from/similar to Java?

## Demos (20 minutes):
Start a project called “Lesson 2” and make a class called `Lesson2` with a main method. (Ask if anyone remembers what `main` does.)
### Commenting (using eclipse) (go through briefly)
 - PC: hold control and press slash
 - Mac: hold command and slash
 - Remember that comments have a `//` in front of the “phrase”

### Variables (go through briefly)
 - Review/List most commonly used variables (int, double, boolean, string)
     - show using Eclipse how to successfully declare a variable 
     - show how to successfully use a variable/change a variable
### Methods (go through briefly)
 - Review how to use a method (must have an object that is able to access that method)
 - Review what the method does when analyzing code (look at what it returns, changes, etc.)
 - Draw a diagram explaining the relationship between objects and methods. (This might be a little bit out of the blue: my analogy is a person who has weapons/healing stuff/whatever that they can use, and they can either use it to modify themselves or change another person.)

### Commands that you should know:
 - `System.out.println` (Have them try printing something)
 - Imports (Explain how a program can access anything in the Java library: graphics, arrays, math functions, etc.)

### `if` Statements (go through thoroughly):
[http://mathbits.com/MathBits/Java/Conditionals/If.htm]

 - The statements are in an if/then format

```java
if(test condition){
	block of statements;
}```

 - If the test condition evaluates to false, then the block of statements is not executed, but if the test condition is true, then the block of statements will be executed.
#### Examples:

```java
if (grade = = 'A'){
   System.out.println("Frig Grade");
}
if (true){
 	System.out.println("Way to go!");
 	System.out.print("The x is true!");
}
```

#### Using `else if` and `else` statements
You use `else if` and `else` statements in order to reduce the number of `if` statements or to condense/simplify code so that when the `if` statement evaluates to false, then you can move to the `else` statement or `else if` statement.

Example: [examples/IfElseDemo.java]

## Challenges and/or Work Time (45 minutes): 
Finish previous program before working on this.
Write a choose your own adventure story (this will involve nested “if” statements). 

Example: [examples/AmadorAdventureDriver.java]

## Evaluation and Closing (10 minutes)
 - Recap everything taught today
 - Ask if they have any questions
 - Stay behind to evaluate progress/programs
 - Collect any materials given out
