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
public class Bird extends Poultry{
    
    public Bird(String name, String cols){
       super(name, "Global", false, false, cols);
    }
    
    @Override
    public void speak(){
        System.out.println("Bird Speak");
    }
    
    @Override
    public String toString(){
        return String.format("Bird: %S,\n\tColor: %s\n\tWarm Blood: %b\n\tHabitat: %s\n", name, colors, warmBlood, habitat);
    }
}
