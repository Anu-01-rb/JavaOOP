/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.robotproject;

import java.util.LinkedList;

/**
 *
 * @author anurak
 */
public class TableMap {

    private int width;
    private int height;
    private LinkedList<Creator> obj = new LinkedList<Creator>(); 

    public TableMap(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public void setObject(Creator obj){
        this.obj.add(obj);
    }
    
    public boolean showObject(int x, int y){
        for (Creator i : obj){
            if (i.isOn(x, y)){
                System.out.print(i.getSymbol());
                return true;
            }
        }
        return false;
    }
    
    public void showMap() {
        showTitle();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if(showObject(x, y)) {
                }else {
                    showCell();
                }
            }
            showNewLine();
        }

    }

    private void showTitle() {
        System.out.println("Map");
    }

    private void showNewLine() {
        System.out.println("");
    }

    private void showCell() {
        System.out.print("-");
    }

    public boolean inMap(int x, int y) {
        // x -> 0-(width-1), y -> 0-(height-1)
        return (x >= 0 && x < width) && (y >= 0 && y < height);
    }

    public boolean isBomb(int x, int y) {
        for (Creator i : obj){
            if (i.isOn(x, y) && i instanceof Bomb){
                return true;
            }
        }
        return false;
    }
    
    public boolean isTree(int x, int y){
        for (Creator i : obj){
            if (i.isOn(x, y) && i.getSymbol() == 'T'){
                return false;
            }
        }
        return true;
    }
    
    public boolean isFuel(int x, int y){
        for (int i = 0; i < obj.size() ; i++){
            if (obj.get(i).isOn(x, y) && obj.get(i).getSymbol() == 'F'){
                obj.get(i).symbol = '-';
                return true;
            }
        }
        for (Creator i : obj){
            if (i.isOn(x, y) && i.getSymbol() == 'F'){
                return true;
            }
        }
        return false;
    }
    
}
