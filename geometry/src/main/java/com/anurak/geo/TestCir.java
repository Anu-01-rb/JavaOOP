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
public class TestCir {
    public static void main(String[] args) {
        Geometry circle = new Circle();         //Create circle Object from Geometry Class
        circle.setValue(6);                     //Set value(Rasius) to circle
        System.out.println(circle);             //Print circle
        circle.getValue();                      //Require all value in circle
        circle.setValue(0);                     //Re-Set value to circle
        System.out.println(circle);             //Print circle
    }
}
