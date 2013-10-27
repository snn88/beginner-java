import kareltherobot.*;

/*
	PURVA’S CODE
	SQUARE WITH 4 WHILE LOOPS
*/
public class SquareExample2 {
	Robot robbie;
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    new SquareExample2().start();
	}

	private void start() {
		robbie = new Robot(1,1,East, 0);
		int steps=4;
		robbie.putBeeper();
		while(steps>0){
			robbie.move();
			robbie.putBeeper();
			steps--;
		}
		turnRight();
		steps=4;
		while(steps>0){
			robbie.move();
			robbie.putBeeper();
			steps--;
		}
		turnRight();
		steps=4;
		while(steps>0){
			robbie.move();
			robbie.putBeeper();
			steps--;
		}
		turnRight();
		steps=4;
		while(steps>0){
			robbie.move();
			robbie.putBeeper();
			steps--;
		}
    }
	public void turnRight() {
		robbie.turnLeft();
		robbie.turnLeft();
		robbie.turnLeft();
	}
}