/*
 * OOP : Object-Oriented Programming
 * Interface : Animals Project
 */
package com.anurak.animal.vehicle;

/**
 *
 * @author Anurak Yutthanawa
 * 63160015 B.Sc. Computer Science
 * Burapha University
 *
 */
public class Car extends Vehicle implements Runnable{
    
    public Car(String brand, String model, String engine){
        super(brand, model, engine);
    }

    @Override
    public void run() {
        System.out.printf("%S is running.\n", this.model);
    }
    
}
