/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.bank_account;

/**
 *
 * @author anurak
 */
public class Account {
    
    private String suName;
    private int money;
    
    Account(){
    }
    
    Account(String name){
        this.suName = name;
    }
    
    Account(String name, int initial){
        this.suName = name;
        this.money += initial;
    }
    
    void setName(String name){
        this.suName = name;
    }
    
    void deposit(int money){
        if (money <= 0){
            System.out.println("Access denied: Your deposit money less than or equal 0");
            return;
        }
        this.money += money;
    }
    
    void withdraw(int money){
        if (this.money - money < 0){
            System.out.println("Access denied: Your money less than withdraw value");
            return;
        }
        if (money <= 0){
            System.out.println("Access denied: Your withdraw money less than or equal 0");
            return;
        }
        this.money -= money;
    }
    
    @Override 
    public String toString() {
        if (this.suName == null){
            return "Access denied: This account name is empty";
        }
        return String.format("Name: %s\nMoney: %s", this.suName, this.money);
    }
}
