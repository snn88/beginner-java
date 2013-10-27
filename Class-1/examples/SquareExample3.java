import kareltherobot.*;

/*
	PURVA’S CODE
	SQUARE WAY #2 1 Loop
*/
public class SquareExample3 {
	Robot robbie;
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    new SquareExample3().start();
	}

	private void start() {
		robbie = new Robot(1,1,East, 0);
		robbie.putBeeper();
		int side=4;
		int steps=4;
		while(side>0){
			steps=4;
			while(steps>0){
				robbie.move();
				robbie.putBeeper();
				steps--;
			}
			side--;
			turnRight();
		}
    }
	public void turnRight() {
		robbie.turnLeft();
		robbie.turnLeft();
		robbie.turnLeft();
	}
}