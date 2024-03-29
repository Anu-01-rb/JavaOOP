/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author anu-fedora
 */
public class RSPGameFrame extends javax.swing.JFrame {

    /**
     * Creates new form RSPGameFrame
     */
    public RSPGameFrame() {
        initComponents();
        ImageIcon imgr = new ImageIcon("img/ROCK.png");
        btnRock.setIcon(imgr);
        ImageIcon imgs = new ImageIcon("img/SCISSORS.png");
        btnScissors.setIcon(imgs);
        ImageIcon imgp = new ImageIcon("img/PAPER.png");
        btnPaper.setIcon(imgp);
        computer = new Computer();
        load();
        showStat();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStat = new javax.swing.JLabel();
        lblCom = new javax.swing.JLabel();
        lblPlayer = new javax.swing.JLabel();
        lblPlayer2 = new javax.swing.JLabel();
        lblCom2 = new javax.swing.JLabel();
        btnRock = new javax.swing.JButton();
        btnScissors = new javax.swing.JButton();
        btnPaper = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblStat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStat.setText("Win: 0 Draw: 0 Lose: 0");

        lblCom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCom.setText("Computer");

        lblPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayer.setText("Player");

        lblPlayer2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblCom2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblCom2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnRock.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnRock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRockActionPerformed(evt);
            }
        });

        btnScissors.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnScissors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScissorsActionPerformed(evt);
            }
        });

        btnPaper.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaperActionPerformed(evt);
            }
        });

        lblResult.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResult.setText("?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(lblStat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblCom, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(32, 32, 32)
                                                                .addComponent(lblCom2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblPlayer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(lblPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(31, 31, 31)))))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnScissors, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRock, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblStat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblCom)
                                        .addComponent(lblPlayer))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCom2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblResult)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnPaper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnScissors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRock, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaperActionPerformed
        int status = computer.paoYingChoob(2);
        process();
    }//GEN-LAST:event_btnPaperActionPerformed

    private void btnRockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRockActionPerformed
        int status = computer.paoYingChoob(0);
        process();
    }//GEN-LAST:event_btnRockActionPerformed

    private void btnScissorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScissorsActionPerformed
        int status = computer.paoYingChoob(1);
        process();
    }//GEN-LAST:event_btnScissorsActionPerformed

    private void process() {
        showPlayer();
        showComputer();
        showResult();
        showStat();
        save();
    }

    private String[] strRSP = {"ROCK", "SCISSORS", "PAPER"};

    private void showPlayer() {
//        lblPlayer2.setText(strRSP[computer.getPlayerHand()]);
        ImageIcon img = new ImageIcon("img/" + strRSP[computer.getPlayerHand()] + ".png");
        lblPlayer2.setIcon(img);
    }

    private void showComputer() {
//        lblCom2.setText(strRSP[computer.getHand()]);
        ImageIcon img = new ImageIcon("img/" + strRSP[computer.getHand()] + ".png");
        lblCom2.setIcon(img);
    }

    private void showResult() {
        if (computer.getStatus() == 0) {
            lblResult.setText("Draw!!!");
        } else if (computer.getStatus() == 1) {
            lblResult.setText("You Win!!!");
        } else {
            lblResult.setText("You Lose!!!");
        }
    }

    protected void showStat() {
        lblStat.setText("Win: " + computer.getWin() + " Draw: " + computer.getDraw() + " Lose: " + computer.getLose());
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(RSPGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RSPGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RSPGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RSPGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new RSPGameFrame().setVisible(true);
//            }
//        });
//    }

    private void save() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            File file = new File("computer.obj");
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(computer);
            oos.close();
            fos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RSPGameFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RSPGameFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(RSPGameFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void load() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            File file = new File("computer.obj");
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            computer = (Computer)ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            Logger.getLogger(RSPGameFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RSPGameFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (NullPointerException ex) {
                System.out.println("Null Pointer Exception");
            }
            catch (IOException ex) {
                Logger.getLogger(RSPGameFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    protected Computer computer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPaper;
    private javax.swing.JButton btnRock;
    private javax.swing.JButton btnScissors;
    private javax.swing.JLabel lblCom;
    private javax.swing.JLabel lblCom2;
    private javax.swing.JLabel lblPlayer;
    private javax.swing.JLabel lblPlayer2;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblStat;
    // End of variables declaration//GEN-END:variables
}
