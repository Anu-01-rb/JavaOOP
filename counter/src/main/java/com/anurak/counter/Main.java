/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.counter;

/**
 *
 * @author anurak
 */
public class Main {
    public static void main(String[] args) {
        Count Counter = new Count();
        Counter.func('+');
        Counter.func('+',9);
        Counter.func('-');
        Counter.increase(6);
        Counter.decrease(3);
        Counter.dis();
    }
}
