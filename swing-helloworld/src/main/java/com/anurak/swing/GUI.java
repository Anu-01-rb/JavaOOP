/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author anurak
 */
public class GUI{
    
    JLabel label;
    JFrame frame;
    JPanel panel;
    
    GUI(){
        frame = new JFrame();
        
        label = new JLabel("Anurak: Hello World");
        
        panel = new JPanel();
        
        panel.add(label);
        panel.setLayout(new GridLayout(1, 0));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        panel.setBackground(Color.yellow);
        
        frame.setTitle("GUI swing");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        
        frame.add(panel, BorderLayout.CENTER);
        
    }
    
    public static void main(String[] args){
        new GUI();
    }
}
