/*
 * This is a OOP assignment : java swing : components self-learning 
 * B.Sc. Computer Science, Burapha University
 */
package com.anurak.swingcomponents;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author anurak
 */
public class Separator {

    JMenu menu, submenu;
    JMenuItem i1, i2, i3, i4, i5;

    Separator(){
        JFrame f = new JFrame("Separator Example");
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        menu.add(i1);
        menu.addSeparator();
        menu.add(i2);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new Separator();
    }
}
