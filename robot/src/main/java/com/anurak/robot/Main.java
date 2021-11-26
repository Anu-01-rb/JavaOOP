/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.robot;

import java.util.Scanner;

/**
 *
 * @author anurak
 */
public class Main {
    static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        String con;
        
        System.out.println("Robot Game");
        Robot gundam = new Robot();
        gundam.createMap(10, 10);
        gundam.setBomb(1, 7);
//        gundam.setPoint(9, 3);
        gundam.show();
        
        do{
            con = kb.next().intern();
            
            gundam.control(con);                //atr command standfor autoRun()
        }while (con != "q");
        
        gundam.control("w",3);
        gundam.control("d",1);
        gundam.control();
        gundam.control(3);
        gundam.control("s");
        
        System.out.println(gundam);
    }
}
