/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author anurak
 */
public class Geometry{
     
    protected double area;  
    
    public void setValue(double radius){}                      //Create setValue Method for make subclass Override
    public void setValue(double width, double height){}        //Overload setValue method to make Override
    public void getValue(){}                                    //Create getValue for make subclass Override
    
    @Override
    public String toString(){                           //Create toString to make subclass Override next
        return "The data is empty";
    }
}





