/*
 * This is a OOP assignment : java swing : components self-learning 
 * B.Sc. Computer Science, Burapha University
 */
package com.anurak.swingcomponents;

import java.awt.FlowLayout;  
import java.awt.event.ItemEvent;  
import java.awt.event.ItemListener;  
import javax.swing.JFrame;  
import javax.swing.JToggleButton;  

/**
 *
 * @author anurak
 */
public class ToggleButton extends JFrame implements ItemListener {

    public static void main(String[] args) {
        new ToggleButton();
    }
    private JToggleButton button;

    ToggleButton() {
        setTitle("JToggleButton with ItemListener Example");
        setLayout(new FlowLayout());
        setJToggleButton();
        setAction();
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setJToggleButton() {
        button = new JToggleButton("ON");
        add(button);
    }

    private void setAction() {
        button.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent eve) {
        if (button.isSelected()) {
            button.setText("OFF");
        } else {
            button.setText("ON");
        }
    }
}
