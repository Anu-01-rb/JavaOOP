/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anurak.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.ObjectInputStream;

/**
 *
 * @author anu-fedora
 */
public class TestFileInput {
    public static void main(String[] args) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            Dog dog = null;
            Rectangle rec = null;
            File file = new File("dog.obj");
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            
            dog = (Dog)ois.readObject();
            rec = (Rectangle)ois.readObject();
            System.out.println(dog);
            System.out.println(rec);
            
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File now found!!");
        } catch (IOException ex) {
            Logger.getLogger(TestFileInput.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestFileInput.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (NullPointerException ex) {
                System.out.println("fis obj null");
            }
            catch (IOException ex) {
                Logger.getLogger(TestFileInput.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
