/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.robot.material;

import java.util.Scanner;

/**
 *
 * @author anurak
 */
abstract class Game {
    protected static Scanner kb = new Scanner(System.in);
//    protected static Map gamemap;
    protected static Location robotLocate;
    protected static Location bombLocate;
    protected static char rIcon = 'R';
    protected static char bIcon = 'B';

    
    
    @Override
    public String toString(){
        return "Welcome to games";
    }
    
    
}
