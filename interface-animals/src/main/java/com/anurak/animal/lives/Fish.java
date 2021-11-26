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
public class Fish extends Aquatic{
    
    public Fish(String name, String cols){
        super(name, "Global", cols, false);
    }

    @Override
    public void speak(){
        System.out.printf("%S Fish Speak???\n", name);
    }

    @Override
    public void move(){
    	System.out.printf("%S Fish Swimming\n", name);
    }
    
    @Override
    public String toString(){
        return String.format("Fish: %S,\n\tColor: %s\n\tWarm Blood: %b\n\tHabitat: %s\n", name, colors, warmBlood, habitat);
    }
}
