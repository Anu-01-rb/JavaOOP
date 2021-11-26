/*
 * This is a OOP assignment : java swing : components self-learning 
 * B.Sc. Computer Science, Burapha University
 */
package com.anurak.swingcomponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Anurak Yutthanawa 63160015 B.Sc. Computer Science, Burapha University
 *
 */
public class Label extends Frame implements ActionListener {

    JTextField tf;
    JLabel l;
    JButton b;

    Label() {
        tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        l = new JLabel();
        l.setBounds(50, 100, 250, 20);
        b = new JButton("Find IP");
        b.setBounds(50, 150, 95, 30);
        b.addActionListener(this);
        add(b);
        add(tf);
        add(l);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Label();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        try {
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of " + host + " is: " + ip);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
