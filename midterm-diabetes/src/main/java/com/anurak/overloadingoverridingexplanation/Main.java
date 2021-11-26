/**
 * Midterm Exam : Class and Object Explanation
 * 
 * Object-Oriented Programming
 * 
 */

package com.anurak.overloadingoverridingexplanation;
import com.anurak.overloadingoverridingexplanation.boba.*;

/**
 *
 * @author Anurak Yutthanawa 63160015 B.Sc.Computer Science
 * Faculty of Informatics, BUU.
 * 
 */

public class Main {
      
/**
 * main program class
 */
    
    static Main main = new Main();
    
    void welcome(){
        System.out.println("Hello This is OOP Midterm exam 3.2 java code");
    }
    
    public static void main(String[] args) throws InterruptedException {
        
        main.welcome();
    
        Bitone cup1 = new Bitone('S',false);
        Bitone cup2 = new Bitone('L',true);
        
        Utone cup3 = new Utone('M',true);
        Utone cup4 = new Utone('S',true);
        
        //CUP 1 Test
        System.out.println("-------[Test cup1]-------");
        cup1.selectMenu();
        System.out.println(cup1);
        
        //CUP 2 Test
        System.out.println("-------[Test cup2]-------");
        cup2.listMenu();
        cup2.selectMenu(2, 4);
        System.out.println(cup2);
        
        //CUP 3 Test
        System.out.println("-------[Test cup3]-------");
        cup3.selectMenu();
        System.out.println(cup3);
        
        //CUP 4 Test
        System.out.println("-------[Test cup4]-------");
        cup4.listMenu();
        cup4.selectMenu(3);
        System.out.println(cup4);
        
        System.out.println("Thanks for Test CLASS");
        
    }
}
