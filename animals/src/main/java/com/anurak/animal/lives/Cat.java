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
public class Cat extends Mammals{
    
    public Cat(String name, boolean hh, String cols){
        super(name, hh, true, "Global", 4, cols);
    }
    @Override
    public void speak(){
        super.speak();
        System.out.println("Cat Speak");
    }
    
    @Override
    public void walk(){
        super.walk();
        System.out.println("Cat Walk");
    }
    
    @Override
    public String toString(){
        return String.format("My name is %s, I'm a cat I'm %s", name , colors);
    }
}
