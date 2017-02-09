
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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new city named Sentosa
        City sentosa = new City();
        
        //create new robot 
        Robot merlion = new Robot(sentosa,2,1,Direction.SOUTH);
        
        //build wall in the city
        new Wall(sentosa,4,4,Direction.EAST);
        new Wall(sentosa,3,4,Direction.EAST);
        new Wall(sentosa,3,4,Direction.NORTH);
        new Wall(sentosa,3,3,Direction.NORTH);
        new Wall(sentosa,3,3,Direction.WEST);
        new Wall(sentosa,4,3,Direction.WEST);
        new Wall(sentosa,4,4,Direction.SOUTH);
        new Wall(sentosa,4,3,Direction.SOUTH);
        
        //move robot Merlion around 
        merlion.move();
        merlion.move();
        merlion.turnLeft();
        merlion.move();
        merlion.turnLeft();
        merlion.turnLeft();
        merlion.turnLeft();
        merlion.move();
        merlion.turnLeft();
        merlion.move();
        merlion.move();
        merlion.move();
        merlion.turnLeft();
        merlion.move();
        merlion.move();
        merlion.move();
        merlion.turnLeft();
        merlion.move();
        merlion.move();
        merlion.move();
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
        
        
        
        
        
        

        
        
        
        
        
        
        
             
        
        
        
        
        
        
       
        
        
        
  
        
    }
}
