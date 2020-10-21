package com.iamabs.jdm.application;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class JDM extends javax.swing.JFrame {

    int xx = 0;
    int yy = 0;

    public JDM() {
        componentCustomization();
        initComponents();
    }
    
    public void componentCustomization() {
        // set frame icon
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        // set gradient background
            Image img = new ImageIcon(getClass().getResource("/assets/images/background.png")).getImage();
            this.setContentPane(new JPanel() {
             @Override
             public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(img, 0, 0, null);
             }
          });
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeBtn = new javax.swing.JButton();
        pauseBtn = new javax.swing.JButton();
        downloadBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        resumeBtn = new javax.swing.JButton();
        urlTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JDM");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 500));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/004-cancel.png"))); // NOI18N
        closeBtn.setToolTipText("Exit");
        closeBtn.setContentAreaFilled(false);
        closeBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        closeBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        closeBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        pauseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/pause.png"))); // NOI18N
        pauseBtn.setToolTipText("Stop");
        pauseBtn.setBorderPainted(false);
        pauseBtn.setContentAreaFilled(false);
        pauseBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        pauseBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        pauseBtn.setPreferredSize(new java.awt.Dimension(40, 40));

        downloadBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/download.png"))); // NOI18N
        downloadBtn.setToolTipText("Download");
        downloadBtn.setBorderPainted(false);
        downloadBtn.setContentAreaFilled(false);
        downloadBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        downloadBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        downloadBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        downloadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadBtnActionPerformed(evt);
            }
        });

        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/trash.png"))); // NOI18N
        deleteBtn.setToolTipText("Cancel");
        deleteBtn.setBorderPainted(false);
        deleteBtn.setContentAreaFilled(false);
        deleteBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        deleteBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        deleteBtn.setPreferredSize(new java.awt.Dimension(40, 40));

        resumeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/play-button.png"))); // NOI18N
        resumeBtn.setToolTipText("Start");
        resumeBtn.setBorderPainted(false);
        resumeBtn.setContentAreaFilled(false);
        resumeBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        resumeBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        resumeBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        resumeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumeBtnActionPerformed(evt);
            }
        });

        urlTextField.setBackground(new java.awt.Color(75, 135, 214));
        urlTextField.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        urlTextField.setToolTipText("File URL");
        urlTextField.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(urlTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(downloadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resumeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pauseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pauseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(downloadBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resumeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(urlTextField))
                .addContainerGap(452, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_formMouseDragged

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void downloadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downloadBtnActionPerformed

    private void resumeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resumeBtnActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "JVM Does not contains Nimbus Theme");
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JDM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton downloadBtn;
    private javax.swing.JButton pauseBtn;
    private javax.swing.JButton resumeBtn;
    private javax.swing.JTextField urlTextField;
    // End of variables declaration//GEN-END:variables
}
