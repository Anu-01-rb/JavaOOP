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
public class TestTriang {
    public static void main(String[] args) {
        Geometry tag = new Triangle();       //Create tag Object from Geometry Class
        tag.setValue(6,4);                   //Set value(base, height) to tag
        System.out.println(tag);             //Print tag
        tag.getValue();                      //Require all value in tag
        tag.setValue(-1,5);                  //Re-Set value to tag
        System.out.println(tag);             //Print tag
        tag.setValue(6,0);                   //Re-Set value to tag
        System.out.println(tag);             //Print tag
    }
}
