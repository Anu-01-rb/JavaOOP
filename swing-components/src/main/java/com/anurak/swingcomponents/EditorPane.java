/*
 * This is a OOP assignment : java swing : components self-learning 
 * B.Sc. Computer Science, Burapha University
 */
package com.anurak.swingcomponents;

import javax.swing.JEditorPane;  
import javax.swing.JFrame;  

/**
 *
 * @author anurak
 */
public class EditorPane {

    JFrame myFrame = null;

    public static void main(String[] a) {
        (new EditorPane()).test();
    }

    private void test() {
        myFrame = new JFrame("JEditorPane Test");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(400, 200);
        JEditorPane myPane = new JEditorPane();
        myPane.setContentType("text/plain");
        myPane.setText("Sleeping is necessary for a healthy body."
                + " But sleeping in unnecessary times may spoil our health, wealth and studies."
                + " Doctors advise that the sleeping at improper timings may lead for obesity during the students days.");
        myFrame.setContentPane(myPane);
        myFrame.setVisible(true);
    }
}
