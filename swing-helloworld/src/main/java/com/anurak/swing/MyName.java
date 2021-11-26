/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author anurak
 */
public class MyName implements ActionListener {
    
    String name;
    
    JLabel label;
    JFrame frame;
    JPanel panel;
    JTextField textField;
    JButton button;
    JLabel helloLB;
    Container cont;
    
    MyName(){
        frame = new JFrame();
        label = new JLabel("Input Name: ");
        textField = new JTextField();
        panel = new JPanel();
        button = new JButton("Enter");
        button.addActionListener(this);
        helloLB = new JLabel("Hello, user");
//        cont = frame.getContentPane();
        
        
        
        label.setSize(30,20);
        label.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        
        textField.setSize(30, 20);
        textField.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        
        button.setSize(10,20);
        button.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        
        helloLB.setSize(30,20);
        helloLB.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        helloLB.setLayout(new GridLayout(1,0));
        
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(1, 0));
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        
//        frame.add(label);
//        frame.add(textField);
//        frame.add(button);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(helloLB, BorderLayout.CENTER);
        frame.setLayout(new GridLayout(0, 1));
//        frame.pack();
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Hello Me");
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new MyName();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        name = textField.getText().toString();
        helloLB.setText("Hello, " + name);
    }
}
