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
public class Bitone extends Tea{
    
/**
 * Bitone class sub class > Tea
 */    
    
    protected String[] order = new String[2];
    
    public Bitone(char size, boolean boba) throws InterruptedException{
        super(size,boba);
    }
    
//    Bitone(char size, boolean boba) throws InterruptedException{
//        super(size,boba);
//    }
    
    public void selectMenu(){
        for(int i = 0; i < order.length ; i++){
            order[i] = select();
        }
    }
    
    public void selectMenu(int menu1, int menu2){
        order[0] = menu.get(menu1-1);
        order[1] = menu.get(menu2-1);
    }
    
    @Override
    protected void initializeMenu(){
        super.initializeMenu();
        menu.add("Red Flavoured Syrup Milk Tea");
        menu.add("Green Flavoured Syrup Milk Tea");
    }
    
    @Override
    protected int calculate(){
        return super.calculate() + 10; 
    }
    
    protected void error(){
        if (order[0] == null) throw new NullPointerException("[Bitone : ERROR | DATA ] String[0]<order> not found");
        if (order[1] == null) throw new NullPointerException("[Bitone : ERROR | DATA ] String[1]<order> not found");
    }
    
    public String toString(){
        error();
        return String.format("This your Bitone tea order:\n\t1. %S\n\t2. %S\nBoba: %b\nBill: %d",order[0], order[1],this.boba, calculate());
    }
}
