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
public class Circle extends Geometry{
    //Declare all need variable
    private double radius;
    private final double pi = 22.0/7;
    
    //Creade setValue to get 1 arguments
    //And check an argument must greater than 0
    //Then set into class variable
    public Circle(double radius){
        if (radius <= 0){
            System.out.println("Radius must greater than 0");
            return;
        }
        this.radius = radius;
        area = (this.pi * Math.pow((this.radius),2));
    }
    
    @Override
    public void setValue(double radius){
        if (radius <= 0){
            System.out.println("Radius must greater than 0");
            return;
        }
        this.radius = radius;
        area = (this.pi * Math.pow((this.radius),2));
    }
    
    //Create getValue to make variable can check the value of all needed class variable
    @Override
    public void getValue(){
        System.out.println("Radius: "+radius);
    }
    
    //Override toString to use with print medthod
    @Override
    public String toString(){
        return (this.area != 0)? String.format("This circle area is: %.2f", area) :
                String.format("Please Enter the value");
    }
}
