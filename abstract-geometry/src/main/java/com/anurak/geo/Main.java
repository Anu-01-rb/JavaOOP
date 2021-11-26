/*
 * OOP : Object-Oriented Programming 
 * Abstract
 */
package com.anurak.geo;

import shape.Square;
import shape.Rectangle;
import shape.Geometry;
import shape.Triangle;
import shape.Circle;

/**
 *
 * @author Anurak Yutthanawa
 * 63160015 B.Sc.Computer Science
 * Burapha University
 *
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
