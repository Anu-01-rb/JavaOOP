/*
 * This is a OOP assignment : java swing : components self-learning 
 * B.Sc. Computer Science, Burapha University
 */
package com.anurak.swingcomponents;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 *
 * @author anurak
 */
public class Slider extends JFrame {

    Slider() {
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
    }

    public static void main(String s[]) {
        Slider frame = new Slider();
        frame.pack();
        frame.setVisible(true);
    }
}
