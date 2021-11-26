/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.robot.material;


/**
 *
 * @author anurak
 */
public class Robot extends Game{
    
    public  void setIcon(char icon){
        rIcon = icon;
        System.out.printf("Robot icon has been set to %c\n",rIcon);
    }
    
    public void setPosition(Map map,Location loc){
        robotLocate = loc;
        System.out.println("Setting position");
        map.locateObject(robotLocate,rIcon);
        System.out.println("Position has been set");
    }
    
    public void walk(Map map,char dir){
        if (Location.checkOutOfBound(map, dir)){
            return;
        }
        if (dir == 'w'){
            robotLocate.moveUp();
        }
        if (dir == 'a'){
            robotLocate.moveLeft();
        }
        if (dir == 's'){
            robotLocate.moveDown();
        }
        if (dir == 'd'){
            robotLocate.moveRight();
        }
        map.setState(map);
    }
    
    @Override
    public String toString(){
        return "Position of this robot is " + robotLocate;
    }
}
