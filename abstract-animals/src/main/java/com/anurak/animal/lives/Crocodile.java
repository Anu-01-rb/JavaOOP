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
public class Crocodile extends Reptile{
    
    public Crocodile(String name, String cols){
        super(name, true,"Global", 4, cols, true);
    }

    @Override
    public void speak(){
        System.out.printf("%S Crocodile Speak???\n", name);
    }

    @Override
    public void move(){
    	System.out.printf("%S Crocodile Swimming\n", name);
    }
    
    @Override
    public String toString(){
        return String.format("Crocodile: %S,\n\tColor: %s\n\tWarm Blood: %b\n\tHabitat: %s\n\tLeg: %d\n\tLive in land and water: %b\n", name, colors, warmBlood, habitat, numberOfLegs, landAndWater);
    }
}
