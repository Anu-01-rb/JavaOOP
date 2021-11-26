/*
 * OOP : Object-Oriented Programming
 * Interface : Animals Project
 */
package com.anurak.animal.lives;

import com.anurak.animal.interfaces.Runnable;

/**
 *
 * @author Anurak Yutthanawa
 * 63160015 B.Sc. Computer Science
 * Burapha University
 *
 */
abstract public class Land extends Animals implements Runnable{
    
    
    protected int numberOfLegs;
    
    
    Land(String name, boolean hh, boolean hl, String hbt,int legs, String cols){
        super(name, true, hh, false, hl, hbt, cols);
        this.numberOfLegs = legs;
    }
    
    @Override
    abstract public void speak();
    
    @Override
    public void move(){
    	run();
    }
    
    @Override
    public void run(){
        System.out.printf("%s is running", this.name);
    }
    
    @Override
    abstract public String toString();
}
