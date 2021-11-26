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
public class Animals {
//     public String respiratorySystem;
     
     protected String name;
     protected boolean warmBlood;
     protected boolean haveHair;
     protected boolean haveWings;
     protected boolean haveLegs;
     protected String habitat;
     protected String colors;
     
    Animals (String name, boolean wb, boolean hh, boolean hw, boolean hl, String hbt, String cols){
        this.name = name;
        this.warmBlood = wb;
        this.haveHair = hh;
        this.haveWings = hw;
        this.haveLegs = hl;
        this.habitat = hbt;
        this.colors = cols;
    }
    
    public void speak(){
        System.out.println("Animals Speak");
    }
    
    public void walk(){
        System.out.println("Animals Walk");
    }
    
    @Override
    public String toString(){
        return String.format("My name is %s, I'm an animal, I'm %s", name , colors);
    }
}
