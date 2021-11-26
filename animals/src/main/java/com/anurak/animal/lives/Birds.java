/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.animal.lives;

/**
 *
 * @author anurak
 */
public class Birds extends Animals{
    protected boolean lowFly;
    protected boolean floatOnWater;
    
    Birds(String name, String hbt, boolean lf, boolean fow, String cols){
        super(name, true, true, true, true, hbt, cols);
        this.lowFly = lf;
        this.floatOnWater = fow;
    }
    
    @Override
    public void speak(){
        super.speak();
        System.out.println("Birds Speak");
    }
    
    @Override
    public void walk(){
        super.walk();
        System.out.println("Birds Walk");
    }
    
    public void fly(){
        System.out.println("Birds Fly");
    }
    
    @Override
    public String toString(){
        return String.format("My name is %s, I'm a bird I'm %s, I have wings", name , colors);
    }
}
