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
abstract public class Animals {
     
     protected String name;
     protected boolean warmBlood;
     protected boolean haveHair;
     protected boolean haveWings;
     protected boolean haveLegs;
     protected String habitat;
     protected String colors;
     
    Animals (String name, boolean wb, boolean hh, boolean hw, boolean hl, String hbt, String cols){
        this.name = name;
        this.warmBlood = wb;
        this.haveHair = hh;
        this.haveWings = hw;
        this.haveLegs = hl;
        this.habitat = hbt;
        this.colors = cols;
    }
    
    abstract public void speak();
    
    abstract public void move();
    
    @Override
    abstract public String toString();
}
