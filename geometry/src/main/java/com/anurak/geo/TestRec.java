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
public class TestRec {
    public static void main(String[] args) {
        Geometry rect = new Rectangle();      //Create rect Object from Geometry Class
        rect.setValue(6,4);                   //Set value(width, height) to circle
        System.out.println(rect);             //Print rect
        rect.getValue();                      //Require all value in rect
        rect.setValue(0,5);                   //Re-Set value to rect
        System.out.println(rect);             //Print rect
        rect.setValue(6,-1);                  //Re-Set value to rect
        System.out.println(rect);             //Print rect
    }
}
