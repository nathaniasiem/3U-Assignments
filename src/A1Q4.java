
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // // create new city named Sentosa
        City sentosa = new City();
        
        //create new robot 
        Robot merlion = new Robot(sentosa,0,0,Direction.SOUTH);
        
        //create another robot
        Robot Karel = new Robot (sentosa,0,1,Direction.SOUTH);
        
        // build barrier between robots
        new Wall(sentosa,0,1,Direction.WEST);
        new Wall(sentosa,1,1,Direction.WEST);
        new Wall(sentosa,1,1,Direction.SOUTH);
        
        //move merlion and karel simultaneously
        merlion.move();
        Karel.move();
            //
        
    }
}
