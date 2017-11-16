/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
* Author : Ruan Barros 
* Date : ?/04/2016
 */
package ru.mild.lhi.wnd;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author dmitry
 */
public class WNDEngine extends JDialog {

    /**
     * Creates new form WNDEngine
     */
    private JPanel jPcell;
    private WNDMainWindow caller;

    public WNDEngine(WNDMainWindow calling) {
        this.caller = calling;
        initComponents();
        this.setLocationRelativeTo(null);

        try {
            setIconImage(ImageIO.read(getClass().getResourceAsStream("/ru/mild/lhi/gfx/labyhinth.png")));
        } catch (IOException ex) {
            Logger.getLogger(WNDMainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

        setTitle(WNDMainWindow.MAIN_TITLE + " - Build new map");

        jPcell = new JPanel();
        jPcell.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jPcell.setBackground(Color.WHITE);
        jPanel2.add(jPcell);
        jPcell.setVisible(true);
        pollPcell();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSrow = new javax.swing.JSlider();
        jSbreadth = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTbreadth = new javax.swing.JLabel();
        jTrow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Create");
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(448, 100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 776, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jSrow.setBackground(new java.awt.Color(102, 0, 0));
        jSrow.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jSrow.setForeground(new java.awt.Color(255, 255, 255));
        jSrow.setMajorTickSpacing(1);
        jSrow.setMaximum(50);
        jSrow.setMinimum(4);
        jSrow.setMinorTickSpacing(1);
        jSrow.setPaintLabels(true);
        jSrow.setPaintTicks(true);
        jSrow.setSnapToTicks(true);
        jSrow.setValue(10);
        jSrow.setFocusable(false);
        jSrow.setOpaque(true);
        jSrow.setValueIsAdjusting(true);
        jSrow.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSrowStateChanged(evt);
            }
        });

        jSbreadth.setBackground(new java.awt.Color(102, 0, 0));
        jSbreadth.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jSbreadth.setForeground(new java.awt.Color(255, 255, 255));
        jSbreadth.setMajorTickSpacing(10);
        jSbreadth.setMinimum(10);
        jSbreadth.setMinorTickSpacing(10);
        jSbreadth.setPaintLabels(true);
        jSbreadth.setPaintTicks(true);
        jSbreadth.setSnapToTicks(true);
        jSbreadth.setAutoscrolls(true);
        jSbreadth.setFocusable(false);
        jSbreadth.setOpaque(true);
        jSbreadth.setValueIsAdjusting(true);
        jSbreadth.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSbreadthStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cell Breadth");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cells in a row");

        jTbreadth.setForeground(new java.awt.Color(255, 255, 255));
        jTbreadth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTbreadth.setText("50px cell breadth");

        jTrow.setForeground(new java.awt.Color(255, 255, 255));
        jTrow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTrow.setText("50 x 50 grid");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSrow, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addComponent(jSbreadth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTbreadth, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addComponent(jTrow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSbreadth, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSrow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTbreadth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTrow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSbreadthStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSbreadthStateChanged
        if (!((JSlider) evt.getSource()).getValueIsAdjusting()) {
            pollPcell();
        }
    }//GEN-LAST:event_jSbreadthStateChanged

    private void jSrowStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSrowStateChanged
        if (!((JSlider) evt.getSource()).getValueIsAdjusting()) {
            jTrow.setText(jSrow.getValue() + " x " + jSrow.getValue() + " grid");
        }
    }//GEN-LAST:event_jSrowStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new WNDBuild(caller, jSbreadth.getValue(), jSrow.getValue()).setVisible(true);
        this.dispose();
        System.gc();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pollPcell() {
        jTbreadth.setText(jSbreadth.getValue() + "px cell breadth");
        jPcell.setSize(jSbreadth.getValue(), jSbreadth.getValue());
        jPcell.setLocation(jPanel2.getWidth() / 2 - jPcell.getWidth() / 2, jPanel2.getHeight() / 2 - jPcell.getHeight() / 2);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        try {
                            UIManager.setLookAndFeel(info.getClassName());
                            break;
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(WNDEngine.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InstantiationException ex) {
                            Logger.getLogger(WNDEngine.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IllegalAccessException ex) {
                            Logger.getLogger(WNDEngine.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnsupportedLookAndFeelException ex) {
                            Logger.getLogger(WNDEngine.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                new WNDEngine(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSlider jSbreadth;
    private javax.swing.JSlider jSrow;
    private javax.swing.JLabel jTbreadth;
    private javax.swing.JLabel jTrow;
    // End of variables declaration//GEN-END:variables
}
