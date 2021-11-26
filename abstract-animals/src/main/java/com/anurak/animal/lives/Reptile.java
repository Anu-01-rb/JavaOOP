
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
abstract public class Reptile extends Animals{
    
    
    protected int numberOfLegs;
    protected boolean landAndWater;
    
    Reptile(String name, boolean haveLeg, String hbt, int legs, String cols, boolean landAndWater){
        super(name, false, false , false, haveLeg, hbt, cols);
        this.numberOfLegs = legs;
	this.landAndWater = landAndWater;
    }
    
    @Override
    abstract public void speak();
    
    @Override
    abstract public void move();
    
    @Override
    abstract public String toString();
}
