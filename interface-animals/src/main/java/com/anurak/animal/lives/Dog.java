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
public class Dog extends Land{
    
    public Dog(String name, String cols){
        super(name, true, true, "Global", 4, cols);
    }

    @Override
    public void speak(){
        System.out.println("Dog Speak");
    }
    
    @Override
    public String toString(){
        return String.format("Dog: %S,\n\tColor: %s\n\tWarm Blood: %b\n\tHabitat: %s\n\tLeg: %d\n", name, colors, warmBlood, habitat, numberOfLegs);
    }
}
