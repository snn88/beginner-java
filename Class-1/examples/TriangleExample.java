import kareltherobot.*;

/*
	PURVA’S CODE
	TRIANGLE PROJECT
*/
public class TriangleExample {
	Robot robbie;
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    new TriangleExample().start();
	}

	private void start() {
		robbie = new Robot(1,1,East, 0);
		int steps=3;
		robbie.putBeeper();
		while(steps>0){
			robbie.move();
			turnRight();
			robbie.move();
			robbie.putBeeper();
			robbie.turnLeft();
			steps--;
		}
		turnRight();
		turnRight();
		steps=3;
		while(steps>0){
			robbie.move();
			robbie.turnLeft();
			robbie.move();
			robbie.putBeeper();
			turnRight();
			steps--;
		}
		steps=6;
		turnRight();
		while(steps>0){
			robbie.move();
			robbie.putBeeper();
			steps--;
		}
	}
	public void turnRight(){
		int turns = 0;
		while(turns<3){
			robbie.turnLeft();
			turns++;
		}
//		start();
	}
}