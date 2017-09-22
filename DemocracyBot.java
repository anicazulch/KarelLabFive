
import kareltherobot.*; 


/**
 * @author :  A. Zulch
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixBallots() {
        checkBallot();
        returnToPosition();
        checkBallot();
        returnToPosition();
        checkBallot();
        returnToPosition();
        checkBallot();
        returnToPosition();
        checkBallot();
    }
    public void checkBallot() {
        move();
        if (nextToABeeper()){
            placeBallot();
        }
        else {
            pickUpBallot();
        }
    }
    public void placeBallot() {
        faceNorth();
        while (frontIsClear()){
            move();
        }
        if (nextToABeeper()){
            faceSouth();
            while (frontIsClear()){
                move();
            }
        }
        else {
            faceSouth();
            while (!nextToABeeper()){
                putBeeper();
            }
            while (frontIsClear()){
                move();
            }
        }
        if (nextToABeeper()){
            faceNorth();
            move();
        }
        else {
            while (!nextToABeeper()){
                putBeeper();
            }
            faceNorth();
            move();
        }
    }
    public void pickUpBallot(){
        faceNorth();
        while (frontIsClear()){
            move();
        }
        if (!nextToABeeper()){
            faceSouth();
            while (frontIsClear()){
                move();
            }
        }
        else {
            faceSouth();
            while (nextToABeeper()){
                pickBeeper();
            }
            while (frontIsClear()){
                move();
            }
        }
        if (!nextToABeeper()){
            faceNorth();
            move();
        }
        else {
            while (nextToABeeper()){
                pickBeeper();
            }
            faceNorth();
            move();
        }
    }
    public void returnToPosition() {
        faceEast();
        move();
    }
    public void faceNorth(){
        while (!facingNorth()){
            turnLeft();
        }
    }
     public void faceEast(){
        while (!facingEast()){
            turnLeft();
        }
    }
      public void faceSouth(){
        while (!facingSouth()){
            turnLeft();
        }
    }
      public void faceWest(){
        while (!facingWest()){
            turnLeft();
        }
    }
}

