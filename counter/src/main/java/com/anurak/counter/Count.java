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
final public class Count{
    private int cou;
    void func(char op,int a){
        if (op == '+'){
            cou += a;
        }
        else if (op == '-'){
            cou -= a;
        }
    }
    void func(char op){
        if (op == '+'){
            cou += 1;
        }
        else if (op == '-'){
            cou -= 1;
        }
    }
    void dis(){
        System.out.println(cou);
    }
    void increase(){
        cou++;
    }
    void increase(int a){
        cou += a;
    }
    void decrease(){
        cou--;
    }
    void decrease(int a){
        cou -= a;
    }
}
