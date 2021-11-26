/*
 * OOP : Object-Oriented Programming
 * Abstract : Animals Project
 */
package com.anurak.animal.lives;

/**
 *
 * @author Anurak Yutthanawa
 * 63160015 B.Sc. Computer Science
 * Burapha University
 *
 */
abstract public class Poultry extends Animals{
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
    	System.out.printf("%s is flying and %s can walking a little.\n", this.name, this.name);
    }
    
    @Override
    abstract public String toString();
}
