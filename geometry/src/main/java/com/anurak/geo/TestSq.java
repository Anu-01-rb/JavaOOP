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
public class TestSq {
    public static void main(String[] args) {
        Geometry sqr = new Square();         //Create sqr Object from Geometry Class
        sqr.setValue(6);                     //Set value(length) to sqr
        System.out.println(sqr);             //Print sqr
        sqr.getValue();                      //Require all value in sqr
        sqr.setValue(-1);                    //Re-Set value to sqr
        System.out.println(sqr);             //Print sqr
    }
}
