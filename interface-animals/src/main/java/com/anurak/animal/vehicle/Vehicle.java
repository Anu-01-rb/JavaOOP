/*
 * OOP : Object-Oriented Programming
 * Interface : Animals Project
 */
package com.anurak.animal.vehicle;

import com.anurak.animal.interfaces.*;

/**
 *
 * @author Anurak Yutthanawa
 * 63160015 B.Sc. Computer Science
 * Burapha University
 *
 */
public class Vehicle {
    protected String engine;
    protected String brand;
    protected String model;
    
    Vehicle(String brand, String model, String engine){
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }
    
}
