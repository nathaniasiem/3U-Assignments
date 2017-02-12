
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;
import static javafx.scene.input.KeyCode.M;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author candy
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new city named Sentosa
        City sentosa = new City();
        
        //create new robot 
        Robot maria = new Robot(sentosa,0,1,Direction.WEST);
        
        //Label robot maria with M
        maria.setLabel("M");   
               
        //Change colour of robot maria
        maria.setColor(Color.pink);
        
        //create another robot
        Robot karel = new Robot (sentosa,3,3,Direction.EAST);
        
        //Label robot karel with K
        karel.setLabel("K");
        
        //Change colour of robot karel
        karel.setColor(Color.blue);
        
        //karel's expensive items are dropped
        new Thing(sentosa,0,0);
        new Thing(sentosa,1,0);
        new Thing(sentosa,1,1);
        new Thing(sentosa,1,2);
        new Thing(sentosa,2,2);
        
        //build karel's home
        new Wall(sentosa,2,3,Direction.WEST);
        new Wall(sentosa,2,3,Direction.NORTH);
        new Wall(sentosa,2,3,Direction.EAST);
        new Wall(sentosa,3,3,Direction.EAST);
        new Wall(sentosa,3,3,Direction.SOUTH);
                             
        //maria helps pick up some items
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        
        //karel goes back to pick up his items
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        
                
        
        
        
        
        
    }
    
}
