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
public class Crab extends Aquatic{
    
    public Crab(String name, String cols){
        super(name, "Global", cols, true);
    }

    @Override
    public void speak(){
        System.out.printf("%S Crap Speak???\n", name);
    }

    @Override
    public void move(){
    	System.out.printf("%S Crap Walking\n", name);
    }
    
    @Override
    public String toString(){
        return String.format("Crap: %S,\n\tColor: %s\n\tWarm Blood: %b\n\tHabitat: %s\n", name, colors, warmBlood, habitat);
    }
}
