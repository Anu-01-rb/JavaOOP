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
abstract public class Land extends Animals{
    
    
    protected int numberOfLegs;
    
    
    Land(String name, boolean hh, boolean hl, String hbt,int legs, String cols){
        super(name, true, hh, false, hl, hbt, cols);
        this.numberOfLegs = legs;
    }
    
    @Override
    abstract public void speak();
    
    @Override
    public void move(){
    	System.out.printf("%s is walking", this.name);
    }
    
    @Override
    abstract public String toString();
}
