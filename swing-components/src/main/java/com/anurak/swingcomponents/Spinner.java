/*
 * This is a OOP assignment : java swing : components self-learning 
 * B.Sc. Computer Science, Burapha University
 */
package com.anurak.swingcomponents;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author anurak
 */
public class Spinner {

    Spinner() {
        JFrame f = new JFrame("Spinner Example");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(250, 100);
        SpinnerModel value = new SpinnerNumberModel(5, 0, 10, 1); 
        JSpinner spinner = new JSpinner(value);
        spinner.setBounds(100, 100, 50, 30);
        f.add(spinner);
        f.add(label);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                label.setText("Value : " + ((JSpinner) e.getSource()).getValue());
            }
        });
    }

    public static void main(String[] args) {
        new Spinner();
    }
}
