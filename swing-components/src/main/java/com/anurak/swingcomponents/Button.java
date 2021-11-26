/*
 * This is a OOP assignment : java swing : components self-learning 
 * B.Sc. Computer Science, Burapha University
 */
package com.anurak.swingcomponents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Anurak Yutthanawa
 * 63160015 B.Sc. Computer Science, Burapha University
 *
 */
public class Button {

    Button() {
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton(new ImageIcon("/home/anurak/NetBeansProjects/SwingComponents/src/main/java/com/anurak/swingcomponents/icon.png"));
        b.setBounds(100, 100, 100, 40);
        f.add(b);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Button();
    }
}
