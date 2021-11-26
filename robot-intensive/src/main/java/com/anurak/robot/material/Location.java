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
public class Location extends Game{
    protected int x,y;
    
    public Location setLocation(int x,int y){
        this.x = x;
        this.y = y;
        System.out.println("Set Location Complete");
        return this;
    }
    
    protected void moveUp(){
        this.x = this.x - 1;
//        map.setState();
    } 
    
    protected void moveDown(){
        this.x = this.x + 1;
//        map.setState();
    } 
    
    protected void moveLeft(){
        this.y = this.y - 1;
//        map.setState();
    } 
    
    protected void moveRight(){
        this.y = this.y + 1;
//        map.setState();
    } 
    
    protected static boolean checkOutOfBound(Map argmap, char dir){
        if (dir == 'w' && robotLocate.x == 0){
            return true;
        }
        if (dir == 'a' && robotLocate.y == 0){
            return true;
        }
        if (dir == 's' && robotLocate.x == argmap.map.length-1){
            return true;
        }
        if (dir == 'd' && robotLocate.y == argmap.map[0].length-1){
            return true;
        }
        return false;
    }
    
//    @Override
    public boolean equals(Location arg){
        if(this.x == arg.x && this.y == arg.y){
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return String.format("[%d][%d]", this.x , this.y);
    }
}
