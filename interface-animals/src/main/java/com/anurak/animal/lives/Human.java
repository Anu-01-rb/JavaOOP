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
public class Human extends Land{
    
    public Human(String name){
        super(name, true, true, "Global", 2, "Skinny");
    }

    @Override
    public void speak(){
        System.out.println("Human Speak");
    }
    
    @Override
    public String toString(){
        return String.format("Human: %S,\n\tColor: %s\n\tWarm Blood: %b\n\tHabitat: %s\n\tLeg: %d\n", name, colors, warmBlood, habitat, numberOfLegs);
    }
}
