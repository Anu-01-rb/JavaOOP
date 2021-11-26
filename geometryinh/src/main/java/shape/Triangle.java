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
public class Triangle extends Geometry{
    private double base;
    private double height;
    private final double fml = 0.5;
    
    //Creade setValue to get 2 arguments
    //And check all arguments must greater than 0
    //Then set into class variable
    
    public Triangle(double base, double height){
        if (base <= 0){
            System.out.println("Width must greater than 0");
            return;
        }
        if (height <= 0){
            System.out.println("Height must greater than 0");
            return;
        }
        this.base = base;
        this.height = height;
        calArea();
    }
    
    @Override
    public void setValue(double base, double height){
        if (base <= 0){
            System.out.println("Width must greater than 0");
            return;
        }
        if (height <= 0){
            System.out.println("Height must greater than 0");
            return;
        }
        this.base = base;
        this.height = height;
        calArea();
    }
    
    protected void calArea(){
        this.area = fml * height * base;
    }
    
    //Create getValue to make variable can check the value of all needed class variable
    @Override
    public void getValue(){
        System.out.println("Width: "+base);
        System.out.println("Height: "+height);
    }

    //Override toString to use with print medthod
    @Override
    public String toString(){
        return (this.area != 0)? String.format("This triangle area is: %.2f", area) :
                String.format("Please Enter the value");
    }
}