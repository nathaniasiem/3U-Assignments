
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
 * @author candy
 */
public class A1Q3 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new city named Sentosa
        City sentosa = new City();
        
        //create new robot 
        Robot merlion = new Robot(sentosa,3,0,Direction.EAST);
        
        //create flag
        new Thing(sentosa,3,1);
        
        //build mountain
        new Wall(sentosa,3,2,Direction.WEST);
        new Wall(sentosa,3,2,Direction.NORTH);
        new Wall(sentosa,2,3,Direction.WEST);
        new Wall(sentosa,1,3,Direction.WEST);
        new Wall(sentosa,1,3,Direction.NORTH);
        new Wall(sentosa,1,3,Direction.EAST);
        new Wall(sentosa,2,4,Direction.NORTH);
        new Wall(sentosa,2,4,Direction.EAST);
        new Wall(sentosa,3,4,Direction.EAST);
        
        //Climbing the mountain with flag 
        merlion.move();
        merlion.pickThing();
        merlion.turnLeft();
        merlion.move();
        merlion.turnLeft();
        merlion.turnLeft();
        merlion.turnLeft();
        merlion.move();
        merlion.turnLeft();
        merlion.move();
        merlion.move();
        merlion.turnLeft();
        merlion.turnLeft();
        merlion.turnLeft();
        merlion.move();
        merlion.putThing();
        
        //Travelling back down mountain
        merlion.move();
        merlion.turnLeft();
        merlion.turnLeft();
        merlion.turnLeft();
        merlion.move();
        merlion.turnLeft();
        merlion.move();
        merlion.turnLeft();
        merlion.turnLeft();
        merlion.turnLeft();
        merlion.move();
        merlion.move();
        merlion.turnLeft();
       
        
        
        
        
        
        
        //
    }
    
}
