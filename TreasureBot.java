
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public int beepers;
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findTreasure() {
        while (nextToABeeper()) {
            determineDirection();
            travel();
        }
    }
    public void travel(){
        move();
        while (!nextToABeeper()){
            move();
        }
    }
    public void determineDirection(){
        beepers = 0;
        while (nextToABeeper()){
            pickBeeper();
            beepers ++;
        }
        if (beepers == 1){
               faceNorth();
            }
           else if (beepers == 2){
                faceEast();
            }
           else if (beepers == 3){
                faceSouth();
            }
            else if (beepers == 4){
                faceWest();
            }
           else if (beepers == 5){
               turnOff();
            }
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

    