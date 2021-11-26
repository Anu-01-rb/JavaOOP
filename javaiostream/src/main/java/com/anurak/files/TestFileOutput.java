/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anurak.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anu-fedora
 */
public class TestFileOutput {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            
            Dog dog = new Dog("Palm", 5);
            Rectangle rec = new Rectangle(4,5);
            File file = new File("dog.obj");
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(dog);
            oos.writeObject(rec);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestFileOutput.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestFileOutput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
