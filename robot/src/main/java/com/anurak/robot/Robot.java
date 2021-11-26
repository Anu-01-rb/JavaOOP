/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.robot;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author anurak
 */
public class Robot {
    
    private char[][] map;
    private int x,y,xr,yr,xb,yb;                        //INITIAL map(x,y) , robot(xr,yr) , bomb(xb,yb)
    private String last = "w";                                  //Last Direction
    private boolean checkPoint = false;                 //
    private int xrb, yrb, xt ,yt, xbb, ybb;
    
    void createMap(int x, int y){
        this.x = x-1;
        this.y = y-1;
        this.map = new char[x][y]; 
        setState();
    }
    
    void setBomb(int x, int y){
        if (x < 0 || x > this.x || y < 0 || y > this.y){
            return;
        }
        this.xb = x-1;
        this.yb = y-1;
        this.map[x-1][y-1] = 'B';
    }
    
    void setPoint(int x, int y){
        if (x < 0 || x > this.x || y < 0 || y > this.y){
            return;
        }
        this.xr = x-1;
        this.yr = y-1;
        this.map[this.xr][this.yr] = 'R';
        this.checkPoint = true; 
    }
    
    void control(String con) throws InterruptedException{
        if (checkPoint==false){
            this.map[0][0] = 'R';
            checkPoint = true;
        }
        if (con == "q")return;
        if(con == "w" || con == "W"){
            changeToN();
            show();
        }
        
        if(con == "s" || con == "S"){
            changeToS();
            show();
        }
        
        if(con == "d" || con == "D"){
            changeToE();
            show();
        }
        
        if(con == "a" || con == "A"){
            changeToW();
            show();
        }
        if (con == "atr" || con == "ATR"){
            autoRun();
        }
    }
    
    void control(String con, int n){
        if (checkPoint==false){
            this.map[0][0] = 'R';
            checkPoint = true;
        }
        if (con == "q")return;
        if(con == "w" || con == "W"){
            changeToN(n);
            show();
        }
        
        if(con == "s" || con == "S"){
            changeToS(n);
            show();
        }
        
        if(con == "d" || con == "D"){
            changeToE(n);
            show();
        }
        
        if(con == "a" || con == "A"){
            changeToW(n);
            show();
        }
    }
    
    void control(int n){
        if (checkPoint==false){
            this.map[0][0] = 'R';
            checkPoint = true;
        }
        if(this.last == "w" || this.last == "W"){
            changeToN(n);
            show();
        }
        
        if(this.last == "s" || this.last == "S"){
            changeToS(n);
            show();
        }
        
        if(this.last == "d" || this.last == "D"){
            changeToE(n);
            show();
        }
        
        if(this.last == "a" || this.last == "A"){
            changeToW(n);
            show();
        }
    }
    
    void control(){
        if (checkPoint==false){
            this.map[0][0] = 'R';
            checkPoint = true;
        }
        if(this.last == "w" || this.last == "W"){
            changeToN();
            show();
        }
        
        if(this.last == "s" || this.last == "S"){
            changeToS();
            show();
        }
        
        if(this.last == "d" || this.last == "D"){
            changeToE();
            show();
        }
        
        if(this.last == "a" || this.last == "A"){
            changeToW();
            show();
        }
    }
    
    private void changeToW(){
        if(this.yr == 0){
                System.out.println("I can't move");
                return;
        }
        this.map[xr][yr] = '+';
        this.yr = this.yr-1;
        this.map[xr][yr] = 'R';
        checkBomb();
        this.last = "a";
    }
    
    private void changeToE(){
        if(this.yr == y){
                System.out.println("I can't move");
                return;
        }
        this.map[xr][yr] = '+';
        this.yr = this.yr+1;
        this.map[xr][yr] = 'R';
        checkBomb();
        this.last = "d";
    }
    
    private void changeToS(){
        if(this.xr == x){
                System.out.println("I can't move");
                return;
        }
        this.map[xr][yr] = '+';
        this.xr = this.xr+1;
        this.map[xr][yr] = 'R';
        checkBomb();
        this.last = "s";
    }
    
    private void changeToN(){
        if(this.xr == 0){
                System.out.println("I can't move");
                return;
        }
        this.map[xr][yr] = '+';
        this.xr = this.xr-1;
        this.map[xr][yr] = 'R';
        checkBomb();
        this.last = "w";
    }
    private void changeToW(int n){
        if(this.yr == 0 || this.yr-n < 0){
                System.out.println("I can't move");
                return;
        }
        this.map[xr][yr] = '+';
        this.yr = this.yr-n;
        this.map[xr][yr] = 'R';
        checkBomb();
        this.last = "a";
    }
    
    private void changeToE(int n){
        if(this.yr == y || this.yr+n > y){
                System.out.println("I can't move");
                return;
        }
        this.map[xr][yr] = '+';
        this.yr = this.yr+n;
        this.map[xr][yr] = 'R';
        checkBomb();
        this.last = "d";
    }
    
    private void changeToS(int n){
        if(this.xr == x || this.xr+n > x){
                System.out.println("I can't move");
                return;
        }
        this.map[xr][yr] = '+';
        this.xr = this.xr+n;
        this.map[xr][yr] = 'R';
        checkBomb();
        this.last = "s";
    }
    
    private void changeToN(int n){
        if(this.xr == 0 || this.xr-n > x){
                System.out.println("I can't move");
                return;
        }
        this.map[xr][yr] = '+';
        this.xr = this.xr-n;
        this.map[xr][yr] = 'R';
        checkBomb();
        this.last = "w";
    }
    
    void show(){
        for(int i = 0 ; i < this.map.length ; i++){
            for(int j = 0 ; j < this.map[i].length ; j++){
                System.out.print(this.map[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }
    
    private void setState(){
        for(int i = 0 ; i < this.map.length ; i++){
            for(int j = 0 ; j < this.map[i].length ; j++){
                this.map[i][j] = '+';
            }
        }
    }
    
    private void checkBomb(){
        Random ran = new Random();
        checkPosition();
        if(xrb == xbb && yrb == ybb){
            System.out.println("Bomb Found");
            setBomb(ran.nextInt((x-1)+1)+1,ran.nextInt((y-1)+1)+1);
        }
    }
    
    @Override
    public String toString(){
        checkPosition();
        setTarket();
        return String.format("x: %d\ny: %d", ((xt<0)? xt * (-1) : xt), ((yt<0)? yt * (-1) : yt));
    }
    
    private void autoRun() throws InterruptedException{
        checkPosition();
        setTarket();
        while (xt < 0) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("s");
            control("s");
            xt++;
        }
        while (xt > 0) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("w");
            control("w");
            xt--;
        }
        while (yt < 0) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("d");
            control("d");
            yt++;
        }
        while (yt > 0) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("a");
            control("a");
            yt--;
        }
    }

    private void setTarket() {
        this.xt = xrb - xbb;
        this.yt = yrb - ybb;
    }

    private void checkPosition() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 'R') {
                    this.xrb = i;
                    this.yrb = j;
                }
                if (map[i][j] == 'B') {
                    this.xbb = i;
                    this.ybb = j;
                }
            }
        }

    }
}
