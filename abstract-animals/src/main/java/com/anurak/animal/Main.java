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
        
        Cat nini = new Cat("Nini", "Orange");
        Dog ricky = new Dog("Ricky", "White");
        Human plaifah = new Human("Plaifah");
        Fish nemo = new Fish("Nemo", "Red");
        Crab krabby = new Crab("Krabby", "Orange");
        Bird gag = new Bird("Gag", "White");
        Bat vampy = new Bat("Vampy", "Black");
        Crocodile baroque = new Crocodile("Baroque", "Brown");
        Snake medusa = new Snake("Medusa", "Dark");
        Earthworm palm = new Earthworm("Palm", "Pink");
        
        Animals[] sut = {nini, ricky, plaifah, nemo, krabby, gag, vampy, baroque, medusa, palm};
        
        for (Animals i : sut){
            i.speak();
            i.move();
            System.out.println(i);
        }
    }
}
