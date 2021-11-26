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
public class Robot extends Creator{

    private int fuel = 10;
    private TableMap map;

    public Robot(int x, int y, char symbol, TableMap map) {
        super(x, y, symbol);
        this.map = map; 
    }

    public boolean walk(char direction) {
        System.out.println(this);
        if (fuel <= 0) return false;
        switch (direction) {
            case 'N': 
            case 'w':
                if (walkN()) return false;
                break;
            case 'S':
            case 's':
                if (walkS()) return false;
                break;
            case 'E':
            case 'd':
                if (walkE()) return false;

                break;
            case 'W':
            case 'a':
                if (walkW()) return false;
                break;
            default:
                return false;
        }
        fuel--;
        checkBomb();
        checkFuel();
        return true;
    }

    private void checkBomb() {
        if(map.isBomb(x, y)) {
            System.out.println("Founded Bomb!!!! (" + x + ", " + y + ")");
        }
    }

    private boolean walkW() {
        if (map.inMap(x - 1, y) && map.isTree(x - 1, y)) {
            x = x - 1;
        } else {
            return true;
        }
        return false;
    }

    private boolean walkE() {
        if (map.inMap(x + 1, y) && map.isTree(x + 1, y)) {
            x = x + 1;
        } else {
            return true;
        }
        return false;
    }

    private boolean walkS() {
        if (map.inMap(x, y + 1) && map.isTree(x, y+1)) {
            y = y + 1;
        } else {
            return true;
        }
        return false;
    }

    private boolean walkN() {
        if (map.inMap(x, y - 1) && map.isTree(x, y - 1)) {
            y = y - 1;
        } else {
            return true;
        }
        return false;
    }
    
    private void checkFuel(){
        if(map.isFuel(x, y)) {
            fuel += 5;
        }
    }
    
    @Override
    public String toString() {
        return "Robot " + "Position{" + super.toString() + '}' + "\nFuel: " + fuel;
    }
    
    
}
