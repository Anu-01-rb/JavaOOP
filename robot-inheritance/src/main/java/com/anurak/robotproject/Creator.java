/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.robotproject;

/**
 *
 * @author anurak
 */
public class Creator {
    
    protected int x;
    protected int y;
    protected char symbol;
    
    public Creator(int x, int y, char symbol){
        this.x = x;
        this.y = y;
        this.symbol = symbol;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getSymbol() {
        return symbol;
    }
    
    public boolean isOn(int x, int y) {
        return this.x == x && this.y == y;
    }

    @Override
    public String toString() {
        return "x = " + x + "y = " + y;
    }
    
}
