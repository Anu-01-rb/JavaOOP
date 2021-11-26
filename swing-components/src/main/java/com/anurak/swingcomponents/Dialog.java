/*
 * This is a OOP assignment : java swing : components self-learning 
 * B.Sc. Computer Science, Burapha University
 */
package com.anurak.swingcomponents;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author anurak
 */
public class Dialog {

    private static JDialog d;

    Dialog() {
        JFrame f = new JFrame();
        d = new JDialog(f, "Dialog Example", true);
        d.setLayout(new FlowLayout());
        JButton b = new JButton("OK");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Dialog.d.setVisible(false);
            }
        });
        d.add(new JLabel("Click button to continue."));
        d.add(b);
        d.setSize(300, 300);
        d.setVisible(true);
    }

    public static void main(String args[]) {
        new Dialog();
    }
}
