/**
 * Midterm Exam : Class and Object Explanation
 * 
 * Object-Oriented Programming
 * 
 */

package com.anurak.classobjmidtermexam;

/**
 *
 * @author Anurak Yutthanawa 63160015 B.Sc.Computer Science
 * Faculty of Informatics, BUU.
 * 
 */

/**
 * STORY:
 *  Once in Japan. Have a robot cat name doraemon and doraemi
 *  Both. are intelligence robot come with amazing gadget
 * 
 */
public class Main {
   
/**
 * main program class
 */
    
    static Main main = new Main();
    
    void welcome(){
        System.out.println("Hello This is OOP Midterm exam 3.1 java code");
    }
    
    public static void main(String[] args) throws InterruptedException {
        
        main.welcome();
        
        String doraemonGadgetChoose;
        String doraemiGadgetChoose;
        
        CatRobot doraemon = new CatRobot("Doraemon");
        CatRobot doraemi = new CatRobot("Doraemi");
        
        doraemon.setColor("Sky");
        doraemi.setColor("Pink");
        
        doraemon.setHeight(146);
        doraemi.setHeight(132);
        
        doraemon.setGender("M");
        doraemi.setGender("F");
        
        doraemon.eat();
        doraemi.eat();
        
        doraemon.speak();
        doraemi.speak();
        
        doraemon.walk();
        doraemi.walk();
        
        doraemon.showGadget();
        doraemi.showGadget();
        
        doraemon.addGadget("Space travel bong");
        doraemi.addGadget("Black-hole Condom");
        
        doraemonGadgetChoose = doraemon.getGadget();
        doraemiGadgetChoose = doraemi.getGadget();
        
        System.out.printf("The choosed gadget from doraemon is %s",doraemonGadgetChoose);
        System.out.printf("The choosed gadget from doraemi is %s",doraemiGadgetChoose);
        
        System.out.println(doraemon);
        System.out.println(doraemi);
        
    }
}