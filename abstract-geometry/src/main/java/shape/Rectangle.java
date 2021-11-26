/*
 * OOP : Object-Oriented Programming
 * Abstract
 */
package shape;

/**
 *
 * @author Anurak Yutthanawa
 * 63160015 B.Sc. Computer Science
 * Burapha University
 *
 */
public class Rectangle extends Geometry{
    //Declare all need variable
    protected double width;  
    protected double height;
    
    //Creade setValue to get 2 arguments
    //And check all arguments must greater than 0
    //Then set into class variable
    
    public Rectangle(double width, double height){                  
        if (width <= 0){
            System.out.println("Width must greater than 0");
            return;
        }
        if (height <= 0){
            System.out.println("Height must greater than 0");
            return;
        }
        this.width = width;
        this.height = height;
        calArea();
    }
    
    @Override
    public void setValue(double width, double height){                  
        if (width <= 0){
            System.out.println("Width must greater than 0");
            return;
        }
        if (height <= 0){
            System.out.println("Height must greater than 0");
            return;
        }
        this.width = width;
        this.height = height;
        calArea();
    }
   
    @Override 
    protected void calArea(){
        this.area = this.width * this.height;
    }
    
    //Create getValue to make variable can check the value of all needed class variable
    @Override
    public void getValue(){
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
    }

    //Override toString to use with print medthod
    @Override
    public String toString(){
        return (this.area != 0)? String.format("This Rectangle area is: %.2f", area) :
                String.format("Please Enter the value");
    }
}
