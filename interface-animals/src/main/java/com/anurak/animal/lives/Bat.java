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
public class Bat extends Poultry{
    
    public Bat(String name, String cols){
       super(name, "Global", false, false, cols);
    }
    
    @Override
    public void speak(){
        System.out.println("Bat Speak");
    }
    
    @Override
    public String toString(){
        return String.format("Bat: %S,\n\tColor: %s\n\tWarm Blood: %b\n\tHabitat: %s\n", name, colors, warmBlood, habitat);
    }
}
