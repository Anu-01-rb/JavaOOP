/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.robotproject;

import java.util.Scanner;

/**
 *
 * @author anurak
 */
public class MainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TableMap map = new TableMap(10, 10);
        Robot robot = new Robot(2, 2, 'x', map);
        Bomb bomb = new Bomb(5,5);
        map.setObject(robot);
        map.setObject(bomb);
        map.setObject(new Tree(4,2));
        map.setObject(new Tree(5,8));
        map.setObject(new Tree(6,9));
        map.setObject(new Tree(5,1));
        map.setObject(new Tree(9,4));
        map.setObject(new Tree(3,4));
        map.setObject(new Fuel(0,3));
        map.setObject(new Fuel(3,6));
        map.setObject(new Fuel(5,8));
        map.setObject(new Fuel(9,5));
        map.setObject(new Fuel(7,3));
        while(true) {
            map.showMap();
            // W,a| N,w| E,d| S, s| q: quit
            char direction = inputDirection(sc);
            if(direction=='q') {
                printByeBye();
                break;
            }
            robot.walk(direction);
        }
        
    }

    private static void printByeBye() {
        System.out.println("Bye Bye!!!");
    }

    private static char inputDirection(Scanner sc) {
        String str = sc.next();
        return str.charAt(0);
    }
}
