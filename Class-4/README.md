# Java Lesson 3

Date: 8/8/13
Duration: 1.5 Hours

## Goals/Objectives

Inheritance, making classes, keyboard interaction, using java swing Graphics, using a Timer

## Introduction (30 seconds)
You will be making a game in which the player controls a dude who has to dodge falling rocks from scratch(no pun intended).  Lets get to it.

## Making the game ( 80 minutes)
(Instructor)For each step, type in the code line by line(no copy-paste) and explain what each line does;

### Step 1
Make a new project, call it whatever you want.

### Step 2
Make a new class called Frame
A frame is what holds things. Examples: eclipse, windows explorer, command line, task manager. Our game is definitely going to need a Frame.

```java
public class Frame extends JFrame {
public Frame() {
setSize(500, 500); // set the size of the frame, in pixels. 500*500 should be good for now;
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// skype doesnt have this, which is why when you click the x, IT MINIMIZES!!!
setVisible(true);// lets make sure people can see the frame;
}
public static void main(String[] args) {
new Frame();
}
}
```

Now try running, you should see an empty Frame appear.

other options you should add in the constructor:

```java
setTitle(“Dodge”);
setResizable(true/false);// let them decide;
```


### Step 3: Making the Panel

In order to draw things on our frame, such as the player and the falling rectangles, we need a Panel. Let's make one!

We are going to make a class within a class.
The Panel will then conveniently know everything the Frame knows, because the Panel class is inside the Frame class.
Inside class `Frame`, but outside of any functions, add:

```java
public class Panel extends JPanel {
public void paintComponent(Graphics g) {// this function is called by the frame to redraw whatever needs drawing;
g.setColor(Color.blue);// set the color;
g.drawRect( 10, 20, 30, 40); // let them figure out what each argument does.
}
}
```

Run the program. What? It doesn’t do anything? That's because we haven't actually made a Panel yet. We only told Frame that theoretically at some point a Panel could exist and do things such as paintComponent. To actually make a Panel, in the Frame constructor add:

```java
Panel pansy = new Panel();
pansy.setVisible(true);// Panels should be visible;
this.add(pansy);
```

Now run it, and you should see a blue rectangle. Hurray!

### Step 4: Making the player

Let's make a class called Player

```java
public class Player {

}
```

What qualities does a player need to have? (hint at x, y, width, height until they shout it out).
right under `public class Player {`, write:
	
```java
int x, y, width, height;
	public Player(int x, int sy, int sw, int sh) {
		x = sx;
		y = sy;
		w = sw;
		h = sh;
	}
}
```

Now let's actually make a Player.
in `Frame`:

```java
Player bob;
```

at the end of Frame constructor:

```java
bob = new Player(x, y, width, height);
x = ? //
y = ? // where they want the player to start off; Keep in mind this is in pixels;
// remember, the player should start somewhere near the bottom of the screen
width = ?   //
height = ? //how big they want the player;
```

So now we have a player. Let's have the Panel draw the player correctly:
in `paintComponent()`

```java
bob.draw(g);
```

Now in `Player`, add a function

`public void draw(Graphics g) {
g.setColor(Color.blue);
g.drawRect(x, y, w, h);
}`

So now the player exists;

### Step 5: Adding User Input

We want the game to react when you press buttons on the keyboard. To do this, we need a `KeyListener`.

Let's make another class within `Frame` and call it `Listener`.

```java
public class Listener implements KeyListener {

}
```

Let's let Eclipse add unimplemented methods.

These methods will get called whenever you press or release a key, we need to check if the key pressed is a or d so that we can move the player accordingly.

```java
public void keyPressed(KeyEvent arg0) {
	if(arg0.getKeyCode()==KeyEvent.VK_A) {
		bob.x = bob.x-1;
	}
if(arg0.getKeyCode()==KeyEvent.VK_D) {
		bob.x = bob.x+1;
	}
}
```

In the frame constructor:

```java
this.addKeyListener(new Listener());
```

#### Step 5.5: Adding Timer

We need to make a timer that will tic every set amount of time so that rocks and other things in our game move and interact.
in class Frame we add

```java
Timer tim;
```

Thenn in the constructorn we need to initialize tim.

```java
tim = new Timer(100, );
```

The first arguement is the time in milliseconds
The second is an `ActionListener`, we can make our `Listener` class also be implement `ActionListener`.

```java
implements KeyListener, ActionListener {

}
```

Let Eclipse make the methods for you.

```java
actionPerformed(ActionEvent e) {
	//for now we only need 
	repaint();
}
```

Now `tim = new Timer(100, new Listener());`
`tim.start();`

### Step 6: Creating the `Rock` class
Make a new class called `Rock`.
a Rock needs to have coordinates and size, so

```java
public class Rock {
	int x, y, w, h;
	//and we need a constructor;
	public Rock(int sx, int sy, int sw, int sh) {
		x = sx;
		y = sy;
		w = sw;
		h = sh;
	}
}
```

In this game, rocks will fall, so let's add a fall function to Rock.

```java
public void fall() {
	//how to make it go down?
	y=y+1;
}
```

Rocks also need to be drawn.

```java
public void draw(Graphics g) {
	g.setColor(new Color(122, 40, 2);
	g.fillRect(x, y, w, h);
}
```

### Step 7: Adding Rocks to the game
In `Frame`:

```java
ArrayList<Rock> rocks;
```

In the `Frame` constructor we need to initialize rocks.

```java
rocks = new ArrayList<Rock>();
```

Let's make a Rock.

```java
Rock rocky = new Rock(200, -100/*make it start outside of the screen*/, 50, 50);
rocks.add(rocky);
```

Now we need all the rocks to fall every tick, so in actionPerformed:

```java
for(int a=0; a<rocks.size(); a++) {
	Rock r = rocks.get(a);
	r.fall();
	//remove the rock from the list if it has fallen past the floor
	if(r.y>500) {
		rocks.remove(r);
	}
}
```

and all the rocks need to be drawn, so in `paintComponent(Graphics g)`

```java
	for(int a=0; a<rocks.size(); a++) {
		Rock r = rocks.get(a);
		r.draw(g);
	}
}
```

try running.

### Step 8: Collision detection

Lets add that right after a rock falls, it asks the player if it collided with him.

```java
for(int a=0; a<rocks.size(); a++) {
	Rock r = rocks.get(a);
	r.fall();
	if(bob.checkCollide(r)) {
		rocks.remove(a);
		a--;
	}
}
```

in Player we add

```java
public boolean checkCollide(Rock r) {

}
```

Now, let's think what combination of the Player’s `x`, `y`, `w`, `h` and the Rock’s `x`, `y`, `w`, `h` is the rock hitting the Player.
Go to Paint and draw this picture:


**TODO**: Picture



so first we check if the rock is at the correct y;

```java
if(r.y+r.h<this.y) {

}
```

then we need to see if the x lines up




**TODO**: Picture




so check

```java
if(r.x+r.w<this.x || p.x+p.w<r.x) {// means no collision
	return false;
} else {// otherwise there is
	return true;
}
```

### Step 9: Rocks automatically spawn

In `Frame`, add an integer:

```java
int timetorockspawn;
```

in `actionPerformed()`

```java
	if(timetorockspawn--<0) {
		Rock newrock = new Rock( Math.random()*500, -100, 50, 50);
		rocks.add(newrock);
		timetorockspawn = 10;
	}
```

### Step 10: Other things you can add on your own
 - Player can't move outside the screen.
 - Rocks spawn more and more as the game progresses.
 - Player has health, hitting a rock removes health, and when you run out you lose.
 - A powerup can drop occasionally which increases speed or health.
 - Add another player to make the game multiplayer.


## Closing ( 5 minutes)


