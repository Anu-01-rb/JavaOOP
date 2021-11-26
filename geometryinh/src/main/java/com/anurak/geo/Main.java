/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.geo;

import shape.Square;
import shape.Rectangle;
import shape.Geometry;
import shape.Triangle;
import shape.Circle;

/**
 *
 * @author anurak
 */
public class Main {
    public static void main(String[] args) {
        Circle cir = new Circle(10);
        Rectangle rtg = new Rectangle(10,10);
        Square sqr = new Square(10);
        Triangle tag = new Triangle(10,10);
        
        Geometry[] shape = {cir, rtg, sqr, tag};
        
        for(Geometry i : shape){
            i.getValue();
            System.out.println(i);
        }
    }
}
