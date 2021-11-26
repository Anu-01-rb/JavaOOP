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
abstract class Geometry{
    
    void setValue(double radius){}                      //Create setValue Method for make subclass Override
    void setValue(double width, double height){}        //Overload setValue method to make Override
    void getValue(){}                                   //Create getValue for make subclass Override
    
    @Override
    public String toString(){                           //Create toString to make subclass Override next
        return "The data is empty";
    }
}





