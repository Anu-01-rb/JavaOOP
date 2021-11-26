/*
 * This is a OOP assignment : java swing : components self-learning 
 * B.Sc. Computer Science, Burapha University
 */
package com.anurak.swingcomponents;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

/**
 *
 * @author anurak
 */
public class LayeredPane extends JFrame {

    LayeredPane() {
        super("LayeredPane Example");
        setSize(200, 200);
        JLayeredPane pane = getLayeredPane();
        //creating buttons  
        JButton top = new JButton();
        top.setBackground(Color.white);
        top.setBounds(20, 20, 50, 50);
        JButton middle = new JButton();
        middle.setBackground(Color.red);
        middle.setBounds(40, 40, 50, 50);
        JButton bottom = new JButton();
        bottom.setBackground(Color.cyan);
        bottom.setBounds(60, 60, 50, 50);
        //adding buttons on pane  
        pane.add(bottom, new Integer(1));
        pane.add(middle, new Integer(2));
        pane.add(top, new Integer(3));
    }

    public static void main(String[] args) {
        LayeredPane panel = new LayeredPane();
        panel.setVisible(true);
    }
}
