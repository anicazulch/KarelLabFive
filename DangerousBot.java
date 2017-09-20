
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public int beepers;
    
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void choosePile() {
        decideEvenOrOdd();
        chooseRoom();
    }
    public void decideEvenOrOdd() {
        while (nextToABeeper()) {
            pickBeeper();
            beepers++;
        }
        
    }
    public void chooseRoomEast() {
        faceEast();
        move();
        while (nextToABeeper())
        {
            pickBeeper();
        }
        faceWest();
        move();
        faceNorth();
    }
    public void chooseRoomWest() {
        faceWest();
        move();
        while (nextToABeeper())
        {
            pickBeeper();
        }
        faceEast();
        move();
        faceNorth();
    }
    public void chooseRoom(){
        if (beepers % 2 == 0){
            chooseRoomEast();
        }
        else {
            chooseRoomWest();
        }
    }
    public void faceEast(){
        while (!facingEast()) {
            turnLeft();
        }
    }
    public void faceWest(){
        while (!facingWest()) {
            turnLeft();
        }
    }
    public void faceNorth(){
        while (!facingNorth()) {
            turnLeft();
        }
    }
}

