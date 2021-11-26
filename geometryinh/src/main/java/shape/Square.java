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
public class Square extends Rectangle{
    
    //Creade setValue to get an arguments
    //And check an arguments must greater than 0
    //Then set into class variable
    
    public Square(double len){
        super(len,len);
    }
    
    @Override
    public void setValue(double len){
        if (len <= 0){
            System.out.println("Length must greater than 0");
            return;
        }
        this.width = len;
        this.height = len;
        calArea();
    }

    //Create getValue to make variable can check the value of all needed class variable
    @Override
    public void getValue(){
        System.out.println("Length: "+ this.height);
    }
    
    //Override toString to use with print medthod
    @Override
    public String toString(){
        return (this.area != 0)? String.format("This square area is: %.2f", area) :
                String.format("Please Enter the value");
    }
}
