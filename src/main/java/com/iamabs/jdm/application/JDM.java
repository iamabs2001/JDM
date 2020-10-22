package com.iamabs.jdm.application;

import java.awt.Graphics;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class JDM extends javax.swing.JFrame implements Observer {

    DownloaderService downloaderService = null;
    DownloadTableModel downloadTableModel = new DownloadTableModel();
    DownloaderService selectedDownload = null;
    ProgresService progresService = new ProgresService(0, 100);
    Boolean clear = false;
    int xx = 0;
    int yy = 0;

    public JDM() {
        componentCustomization();
        initComponents();
        initConfigs();
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
    
    public void initConfigs() {
            DownloadTable.setModel(downloadTableModel);
            DownloadTable.getSelectionModel().addListSelectionListener(new
            ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                tableSelectionChanged();
            }
        });
        progresService.setStringPainted(true);
        DownloadTable.setDefaultRenderer(JProgressBar.class, progresService);
    }
    
      private void tableSelectionChanged() {
        if (selectedDownload != null) {
            selectedDownload.deleteObserver(JDM.this);
        }
        if (!clear) {
            selectedDownload = downloadTableModel.getDownload(DownloadTable.getSelectedRow());
            selectedDownload.addObserver(JDM.this);
            RefreshButton();
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        DownloadTable = new javax.swing.JTable();
        refreshBtn = new javax.swing.JButton();

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
        pauseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseBtnActionPerformed(evt);
            }
        });

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
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

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

        DownloadTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "File", "Progress", "Size MB", "Speed KBPS", "Status", "Elapsed Time", "Time Left"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DownloadTable.setCellSelectionEnabled(true);
        DownloadTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(DownloadTable);

        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/034-reload-2.png"))); // NOI18N
        refreshBtn.setToolTipText("Refresh");
        refreshBtn.setBorderPainted(false);
        refreshBtn.setContentAreaFilled(false);
        refreshBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        refreshBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        refreshBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(urlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(downloadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resumeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pauseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(urlTextField)
                    .addComponent(refreshBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
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
        try {
            URL url = new URL(urlTextField.getText().toString());
            downloadTableModel.addDownload(new DownloaderService(url));
            urlTextField.setText("");
        } catch (MalformedURLException badUrl) {
            JOptionPane.showMessageDialog(null, "Not a Valid URL");
        } catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "Something went wrong!");
        }
    }//GEN-LAST:event_downloadBtnActionPerformed

    private void RefreshButton() {
                if (selectedDownload != null) {
            int status = selectedDownload.getStatus();
            switch (status) {
                case DownloaderService.DOWNLOADING:
                    pauseBtn.setEnabled(true);
                    resumeBtn.setEnabled(false);
                    deleteBtn.setEnabled(true);
                    break;
                case DownloaderService.PAUSED:
                    pauseBtn.setEnabled(false);
                    resumeBtn.setEnabled(true);
                    deleteBtn.setEnabled(true);
                    break;
                case DownloaderService.ERROR:
                    pauseBtn.setEnabled(false);
                    resumeBtn.setEnabled(true);
                    deleteBtn.setEnabled(false);
                    break;
                default: // COMPLETE or CANCELLED
                    pauseBtn.setEnabled(false);
                    resumeBtn.setEnabled(false);
                    deleteBtn.setEnabled(false);
            }
        } else {
            pauseBtn.setEnabled(false);
            resumeBtn.setEnabled(false);
            deleteBtn.setEnabled(false);
        }
    }
    
    public void update(Observable o, Object arg) {        
        if (selectedDownload != null && selectedDownload.equals(o))
            RefreshButton();
    }
    
    private void resumeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumeBtnActionPerformed
       selectedDownload.resume();
       RefreshButton();
    }//GEN-LAST:event_resumeBtnActionPerformed

    private void pauseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseBtnActionPerformed
        selectedDownload.pause();
        RefreshButton();
    }//GEN-LAST:event_pauseBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        selectedDownload.cancel();
        RefreshButton();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        clear = true;
        downloadTableModel.clearDownload(DownloadTable.getSelectedRow());
        clear = false;
        selectedDownload = null;
        RefreshButton();
    }//GEN-LAST:event_refreshBtnActionPerformed

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
    private javax.swing.JTable DownloadTable;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton downloadBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pauseBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton resumeBtn;
    private javax.swing.JTextField urlTextField;
    // End of variables declaration//GEN-END:variables
}
