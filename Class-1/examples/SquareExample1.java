import kareltherobot.*;

public class SquareExample1 {
    public static void main(String args[]){
        square(5);
    }
    
    public static void square(int length){
        Robot r = new Robot(1,1,Directions.East,500);
        World.setVisible(true);
        World.setDelay(10);
        int sides = 4;
        
        while(sides > 0){ 
            int l = length;
            while(l > 0){
                r.move();
                r.putBeeper();
                l--;
            }
            r.turnLeft();
            sides--;
        }
    }
}