/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.animal;

import com.anurak.animal.lives.*;
/**
 *
 * @author anurak
 */
public class Main {
    public static void main(String[] args){
        Cat sommiew = new Cat("sommiew", true, "B&W");
        Dog aibo = new Dog("aibo", true, "Brown");
        Duck sally = new Duck("sally", "Dark Brown");
        
        Animals[] animals = {sommiew, aibo, sally};
        
        for(Animals i : animals){
            System.out.println(i);
            i.walk();
            i.speak();
            if(i instanceof Birds){
                ((Birds)(i)).fly();
            }
        }
    }
}
