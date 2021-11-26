/**
 * Midterm Exam : Class and Object Explanation
 * 
 * Object-Oriented Programming
 * 
 */

package com.anurak.overloadingoverridingexplanation.boba;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Anurak Yutthanawa 63160015 B.Sc.Computer Science
 * Faculty of Informatics, BUU.
 * 
 */

abstract class Tea {
    
 /**
 * Tea class
 */
    
    protected Scanner sc = new Scanner(System.in);
    
    protected char size;
    protected boolean boba;
    protected LinkedList<String> menu = new LinkedList<String>();
    
    Tea(char size, boolean boba) throws InterruptedException {
        switch (size){
            case 'S': break;
            case 'M': break;
            case 'L': break;
            default: throw new InterruptedException("[Tea : ERROR | INPUT ] char<size> must input only ['S'/'M'/'L']");
        }
        this.size = size;
        this.boba = boba;
        initializeMenu();
    }
    
    protected int calculate(){
        int priceOfSize = 0;
        switch (size){
            case 'S':
                priceOfSize += 30;
                break;
            case 'M':
                priceOfSize += 40;
                break;
            case 'L':
                priceOfSize += 50;
        }
        
        return ((boba)? priceOfSize+10 : priceOfSize); 
    }
    
    protected String select(){
        String selectedMenu = "";
        boolean loopCheck = true;
        
        System.out.println("Select these menu");
        listMenu();
        while(loopCheck){
            try{
                selectedMenu = menu.get(sc.nextInt()-1);
                loopCheck = false;
            }
            catch(Exception e){
                System.out.println("Please select with only number in menu");
            }
        }
        return selectedMenu;
    }
    
    protected void initializeMenu(){
        menu.add("Thai Milk Tea");
        menu.add("Matcha Green Tea");
        menu.add("Hojicha Green Tea");
        menu.add("Taro Milk Tea");
        menu.add("Cantaloupe Milk Tea");
        menu.add("Melon Milk Tea");
        menu.add("Coffee Milk");
        menu.add("Chocolate Milk Tea");
    }
    
    public void listMenu(){
        System.out.println("This is all menu for you.");
        for(int i = 0; i < menu.size(); i++){
            System.out.printf("\t%d. %S\n",i+1,menu.get(i));
        }
        System.out.println("---------------------");
    }
 
}
