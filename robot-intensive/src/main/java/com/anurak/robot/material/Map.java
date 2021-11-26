/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.robot.material;

/**
 *
 * @author anurak
 */
public class Map extends Game{
    protected char[][] map;
    
    public Map(){
    }
    
    public Map(int x,int y){
        setUpMap(x,y);
    }
    
    public void setUpMap(int area){
        map = new char[area][area];
        System.out.println("Setting up location");
        for(int i = 0; i < area; i++){
            for(int j = 0 ; j < area; j++){
                map[i][j] = '+';
                System.out.printf("Location[%d][%d] set up complete\n",i,j);
            }
        }
        System.out.println("Set up map completed");
    }
    
    public void setUpMap(int xAxis, int yAxis){
        map = new char[xAxis][xAxis];
        System.out.println("Setting up location");
        for(int i = 0; i < xAxis; i++){
            for(int j = 0 ; j < yAxis; j++){
                map[i][j] = '+';
                 System.out.printf("Location[%d][%d] set up complete\n",i,j);
            }
        }
        System.out.println("Set up map completed");
    }
    
    protected void locateObject(Location loc,char icon){
        System.out.println("Locating Object....");
        this.map[loc.x][loc.y] = icon;
        
        System.out.println("Object Located");
    }
    
    protected Location getMapArea(){
        Location mapArea = new Location();
        mapArea.x = map.length;
        mapArea.y = map[0].length;
        return mapArea;
    }
    
    protected void setState(Map argmap){
        for(int i = 0; i < map.length; i++){
            for(int j = 0 ; j < map[i].length; j++){
                argmap.map[i][j] = '+';
                if(i == bombLocate.x && j == bombLocate.y){
                    argmap.map[i][j] = bIcon;
                }
                if(i == robotLocate.x && j == robotLocate.y){
                    argmap.map[i][j] = rIcon;
                }
            }
        }
        if (checkBomb()){
            System.out.println("Bomb Found!!!!");
        }
    }
    
    protected boolean checkBomb(){
        if (robotLocate.equals(bombLocate)){
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        String str = "";
        for (char[] i : map){
            for(char j : i){
                str += j;
            }
            str += "\n";
        }
        return str;
    }
}
