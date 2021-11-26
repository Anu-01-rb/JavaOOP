/*
 * This is a OOP assignment : java swing : components self-learning 
 * B.Sc. Computer Science, Burapha University
 */
package com.anurak.swingcomponents;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author anurak
 */
class MyJComponent extends JComponent {

    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(30, 30, 100, 100);
    }
}

public class Component {

    Component() {
        MyJComponent com = new MyJComponent();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("JComponent Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(com);
        frame.setVisible(true);
    }

    public static void main(String[] arguments) {
        new Component();
    }
}
