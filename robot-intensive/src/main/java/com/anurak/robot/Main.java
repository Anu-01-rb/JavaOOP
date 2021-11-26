/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.robot;

import java.util.Scanner;
import com.anurak.robot.material.*;

/**
 *
 * @author anurak
 */
public class Main {
    
    static Scanner kb = new Scanner(System.in);
    
    public static void main(String[] args) {
        char a;
        
        Map map = new Map();
        Robot oo = new Robot();
        Bomb bomb = new Bomb();
        
        oo.setIcon('G');
        bomb.setIcon('X');
        map.setUpMap(7,7);
        
        oo.setPosition(map, (new Location()).setLocation(0, 1));
        bomb.setPosition(map, (new Location()).setLocation(5, 3));
        System.out.println(map);
        
        do{
            a = kb.next().charAt(0);
            oo.walk(map, a);
            System.out.println(map);
        }while(a != 'q');
        
    }
}
