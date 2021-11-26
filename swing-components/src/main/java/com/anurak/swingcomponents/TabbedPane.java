/*
 * This is a OOP assignment : java swing : components self-learning 
 * B.Sc. Computer Science, Burapha University
 */
package com.anurak.swingcomponents;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

/**
 *
 * @author anurak
 */
public class TabbedPane {

    JFrame f;

    TabbedPane() {
        f = new JFrame();
        JTextArea ta = new JTextArea(200, 200);
        JPanel p1 = new JPanel();
        p1.add(ta);
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 200, 200);
        tp.add("main", p1);
        tp.add("visit", p2);
        tp.add("help", p3);
        f.add(tp);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPane();
    }
}
