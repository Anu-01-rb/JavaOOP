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
public class Bomb extends Game{
    
    
    public void setIcon(char icon){
        bIcon = icon;
        System.out.printf("Bomb icon has been set to %c\n",bIcon);
    }
    
    public void setPosition(Map map,Location loc){
        bombLocate = loc;
        System.out.println("Setting position");
        map.locateObject(bombLocate,bIcon);
        System.out.println("Position has been set");
    }
    
    
    @Override
    public String toString(){
        return "Position of this bomb is " + robotLocate;
    }
}
