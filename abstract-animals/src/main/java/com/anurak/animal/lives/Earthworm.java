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
public class Earthworm extends Animals{
    
    public Earthworm(String name, String cols){
        super(name, true, false, false, false, "Global", "Brown");
    }

    @Override
    public void speak(){
        System.out.printf("%S Earthworm Speak???\n", name);
    }

    @Override
    public void move(){
    	System.out.printf("%S Earthworm Wiggling\n", name);
    }
    
    @Override
    public String toString(){
        return String.format("Fish: %S,\n\tColor: %s\n\tWarm Blood: %b\n\tHabitat: %s\n", name, colors, warmBlood, habitat);
    }
}
