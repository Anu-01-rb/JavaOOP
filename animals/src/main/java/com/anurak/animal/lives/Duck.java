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
public class Duck extends Birds{
    
    public Duck(String name, String cols){
       super(name, "Global", true, true, cols);
    }
    
    @Override
    public void speak(){
        super.speak();
        System.out.println("Duck Speak");
    }
    
    @Override
    public void walk(){
        super.walk();
        System.out.println("Duck Walk");
    }
    
    @Override
    public void fly(){
        super.fly();
        System.out.println("Duck Fly");
    }
    
    @Override
    public String toString(){
        return String.format("My name is %s, I'm a duck I'm %s, I have wings", name , colors);
    }
}
