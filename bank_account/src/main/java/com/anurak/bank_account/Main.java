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
public class Main {
    public static void main(String[] args) {
        Account book1 = new Account("Prayut", 84000);
        Account book2 = new Account();
        Account book3 = new Account("Anurak");
        
        book1.withdraw(50000);
        System.out.println(book1);
        
        
        book2.setName("Patchara");
        book2.deposit(100);
        System.out.println(book2);   
        
        
        book3.deposit(300);
        book3.withdraw(400);
        System.out.println(book3);
    }
}
