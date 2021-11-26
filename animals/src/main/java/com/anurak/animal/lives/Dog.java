/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.animal.lives;

/**
 *
 * @author anurak
 */
public class Dog extends Mammals{
    
    public Dog(String name, boolean hh, String cols){
        super(name, hh, true, "Global", 4, cols);
    }
    @Override
    public void speak(){
        super.speak();
        System.out.println("Dog Speak");
    }
    
    @Override
    public void walk(){
        super.walk();
        System.out.println("Gog Walk");
    }
    
    @Override
    public String toString(){
        return String.format("My name is %s, I'm a cat I'm %s", name , colors);
    }
}
