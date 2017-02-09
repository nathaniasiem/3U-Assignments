
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new city named Sentosa
        City sentosa = new City();
        
        //create new robot 
        Robot merlion = new Robot(sentosa,1,2,Direction.SOUTH);
        
        //building merlion's home
        new Wall(sentosa,1,2,Direction.NORTH);
        new Wall(sentosa,1,1,Direction.NORTH);
        new Wall(sentosa,1,2,Direction.EAST);
        new Wall(sentosa,1,2,Direction.SOUTH);
        new Wall(sentosa,1,1,Direction.WEST);
        new Wall(sentosa,2,1,Direction.WEST);
        new Wall(sentosa,2,1,Direction.SOUTH);
        
        //newspaper is delivered
        new Thing (sentosa,2,2);
        
        //merlion wakes up,picks up newspaper and goes back to bed with newspaper
        merlion.turnLeft();
        merlion.turnLeft();
        merlion.turnLeft();
        merlion.move();
        merlion.turnLeft();
        merlion.move();
        merlion.turnLeft();
        merlion.move();
        merlion.pickThing();
        merlion.turnLeft();
        merlion.turnLeft();
        merlion.move();
        merlion.turnLeft();
        merlion.turnLeft();
        merlion.turnLeft();
        merlion.move();
        merlion.turnLeft();
        merlion.turnLeft();
        merlion.turnLeft();
        merlion.move();
        merlion.turnLeft();
        merlion.turnLeft();
        merlion.turnLeft();
        merlion.putThing();
        
        
       
        
        
        
        
    }
    
}
