# Java Lesson 1
Duration: 1 Hour

## Notes
 - Keep students’ computers closed until the challenge begins.
 - Bring extenders, power strips

## Goals/Objectives
1. Download Eclipse
2. Get familiar with Java
3. Learn commenting, variables, and commands.
4. `If`, `while`, and `for` loops.

## Ice Breakers + Introduction (15 minutes):
 - Have all of the teachers introduce themselves. Explain what Java is and the things they will be learning in today’s class.
 - The kids can say their name, grade, and school and say one interesting fact about themselves. (For example: My name is Purva, I am going to be a junior at Amador and my favorite subject is computer science.)
 - Tell them to ask questions after the teacher is done explaining/prompts for questions.
**Teacher 1/2**: Getting started/Syntax, Object declaration
**Teacher 3/4**: function creation, variables
**Teacher 5/6**: Conditional statements and while loops  

## Topics (20 minutes): 
### Syntax/Getting started 
 - Type out this line of code and ask kids to figure out what it means:

```java
Robot robbie=new Robot (1,1, North, 100);
```

 - Make sure they figure out: we’re creating a new robot, the robot is called `robbie`, and try to lead them into figuring out (1,1, North,...) means robbie is at 1,1 and facing North
    - (street,avenue, direction, number of beepers) 
    - Note: there has to be beepers in order for robbie to run 	
 - Type these lines of code and ask kids to point out  what re-occurs a lot: 

```java
robbie.turnLeft(); 
robbie.move();
robbie.putBeeper();
robbie.move();
robbie.turnLeft();
robbie.turnLeft();
if(robbie.isFrontClear() =true) {
	robbie.turnLeft();
	robbie.move();
}
```

 - Make sure they figure out: always `robbie.____` so we can tell `robbie` what to do, there is always `();` at the end of the command because it tells the computer that it is the end of the command, and that the if statement only does what’s in the brackets and **double check that they understand this**.  
     - **CHALLENGE**: Have them make karel run in a square.
         - Objective: getting use to Karel commands/syntax 

### Variables: `int` and `boolean`s 
 - Explain that one of the basic programming variables is an integer otherwise known as an `int`
 - Demonstrate how to declare an `int` (i.e. `int pencils= 1;` )
     - Explain how to change an int (i.e.  `pencils = pencils+1` or `pencils = pencils+pencils` which is same as `pencils = pencils*2`)
     - The left side of the expression becomes the value of the right side. 
     - **CHALLENGE**: Have karel count each step it takes when going in a square and print out the total number of steps it takes. 
         - Objective: have students get used to creating integers and modifying them. Also reviewing/learning that they can print out variables using `System.out.println();` 
 - Explain that another basic variable is a variable that indicates true/false and it’s called a boolean   
     - Demonstrate how to declare a boolean (i.e. boolean doesAlexWantPie= false; ) 
     - **CHALLENGE**: Have karel return the boolean “isSquareDone” as true when Karel finishes the square. The program will exit when karel hits a wall and the IDE (eclipse) prints out “true.” 
         - Objective: Getting used to using booleans when conditions are met and using system.out.println for booleans as well. 

### Basic Object Declaration  
 - Explain that the `robbie` in `robbie.move();` is the name of our Karel Robot and we can have another Karel Robot named `bob` if we wanted 
     - show them how to make a robot named `bob`
     - **EXTRA CHALLENGE**: have them make 3 different robots in the world and have the first run in a straight line, the second run and make a left turn, and the third run and make a u-turn


### Function Construction 
 - Explain to them a function is a set of commands that we create.
 - `public static void main` is a function . It is the function that is executed when you run the class.
     - function returns either: `int`, `boolean`, or `void` (Nothing)
     - Show them how to create a function called “turnRight” 

```java
public void turnRight(){ 
    robbie.turnLeft();
    robbie.turnLeft();
    robbie.turnLeft();
}
```
 - **CHALLENGE**: have them create a function that will make Karel draw a 4x4 square. Have them use their function in the driver class. 

 - Explain that functions can take in arguments or pre-established variables 
     - i.e. `public int addition(int a, int b)` and it would return the sum of `a”`and `b` 
     - `return a+b`;
     - **CHALLENGE**: modify the function so that it take in the length of a square (int length) and it will draw a square length x length 


### Conditional Statements 
 - Ask a lot of “if” questions 
     - What if the Robot hit a wall? What if the Robot meets a beeper? What if the Robot meets another Robot? What if the Robot is facing East? 
     - Prompt them to come up with the syntax for `if` statements 
     - **CHALLENGE**: Make them create an `if` statement that checks if Karel has any beepers and if so, then place a beeper.
     - The command for checking if there are any beepers is `anyBeepersInBeeperBag();`
 - Demonstrate the uses of `if` statements 
     - If “A” happens AND “B” happens `A&&B`
     - If “A” or “B” happens `A||B`
     - Explain `!=` statements

### While / For Loops
 - Have students draw out square without while
 - Have students identify pattern
 - Explain `while`

```java
int x=4;
while (x>0){
	you.eathamburger();
	x--;
}
while(r.anyBeepersInBeeperBag() == true){
	r.putBeeper();
}
```

 - Relate `while` to `robbie`
 - Have them change code to include `while`
 - Ask them how would they get Karel to drop beepers in the shape of a square
     - **CHALLENGE**: Make them draw out a four by four square
 - Ask if they thought a lot of the commands were repetitive and annoying 
     - Ask how else can you ask the robot to do something repetitively 
         - Encourage them to come up with their own syntax and try to guide them to the correct answer 
     - ANSWER: While loops: While (condition A is true){ proceed with following commands} 
     - Demonstrate how to use a while loop using ints and booleans 
 - Have them cut down their code from their first challenge using while loops
 - Ask if they were using a lot of variables to complete their loops 
     - Demonstrate to them how to use a `for` loop: `for(int i=0; i<0 ; i++) `
     - Ask them to read that line of code out loud and ask them what do they think this means. 
     - Prompt them as much as possible so they can arrive at the answer themselves 
 - **CHALLENGE**: Have Karel make a 4 x 4 square with beepers  
 - **CHALLENGE**: Have Karel make a 6 x 6 square with beepers  
 - **CHALLENGE**: Have Karel make a 50 x 50 square with beepers (good time to show how eclipse finds possible methods for you when you type `World`).  
 - **CHALLENGE**: Have Karel trace the outer edge of the world using beepers 



### Extra Challenges 
1. Draw triangle/circle/rectangle/snowflake
2. Make it pick up all of the beepers in the world
3. Pick up certain beepers 
4. Make Karel “hurdle” over walls
5. Count the beepers in the largest pile 
    - Locate the largest pile 
7. Pick up a certain pile of beepers and move it to the location of the largest pile
8. Collect all beepers into 1 pile.
9. Make two robots and have them both do things.  
10. Add user input using Scanner to get the requested size of the square  

```java
Scanner s = new Scanner(System.in); 
int length = s.nextInt();
```

10. Make it so that when the robot is making the square he alternates between putting one and two beepers.(using booleans)

### Evaluation and Closing (10 minutes)
Go over the different things learned.

Answer any questions.

Show what the final result should look like.

Tell them when the next session is.
