/**
 * Midterm Exam : Class and Object Explanation
 * 
 * Object-Oriented Programming
 * 
 */
package com.anurak.overloadingoverridingexplanation.boba;

/**
 *
 * @author Anurak Yutthanawa 63160015 B.Sc.Computer Science
 * Faculty of Informatics, BUU.
 * 
 */
public class Utone extends Tea{
    
 /**
 * Utone class sub class > Tea
 */ 
    protected String order;
    
    public Utone(char size, boolean boba) throws InterruptedException{
        super(size, boba);
    }
    
    public void selectMenu(){
        order = select();
    }
    
    public void selectMenu(int index){
        order = menu.get(index-1);
    }
    
    @Override
    protected void initializeMenu(){
        super.initializeMenu();
        menu.add("Espresso Coffee");
        menu.add("White Chocolate Machiato");
        menu.add("Americano Coffee");
    }
    
    protected void error(){
        if (order == null) throw new NullPointerException("[Utone : ERROR | DATA ] String<order> not found");
    }
    
    public String toString(){
        error();
        return String.format("This your Utone tea order:\n\t1. %S\nBoba: %B\nBill: %d",order,this.boba, calculate());
    }
}
