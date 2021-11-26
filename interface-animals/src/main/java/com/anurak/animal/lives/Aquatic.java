/*
 * OOP : Object-Oriented Programming
 * Interface : Animals Project
 */
package com.anurak.animal.lives;

/**
 *
 * @author Anurak Yutthanawa
 * 63160015 B.Sc. Computer Science
 * Burapha University
 *
 */
abstract public class Aquatic extends Animals{
    
    Aquatic(String name, String hbt, String cols, boolean haveLegs){
        super(name, false, false, false, haveLegs, hbt, cols);
    }
    
    @Override
    abstract public void speak();
    
    @Override
    abstract public void move();
    
    @Override
    abstract public String toString();
}
