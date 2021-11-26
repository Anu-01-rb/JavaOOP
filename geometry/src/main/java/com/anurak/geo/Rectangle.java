/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.geo;

/**
 *
 * @author anurak
 */
public class Rectangle extends Geometry{
    //Declare all need variable
    private double width;  
    private double height;
    private double area;
    private final double fml = 0.5;
    
    //Creade setValue to get 2 arguments
    //And check all arguments must greater than 0
    //Then set into class variable
    @Override
    public void setValue(double width, double height){                  
        if (width <= 0){
            System.out.println("Width must greater than 0");
            return;
        }
        if (height <= 0){
            System.out.println("Height must greater than 0");
            return;
        }
        this.width = width;
        this.height = height;
        area = fml * height * width;
    }
    
    //Create getValue to make variable can check the value of all needed class variable
    @Override
    public void getValue(){
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
    }

    //Override toString to use with print medthod
    @Override
    public String toString(){
        return (this.area != 0)? String.format("This Rectangle area is: %.2f", area) :
                String.format("Please Enter the value");
    }
}
