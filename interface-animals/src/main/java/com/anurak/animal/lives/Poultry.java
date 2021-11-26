/*
 * OOP : Object-Oriented Programming
 * Interface : Animals Project
 */
package com.anurak.animal.lives;

import com.anurak.animal.interfaces.Flyable;

/**
 *
 * @author Anurak Yutthanawa
 * 63160015 B.Sc. Computer Science
 * Burapha University
 *
 */
abstract public class Poultry extends Animals implements Flyable{
    protected boolean lowFly;
    protected boolean floatOnWater;
    
    Poultry(String name, String hbt, boolean lf, boolean fow, String cols){
        super(name, true, true, true, true, hbt, cols);
        this.lowFly = lf;
        this.floatOnWater = fow;
    }
    
    @Override
    abstract public void speak();
    
    @Override
    public void move(){
    	fly();
    }
    
    @Override
    abstract public String toString();
    
    @Override
    public void fly() {
        System.out.printf("%S is flying.\n", this.name);
    }
}
